import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;

/**
 * Created by Arg on 23.11.2015.
 */
public class Main {
    public static void main(String[] a) {
        Cluster cluster = CouchbaseCluster.create();
        Bucket defaultBucket = cluster.openBucket();
        Bucket beerSampleBucket = cluster.openBucket("beer-sample");
        String r = "";
    }
}
