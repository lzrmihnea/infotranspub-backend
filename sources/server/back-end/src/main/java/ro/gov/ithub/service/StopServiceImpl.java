package ro.gov.ithub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.gov.ithub.base.BaseServiceImpl;
import ro.gov.ithub.entity.Stop;
import ro.gov.ithub.repository.StopRepository;

@Service
public class StopServiceImpl extends BaseServiceImpl<Stop, Integer> implements StopService {

    @Autowired
    public StopServiceImpl(StopRepository stopRepository) {
        super(stopRepository);
    }
}
