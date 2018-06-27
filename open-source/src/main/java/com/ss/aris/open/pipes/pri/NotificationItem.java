package com.ss.aris.open.pipes.pri;

import android.content.Intent;
import com.ss.aris.open.pipes.impl.ShareIntent;

public class NotificationItem {

    public long timestamp;
    public int pid = 0;
    public String executable = "";
    public String title = "";
    public String content = "";
    public String image = "";
    public ShareIntent intent;

    public NotificationItem(String title, String content, String url) {
        this();
        this.title = title;
        this.content = content;

        intent = new ShareIntent(Intent.ACTION_VIEW);
        intent.setData(url);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, url);
    }

    public NotificationItem() {
        timestamp = System.currentTimeMillis();
    }

}