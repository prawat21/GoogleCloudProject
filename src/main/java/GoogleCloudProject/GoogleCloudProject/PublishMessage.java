package GoogleCloudProject.GoogleCloudProject;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.apache.juneau.serializer.SerializeException;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.core.ApiFuture;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;

import pojo.Root;

public class PublishMessage {

	public static void main(String... args) throws Exception {
		String projectId = "am-kube-stg";
		String topicId = "approved-campaign-feed-stg";

	}

	public static void publishermessage(String projectId, String topicId)
			throws IOException, ExecutionException, InterruptedException, ParseException, SerializeException {
		TopicName topicName = TopicName.of(projectId, topicId);

		Publisher publisher = null;
		try {
			// Create a publisher instance with default settings bound to the topic
			publisher = Publisher.newBuilder(topicName).build();
			String message = CampaignMessage.getMessage(UUIDGenerator.uuidGenerator(),
			UUIDGenerator.uuidGenerator(),
			UUIDGenerator.uuidGenerator());
			JsonSetter jsonset = new JsonSetter();
			Root jsonData = jsonset.pojoToJSON();
			ObjectMapper mapper = new ObjectMapper();
			String writeValueAsString = mapper.writeValueAsString(jsonData);
			ByteString data = ByteString.copyFromUtf8(writeValueAsString);
			PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(data).build();
			System.out.println(writeValueAsString);

			// Once published, returns a server-assigned message id (unique within a topic)
			ApiFuture<String> messageIdFuture = publisher.publish(pubsubMessage);
			String messageId = messageIdFuture.get();
			System.out.println("Published message ID: " + messageId);
		} finally {
			if (publisher != null) {
				// When finished with the publisher, shutdown to free up resources.
				publisher.shutdown();
				publisher.awaitTermination(1, TimeUnit.MINUTES);
			}
		}
	}
}