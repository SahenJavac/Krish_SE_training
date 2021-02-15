package lk.happyeats.rentcloud.rentprocesstask.service;

import org.springframework.stereotype.Service;


@Service
public class RentProcessServiceImpl implements RentProcessService {



    @Override
    public boolean validateDL(String telNumber) {
        return telNumber.length() > 5;
    }

}
