package GoogleCloudProject.GoogleCloudProject;
import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class ListObjects {
  public static void listObjects(String projectId, String bucketName) {
    // The ID of your GCP project
		projectId = "am-kube-stg";

		// The ID of your GCS bucket
		 bucketName = "eeq-us-east4-private-incentives-stg";

    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();
    Page<Blob> blobs = storage.list(bucketName);

    for (Blob blob : blobs.iterateAll()) {
      System.out.println(blob.getName());
    }
  }
}