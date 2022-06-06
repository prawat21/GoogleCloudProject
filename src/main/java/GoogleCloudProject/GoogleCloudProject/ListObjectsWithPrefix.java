package GoogleCloudProject.GoogleCloudProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class ListObjectsWithPrefix {
	public static List<String> listObjectsWithPrefix(String projectId, String bucketName, String directoryPrefix) {

		Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();

		Page<Blob> blobs = storage.list(bucketName, Storage.BlobListOption.prefix(directoryPrefix),
				Storage.BlobListOption.currentDirectory());

		List<String> list = new ArrayList<String>();
		for (Blob blob : blobs.iterateAll()) {
			// System.out.println(blob.getName());
			list.add(blob.getName());
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(Arrays.toString(list.toArray()));

		return list;
	}

	public static List<String> listFilesObjectsWithPrefix(String projectId, String bucketName, String directoryPrefix) {

		Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();

		Page<Blob> blobs = storage.list(bucketName, Storage.BlobListOption.prefix(directoryPrefix)
		// Storage.BlobListOption.currentDirectory()
		);

		List<String> list = new ArrayList<String>();
		for (Blob blob : blobs.iterateAll()) {
			// System.out.println(blob.getName());
			list.add(blob.getName());
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(Arrays.toString(list.toArray()));

		return list;
	}
}