package edu.miu.cs.cs425.fairfieldlibraryapp.service;

import edu.miu.cs.cs425.fairfieldlibraryapp.model.Publisher;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PublisherService {

    public abstract List<Publisher> getPublishers();
    public abstract Page<Publisher> getPublishers(int pageNo);
    Publisher addNewPublisher(Publisher newPublisher);
    Publisher updatePublisher(Integer publisherId, Publisher editedPublisher);
    Publisher getPublisherById(Integer publisherId);
    void deletePublisherById(Integer publisherId);

    Publisher findPublisherByName(String publisherName);

}
