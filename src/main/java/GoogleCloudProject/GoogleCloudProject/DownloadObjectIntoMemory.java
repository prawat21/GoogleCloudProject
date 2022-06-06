package GoogleCloudProject.GoogleCloudProject;

import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.nio.charset.StandardCharsets;

public class DownloadObjectIntoMemory {
  public static void downloadObjectIntoMemory(
      String projectId, String bucketName, String objectName) {
	// The ID of your GCP project
			projectId = "am-kube-stg";

			// The ID of your GCS bucket
			bucketName = "eeq-us-east4-private-incentives-stg";

			// The ID of your GCS object
			objectName =
			 "/IncentiveMenuCalculator/IncentiveMenuCalculator-VehicleRecommendation/ProcessedDealers/Approved/id=Audi/dt=20220418/AU0046/file=AU0046_080045.json";
			//objectName = "AU0046_080045.json";

    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();
    byte[] content = storage.readAllBytes(bucketName, objectName);
    System.out.println(
        "The contents of "
            + objectName
            + " from bucket name "
            + bucketName
            + " are: "
            + new String(content, StandardCharsets.UTF_8));
  }
}