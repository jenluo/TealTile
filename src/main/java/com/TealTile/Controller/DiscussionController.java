package com.TealTile.Controller;

import com.TealTile.Service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DiscussionController {
    @Autowired
    DiscussionService discussionService;

    public void handleSendMessage(String message) {}

    public void handleShowMessages(String discussionId) {}
}
