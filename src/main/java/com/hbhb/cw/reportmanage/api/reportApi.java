package com.hbhb.cw.reportmanage.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface reportApi {
    @GetMapping("/count")
    Long countNotice(@RequestParam("id") Integer id);
}
