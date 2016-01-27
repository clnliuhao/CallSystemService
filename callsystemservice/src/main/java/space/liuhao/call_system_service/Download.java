package space.liuhao.call_system_service;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;

/**
 * 下载服务Api调用封装
 *
 * @author 刘浩 2016-01-27 17-31
 * @version 1.0.0
 */
public class Download {
    /**
     * 向系统下载管理器中添加一个下载任务
     *
     * @param context 上下文实体
     * @param fileUrl 待下载的文件url
     * @return 在系统内唯一的代表该下载任务的Id号
     */
    public static long downloadFile(Context context, String fileUrl) {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(fileUrl);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        return downloadManager.enqueue(request);
    }
}
