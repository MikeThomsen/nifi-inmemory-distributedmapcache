package org.apache.nifi.controller.distributedmapcache;

import org.apache.nifi.annotation.documentation.CapabilityDescription;
import org.apache.nifi.annotation.documentation.Tags;
import org.apache.nifi.annotation.lifecycle.OnDisabled;
import org.apache.nifi.annotation.lifecycle.OnEnabled;
import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.controller.AbstractControllerService;
import org.apache.nifi.controller.ConfigurationContext;
import org.apache.nifi.distributed.cache.client.Deserializer;
import org.apache.nifi.distributed.cache.client.DistributedMapCacheClient;
import org.apache.nifi.distributed.cache.client.Serializer;
import org.apache.nifi.processor.util.StandardValidators;
import org.apache.nifi.reporting.InitializationException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Tags({ "map", "cache", "distributed"})
@CapabilityDescription("A DistributedMapCacheClient that wraps Guava.")
public class InMemoryDistributedMapCacheClient extends AbstractControllerService implements DistributedMapCacheClient {

    public static final PropertyDescriptor MY_PROPERTY = new PropertyDescriptor
            .Builder().name("MY_PROPERTY")
            .displayName("My Property")
            .description("Example Property")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    private static final List<PropertyDescriptor> properties = Collections.unmodifiableList(Arrays.asList(

    ));

    @Override
    protected List<PropertyDescriptor> getSupportedPropertyDescriptors() {
        return properties;
    }

    /**
     * @param context
     *            the configuration context
     * @throws InitializationException
     *             if unable to create a database connection
     */
    @OnEnabled
    public void onEnabled(final ConfigurationContext context) throws InitializationException {

    }

    @OnDisabled
    public void shutdown() {

    }

    @Override
    public <K, V> boolean putIfAbsent(K k, V v, Serializer<K> serializer, Serializer<V> serializer1) throws IOException {
        return false;
    }

    @Override
    public <K, V> V getAndPutIfAbsent(K k, V v, Serializer<K> serializer, Serializer<V> serializer1, Deserializer<V> deserializer) throws IOException {
        return null;
    }

    @Override
    public <K> boolean containsKey(K k, Serializer<K> serializer) throws IOException {
        return false;
    }

    @Override
    public <K, V> void put(K k, V v, Serializer<K> serializer, Serializer<V> serializer1) throws IOException {

    }

    @Override
    public <K, V> V get(K k, Serializer<K> serializer, Deserializer<V> deserializer) throws IOException {
        return null;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public <K> boolean remove(K k, Serializer<K> serializer) throws IOException {
        return false;
    }

    @Override
    public long removeByPattern(String s) throws IOException {
        return 0;
    }
}
