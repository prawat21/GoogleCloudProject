package GoogleCloudProject.GoogleCloudProject;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.api.gax.paging.Page;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.common.collect.Lists;

public class GCPLogin {
	static void authExplicit(String jsonPath) throws IOException {
	  // You can specify a credential file by providing a path to GoogleCredentials.
	  // Otherwise credentials are read from the GOOGLE_APPLICATION_CREDENTIALS environment variable.
	  GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(jsonPath))
	        .createScoped(Lists.newArrayList("https://www.googleapis.com/auth/cloud-platform"));
	  Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();
	
	  System.out.println("Buckets:");
	  Page<Bucket> buckets = storage.list();
	  for (Bucket bucket : buckets.iterateAll()) {
	    System.out.println(bucket.toString());
	  }
	}
}

