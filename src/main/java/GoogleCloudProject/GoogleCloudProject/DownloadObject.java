package GoogleCloudProject.GoogleCloudProject;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.nio.file.Paths;

public class DownloadObject {
	public static void main(String[] args) throws Exception {
		// The ID of your GCP project
		String projectId = "am-kube-stg";

		// The ID of your GCS bucket
		String bucketName = "eeq-us-east4-private-incentives-stg";

		// The ID of your GCS object
		// String objectName =
		// "eeq-us-east4-private-incentives-stg/IncentiveMenuCalculator/IncentiveMenuCalculator-VehicleRecommendation/ProcessedDealers/Approved/id=Audi/dt=20220418/AU0046/file=AU0046_080045.json";
		String objectName = "AU0046_080045.json";
		// The path to which the file should be downloaded
		String destFilePath = "C:\\Users\\prawat\\IMCProcessedFile";

		downloadObject(projectId, bucketName, objectName, destFilePath);

	}

	public static void downloadObject(String projectId, String bucketName, String objectName, String destFilePath) {
		Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();

		Blob blob = storage.get(BlobId.of(bucketName, objectName));
		blob.downloadTo(Paths.get(destFilePath));

		System.out
				.println("Downloaded object " + objectName + " from bucket name " + bucketName + " to " + destFilePath);

		// String directoryPrefix =
		// "eeq-us-east4-private-incentives-stg/IncentiveMenuCalculator/IncentiveMenuCalculator-VehicleRecommendation/ProcessedDealers/Approved/id=Audi/dt=20220418/AU0046/file=AU0046_080045.json/";

		/*
		 * Storage storage =
		 * StorageOptions.newBuilder().setProjectId(projectId).build().getService();
		 * 
		 * Page<Blob> blobs = storage.list(bucketName,
		 * Storage.BlobListOption.prefix(directoryPrefix),
		 * Storage.BlobListOption.currentDirectory());
		 * 
		 * for (Blob blob : blobs.iterateAll()) { System.out.println(blob.getName());
		 * blob.downloadTo(Paths.get(destFilePath)); }
		 * 
		 * 
		 * Storage storage =
		 * StorageOptions.newBuilder().setProjectId(projectId).build().getService();
		 * byte[] content = storage.readAllBytes(bucketName, objectName); // Blob blob =
		 * storage.get(BlobId.of(bucketName, objectName)); // Blob blob =
		 * storage.get(bucketName); //blob.downloadTo(Paths.get(destFilePath));
		 * 
		 * System.out.println( "Downloaded object " + objectName + " from bucket name "
		 * + bucketName + " to " + destFilePath);
		 */
	}
}