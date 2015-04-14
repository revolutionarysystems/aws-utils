package uk.co.revsys.kinesis;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.kinesis.clientlibrary.lib.worker.KinesisClientLibConfiguration;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

public class IdGeneratingKinesisClientLibConfiguration extends KinesisClientLibConfiguration{

    public IdGeneratingKinesisClientLibConfiguration(String applicationName, String streamName, AWSCredentialsProvider credentialsProvider) throws UnknownHostException {
        super(applicationName, streamName, credentialsProvider, InetAddress.getLocalHost().getCanonicalHostName() + ":" + UUID.randomUUID());
    }

}
