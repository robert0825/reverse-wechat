package org.xwalk.core;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.webkit.ValueCallback;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class XWalkFileChooser
{
  private static final String ALL_AUDIO_TYPES = "audio/*";
  private static final String ALL_IMAGE_TYPES = "image/*";
  private static final String ALL_VIDEO_TYPES = "video/*";
  private static final String ANY_TYPES = "*/*";
  private static final String AUDIO_TYPE = "audio/";
  private static final String IMAGE_TYPE = "image/";
  public static final int INPUT_FILE_REQUEST_CODE = 1;
  private static final String PATH_PREFIX = "file:";
  private static final String SPLIT_EXPRESSION = ",";
  private static final String TAG = "XWalkFileChooser";
  private static final String VIDEO_TYPE = "video/";
  private static final String WRITE_EXTERNAL_STORAGE = "android.permission.WRITE_EXTERNAL_STORAGE";
  private Activity mActivity;
  private String mCameraPhotoPath;
  private ValueCallback<Uri> mFilePathCallback;
  
  public XWalkFileChooser(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }
  
  private boolean canWriteExternalStorage()
  {
    try
    {
      boolean bool = Arrays.asList(this.mActivity.getPackageManager().getPackageInfo(this.mActivity.getPackageName(), 4096).requestedPermissions).contains("android.permission.WRITE_EXTERNAL_STORAGE");
      return bool;
    }
    catch (NullPointerException localNullPointerException)
    {
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
  }
  
  private File createImageFile()
  {
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      Log.e("XWalkFileChooser", "External storage is not mounted.");
      return null;
    }
    Object localObject = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    localObject = "JPEG_" + (String)localObject + "_";
    File localFile = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    try
    {
      localObject = File.createTempFile((String)localObject, ".jpg", localFile);
      Log.d("XWalkFileChooser", "Created image file: " + ((File)localObject).getAbsolutePath());
      return (File)localObject;
    }
    catch (IOException localIOException)
    {
      Log.e("XWalkFileChooser", "Unable to create Image File, please make sure permission 'WRITE_EXTERNAL_STORAGE' was added.");
    }
    return null;
  }
  
  private boolean deleteImageFile()
  {
    if ((this.mCameraPhotoPath == null) || (!this.mCameraPhotoPath.contains("file:"))) {
      return false;
    }
    String str = this.mCameraPhotoPath.split("file:")[1];
    boolean bool = new File(str).delete();
    Log.d("XWalkFileChooser", "Delete image file: " + str + " result: " + bool);
    return bool;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (this.mFilePathCallback != null))
    {
      Log.d("XWalkFileChooser", "Activity result: " + paramInt2);
      if (-1 != paramInt2) {
        break label137;
      }
      if ((paramIntent == null) || ((paramIntent.getAction() == null) && (paramIntent.getData() == null)))
      {
        if (this.mCameraPhotoPath == null) {
          break label146;
        }
        paramIntent = Uri.parse(this.mCameraPhotoPath);
        if (paramIntent != null) {
          Log.d("XWalkFileChooser", "Received file: " + paramIntent.toString());
        }
        this.mFilePathCallback.onReceiveValue(paramIntent);
        this.mFilePathCallback = null;
      }
    }
    else
    {
      return;
    }
    paramIntent = paramIntent.getDataString();
    if (paramIntent != null) {}
    for (paramIntent = Uri.parse(paramIntent);; paramIntent = null)
    {
      deleteImageFile();
      break;
      label137:
      if (paramInt2 == 0) {
        deleteImageFile();
      }
      label146:
      paramIntent = null;
      break;
    }
  }
  
  public boolean showFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    this.mFilePathCallback = paramValueCallback;
    Intent localIntent1 = new Intent("android.media.action.IMAGE_CAPTURE");
    paramValueCallback = localIntent1;
    if (localIntent1.resolveActivity(this.mActivity.getPackageManager()) != null)
    {
      paramValueCallback = createImageFile();
      if (paramValueCallback == null) {
        break label208;
      }
      this.mCameraPhotoPath = ("file:" + paramValueCallback.getAbsolutePath());
      localIntent1.putExtra("PhotoPath", this.mCameraPhotoPath);
      localIntent1.putExtra("output", Uri.fromFile(paramValueCallback));
    }
    Intent localIntent2;
    Intent localIntent3;
    ArrayList localArrayList;
    label208:
    for (paramValueCallback = localIntent1;; paramValueCallback = null)
    {
      localIntent2 = new Intent("android.media.action.VIDEO_CAPTURE");
      localIntent3 = new Intent("android.provider.MediaStore.RECORD_SOUND");
      localIntent1 = new Intent("android.intent.action.GET_CONTENT");
      localIntent1.addCategory("android.intent.category.OPENABLE");
      localArrayList = new ArrayList();
      if ((paramString1.contains(",")) || (paramString1.contains("*/*"))) {
        break label299;
      }
      if (!paramString2.equals("true")) {
        break label271;
      }
      if (!paramString1.startsWith("image/")) {
        break;
      }
      if (paramValueCallback == null) {
        break label299;
      }
      this.mActivity.startActivityForResult(paramValueCallback, 1);
      Log.d("XWalkFileChooser", "Started taking picture");
      return true;
    }
    if (paramString1.startsWith("video/"))
    {
      this.mActivity.startActivityForResult(localIntent2, 1);
      Log.d("XWalkFileChooser", "Started camcorder");
      return true;
    }
    if (paramString1.startsWith("audio/"))
    {
      this.mActivity.startActivityForResult(localIntent3, 1);
      Log.d("XWalkFileChooser", "Started sound recorder");
      return true;
      label271:
      if (!paramString1.startsWith("image/")) {
        break label417;
      }
      if (paramValueCallback != null) {
        localArrayList.add(paramValueCallback);
      }
      localIntent1.setType("image/*");
    }
    for (;;)
    {
      label299:
      if ((localArrayList.isEmpty()) && (canWriteExternalStorage()))
      {
        if (paramValueCallback != null) {
          localArrayList.add(paramValueCallback);
        }
        localArrayList.add(localIntent2);
        localArrayList.add(localIntent3);
        localIntent1.setType("*/*");
      }
      paramValueCallback = new Intent("android.intent.action.CHOOSER");
      paramValueCallback.putExtra("android.intent.extra.INTENT", localIntent1);
      if (!localArrayList.isEmpty()) {
        paramValueCallback.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])localArrayList.toArray(new Intent[0]));
      }
      this.mActivity.startActivityForResult(paramValueCallback, 1);
      Log.d("XWalkFileChooser", "Started chooser");
      return true;
      label417:
      if (paramString1.startsWith("video/"))
      {
        localArrayList.add(localIntent2);
        localIntent1.setType("video/*");
      }
      else if (paramString1.startsWith("audio/"))
      {
        localArrayList.add(localIntent3);
        localIntent1.setType("audio/*");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\org\xwalk\core\XWalkFileChooser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */