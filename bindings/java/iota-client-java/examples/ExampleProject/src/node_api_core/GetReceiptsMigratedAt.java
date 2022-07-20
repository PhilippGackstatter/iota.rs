package node_api_core;

import org.iota.Client;
import org.iota.types.ClientConfig;
import org.iota.types.ClientException;
import org.iota.types.Receipt;

public class GetReceiptsMigratedAt {
    public static void main(String[] args) throws ClientException {
        // Build the client.
        Client client = new Client(new ClientConfig("{ \"nodes\": [ \"https://api.testnet.shimmer.network\" ], \"nodeSyncEnabled\": true }"));

        // Set up a milestone index for this example.
        int milestoneIndex = ExampleUtils.setUpMilestoneIndex(client);

        // Get the receipts at the specific milestone index.
        Receipt[] receipts = client.getReceiptsMigratedAt(milestoneIndex);

        // Print the receipts.
        for (Receipt receipt : receipts)
            System.out.println(receipt);
    }
}