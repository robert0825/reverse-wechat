package org.xwalk.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.AsyncTask;
import com.tencent.xweb.util.BSpatch;
import com.tencent.xweb.util.a;
import com.tencent.xweb.util.c;
import com.tencent.xweb.util.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class XWalkUpdater
{
  private static final String ANDROID_MARKET_DETAILS = "market://details?id=";
  public static final int ERROR_DOPATCH_FAILED = -3;
  public static final int ERROR_DOPATCH_MD5_FAILED = -4;
  public static final int ERROR_DOWNLOAD_FAILED = -1;
  public static final int ERROR_DOWNLOAD_MD5_FAILED = -2;
  public static final int ERROR_EXTRACT_RESOURCE_FAILED = -5;
  public static final int ERROR_NONE = 0;
  private static final String GOOGLE_PLAY_PACKAGE = "com.android.vending";
  private static final String TAG = "XWalkLib";
  public XWalkBackgroundUpdateListener mBackgroundUpdateListener;
  private Runnable mCancelCommand;
  private Context mContext;
  private XWalkDialogManager mDialogManager;
  private Runnable mDownloadCommand;
  private XWalkUpdateListener mUpdateListener;
  
  public XWalkUpdater(XWalkBackgroundUpdateListener paramXWalkBackgroundUpdateListener, Context paramContext)
  {
    this.mBackgroundUpdateListener = paramXWalkBackgroundUpdateListener;
    this.mContext = paramContext;
  }
  
  public XWalkUpdater(XWalkUpdateListener paramXWalkUpdateListener, Context paramContext)
  {
    this.mUpdateListener = paramXWalkUpdateListener;
    this.mContext = paramContext;
    this.mDialogManager = new XWalkDialogManager(paramContext);
  }
  
  public XWalkUpdater(XWalkUpdateListener paramXWalkUpdateListener, Context paramContext, XWalkDialogManager paramXWalkDialogManager)
  {
    this.mUpdateListener = paramXWalkUpdateListener;
    this.mContext = paramContext;
    this.mDialogManager = paramXWalkDialogManager;
  }
  
  public static boolean onDoPatch(String paramString, int paramInt1, int paramInt2)
  {
    Log.i("XWalkLib", "onDoPatch:" + paramString + ",currentVersion:" + paramInt1 + ",newVersion:" + paramInt2);
    if (!new File(paramString).exists())
    {
      Log.e("XWalkLib", "onDoPatch no patch zip file");
      return false;
    }
    if (!XWalkDecompressor.decompressDownloadPatchZip(paramString, XWalkEnvironment.getPatchZipTempDecompressPath(paramInt2)))
    {
      Log.e("XWalkLib", "onDoPatch decompress zip error");
      e.fx(37L);
      return false;
    }
    paramString = PatchFileConfigParser.getPatchFileConfigList(paramInt2);
    if (paramString == null)
    {
      Log.e("XWalkLib", "onDoPatch patchFileConfigList = null");
      e.fx(38L);
      return false;
    }
    if (!a.fI(XWalkEnvironment.getExtractedCoreDir(paramInt1), XWalkEnvironment.getExtractedCoreDir(paramInt2)))
    {
      Log.e("XWalkLib", "onDoPatch copy all extraced file error");
      e.fx(39L);
      return false;
    }
    Log.i("XWalkLib", "onDoPatch copy all extraced file finished");
    Object localObject1 = new ArrayList();
    Object localObject2 = paramString.iterator();
    PatchFileConfig localPatchFileConfig;
    while (((Iterator)localObject2).hasNext())
    {
      localPatchFileConfig = (PatchFileConfig)((Iterator)localObject2).next();
      if (localPatchFileConfig.isTypeAdd()) {
        ((ArrayList)localObject1).add(localPatchFileConfig);
      }
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (PatchFileConfig)((Iterator)localObject1).next();
      if (!a.eR(XWalkEnvironment.getPatchZipTempDecompressFilePath(paramInt2, ((PatchFileConfig)localObject2).originalFileName), XWalkEnvironment.getExtractedCoreFile(paramInt2, ((PatchFileConfig)localObject2).originalFileName)))
      {
        Log.e("XWalkLib", "onDoPatch add file error:" + localObject2);
        e.fx(40L);
      }
      else
      {
        Log.i("XWalkLib", "onDoPatch add file:" + localObject2);
      }
    }
    Log.i("XWalkLib", "onDoPatch add file finished");
    localObject1 = new ArrayList();
    localObject2 = paramString.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localPatchFileConfig = (PatchFileConfig)((Iterator)localObject2).next();
      if (localPatchFileConfig.isTypeRemove()) {
        ((ArrayList)localObject1).add(localPatchFileConfig);
      }
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (PatchFileConfig)((Iterator)localObject1).next();
      if (!a.deleteFile(XWalkEnvironment.getExtractedCoreFile(paramInt2, ((PatchFileConfig)localObject2).originalFileName)))
      {
        Log.e("XWalkLib", "onDoPatch delete file error:" + localObject2);
        e.fx(41L);
      }
      else
      {
        Log.i("XWalkLib", "onDoPatch delete file:" + localObject2);
      }
    }
    Log.i("XWalkLib", "onDoPatch remove file finished");
    localObject1 = new ArrayList();
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      localObject2 = (PatchFileConfig)paramString.next();
      if (((PatchFileConfig)localObject2).isTypeModify()) {
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    paramString = ((ArrayList)localObject1).iterator();
    while (paramString.hasNext())
    {
      localObject2 = (PatchFileConfig)paramString.next();
      if (((PatchFileConfig)localObject2).isExtractedFile())
      {
        if (BSpatch.ao(XWalkEnvironment.getExtractedCoreFile(paramInt2, ((PatchFileConfig)localObject2).originalFileName), XWalkEnvironment.getPatchZipTempDecompressFilePath(paramInt2, ((PatchFileConfig)localObject2).patchFileName), XWalkEnvironment.getExtractedCoreFile(paramInt2, ((PatchFileConfig)localObject2).originalFileName)) < 0)
        {
          Log.e("XWalkLib", "onDoPatch patch error file:" + localObject2);
          return false;
        }
        Log.i("XWalkLib", "onDoPatch patch file finished");
      }
    }
    Log.i("XWalkLib", "onDoPatch patch file finished");
    paramString = ((ArrayList)localObject1).iterator();
    while (paramString.hasNext())
    {
      localObject1 = (PatchFileConfig)paramString.next();
      if (((PatchFileConfig)localObject1).isOriginalFileTypeApk()) {
        if (BSpatch.ao(XWalkEnvironment.getDownloadApkPath(paramInt1), XWalkEnvironment.getPatchZipTempDecompressFilePath(paramInt2, ((PatchFileConfig)localObject1).patchFileName), XWalkEnvironment.getDownloadApkPath(paramInt2)) < 0)
        {
          Log.e("XWalkLib", "onDoPatch apk patch error file:" + localObject1);
          return false;
        }
      }
    }
    Log.i("XWalkLib", "onDoPatch apk patch finished");
    return true;
  }
  
  public static Integer onHandleFile(UpdateConfig paramUpdateConfig)
  {
    String str1 = paramUpdateConfig.getDownloadPath();
    String str2 = XWalkEnvironment.getExtractedCoreDir(paramUpdateConfig.apkVer);
    Log.d("XWalkLib", "Download mode extract dir: " + str2);
    if ((paramUpdateConfig.isMatchMd5) && (!c.fJ(str1, paramUpdateConfig.downloadFileMd5)))
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "downloaded apk md5 check failed");
      return Integer.valueOf(-2);
    }
    if (paramUpdateConfig.isPatchUpdate)
    {
      if (!onDoPatch(str1, XWalkEnvironment.getAvailableVersion(), paramUpdateConfig.apkVer))
      {
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "patch update mode ,but patch error");
        return Integer.valueOf(-3);
      }
      if ((paramUpdateConfig.isMatchMd5) && (!FileListMD5Checker.checkFileListMd5(paramUpdateConfig.apkVer, XWalkEnvironment.getPatchFileListConfig(paramUpdateConfig.apkVer))))
      {
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "patch update mode, but md5 not match");
        e.fx(36L);
        return Integer.valueOf(-4);
      }
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "do patch sucsess");
    }
    while (!XWalkDecompressor.extractResource(XWalkEnvironment.getDownloadApkPath(paramUpdateConfig.apkVer), str2))
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "extract faield");
      return Integer.valueOf(-5);
      if (!XWalkDecompressor.decompressDownloadFullZip(str1, paramUpdateConfig.apkVer))
      {
        e.fx(32L);
        return Integer.valueOf(-5);
      }
      if ((paramUpdateConfig.isMatchMd5) && (!FileListMD5Checker.checkFileListMd5(paramUpdateConfig.apkVer, XWalkEnvironment.getDownloadZipFileListConfig(paramUpdateConfig.apkVer))))
      {
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "patch update mode, but md5 not match");
        e.fx(33L);
        return Integer.valueOf(-4);
      }
    }
    XWalkEnvironment.setAvailableVersion(paramUpdateConfig.apkVer, paramUpdateConfig.versionDetail);
    XWalkInitializer.addXWalkInitializeLog("XWalkLib", "do update sucsess");
    return Integer.valueOf(0);
  }
  
  public static void updateLocalXWalkRuntime()
  {
    onHandleFile(new UpdateConfig("download_mode_package.zip", false, 999));
  }
  
  private boolean verifyDownloadedXWalkRuntime(String paramString)
  {
    paramString = this.mContext.getPackageManager().getPackageArchiveInfo(paramString, 64);
    if (paramString == null)
    {
      Log.e("XWalkLib", "The downloaded XWalkRuntimeLib.apk is invalid!");
      return false;
    }
    try
    {
      PackageInfo localPackageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 64);
      if ((paramString.signatures == null) || (localPackageInfo.signatures == null))
      {
        Log.e("XWalkLib", "No signature in package info");
        return false;
      }
      if (paramString.signatures.length != localPackageInfo.signatures.length)
      {
        Log.e("XWalkLib", "signatures length not equal");
        return false;
      }
      int i = 0;
      while (i < paramString.signatures.length)
      {
        Log.d("XWalkLib", "Checking signature " + i);
        if (!localPackageInfo.signatures[i].equals(paramString.signatures[i]))
        {
          Log.e("XWalkLib", "signatures do not match");
          return false;
        }
        i += 1;
      }
      Log.d("XWalkLib", "Signature check passed");
      return true;
    }
    catch (PackageManager.NameNotFoundException paramString) {}
    return false;
  }
  
  public boolean cancelBackgroundDownload()
  {
    return XWalkLibraryLoader.cancelHttpDownload();
  }
  
  public void cancelXWalkRuntimeDownload()
  {
    if (XWalkLibraryLoader.isDownloading())
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "canceled download apk");
      XWalkLibraryLoader.cancelHttpDownload();
    }
  }
  
  public boolean dismissDialog()
  {
    if ((this.mDialogManager == null) || (!this.mDialogManager.isShowingDialog())) {
      return false;
    }
    this.mDialogManager.dismissDialog();
    return true;
  }
  
  public boolean updateXWalkRuntime(UpdateConfig paramUpdateConfig)
  {
    if (XWalkLibraryLoader.isDownloading())
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "Other initialization or download is proceeding");
      return false;
    }
    if (this.mBackgroundUpdateListener != null)
    {
      if ((paramUpdateConfig == null) || (!paramUpdateConfig.checkValid())) {
        XWalkInitializer.addXWalkInitializeLog("XWalkLib", "royle:XWalkUpdater updateXWalkRuntime updateConfig is not valid");
      }
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "start download apk");
      XWalkLibraryLoader.startHttpDownload(new BackgroundListener(), this.mContext, paramUpdateConfig);
      return true;
    }
    throw new IllegalArgumentException("Update listener is null");
  }
  
  private class BackgroundListener
    implements XWalkLibraryLoader.DownloadListener
  {
    public BackgroundListener() {}
    
    public void onDownloadCancelled()
    {
      XWalkUpdater.this.mBackgroundUpdateListener.onXWalkUpdateCancelled();
    }
    
    public void onDownloadCompleted(final XWalkUpdater.UpdateConfig paramUpdateConfig)
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "download apk completed, apkver = " + paramUpdateConfig.apkVer);
      new AsyncTask()
      {
        protected Integer doInBackground(Void... paramAnonymousVarArgs)
        {
          return XWalkUpdater.onHandleFile(paramUpdateConfig);
        }
        
        protected void onPostExecute(Integer paramAnonymousInteger)
        {
          if (paramAnonymousInteger.intValue() != 0)
          {
            XWalkUpdater.this.mBackgroundUpdateListener.onXWalkUpdateFailed(paramAnonymousInteger.intValue());
            return;
          }
          XWalkUpdater.this.mBackgroundUpdateListener.onXWalkUpdateCompleted();
        }
      }.execute(new Void[0]);
    }
    
    public void onDownloadFailed(int paramInt1, int paramInt2)
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkLib", "download apk failed");
      XWalkUpdater.this.mBackgroundUpdateListener.onXWalkUpdateFailed(-1);
    }
    
    public void onDownloadStarted()
    {
      XWalkUpdater.this.mBackgroundUpdateListener.onXWalkUpdateStarted();
    }
    
    public void onDownloadUpdated(int paramInt)
    {
      XWalkUpdater.this.mBackgroundUpdateListener.onXWalkUpdateProgress(paramInt);
    }
  }
  
  public static class FileListMD5Checker
  {
    public static boolean checkFileListMd5(int paramInt, String paramString)
    {
      try
      {
        paramString = new BufferedReader(new InputStreamReader(new FileInputStream(new File(paramString))));
        Object localObject;
        do
        {
          do
          {
            localObject = paramString.readLine();
            if (localObject == null) {
              break;
            }
          } while ((localObject == null) || (((String)localObject).isEmpty()));
          localObject = ((String)localObject).split(":");
        } while ((localObject == null) || (localObject.length != 2) || (localObject[0] == null) || (localObject[0].isEmpty()) || (localObject[1] == null) || (localObject[1].isEmpty()) || (checkFileMd5(paramInt, localObject[0], localObject[1])));
        Log.e("XWalkLib", "checkFileListMd5 error name:" + localObject[0] + ",md5:" + localObject[1]);
        return false;
        return true;
      }
      catch (Exception paramString)
      {
        Log.e("XWalkLib", "checkFileListMd5 error:" + paramString.getMessage());
      }
      return false;
    }
    
    private static boolean checkFileMd5(int paramInt, String paramString1, String paramString2)
    {
      if ("base.apk".equals(paramString1)) {}
      for (paramString1 = XWalkEnvironment.getDownloadApkPath(paramInt); c.fJ(paramString1, paramString2); paramString1 = XWalkEnvironment.getExtractedCoreFile(paramInt, paramString1))
      {
        Log.i("XWalkLib", "checkFileMd5 successful path:" + paramString1);
        return true;
      }
      Log.e("XWalkLib", "checkFileMd5 error path:" + paramString1);
      return false;
    }
  }
  
  public static class PatchFileConfig
  {
    public String originalFileName;
    public int originalFileType;
    public String patchEndFileMd5;
    public String patchFileName;
    public int type;
    
    public boolean isExtractedFile()
    {
      return this.originalFileType == 2;
    }
    
    public boolean isOriginalFileTypeApk()
    {
      return this.originalFileType == 1;
    }
    
    public boolean isTypeAdd()
    {
      return this.type == 1;
    }
    
    public boolean isTypeModify()
    {
      return this.type == 2;
    }
    
    public boolean isTypeRemove()
    {
      return this.type == 3;
    }
    
    public String toString()
    {
      return "PatchFileConfig type:" + this.type + ",originalFileType:" + this.originalFileType + ",originalFileName:" + this.originalFileName + ",patchFileName:" + this.patchFileName + ",patchEndFileMd5:" + this.patchEndFileMd5;
    }
  }
  
  public static class PatchFileConfigParser
  {
    private static final String ADD_FLAG = "ADD:";
    private static final int ADD_TYPE = 1;
    private static final int APK_FILE_TYPE = 1;
    private static final String DEL_FLAG = "DEL:";
    private static final int DEL_TYPE = 3;
    private static final int EXTRACTED_FILE_TYPE = 2;
    private static final String MOD_FLAG = "MOD:";
    private static final int MOD_TYPE = 2;
    private static final String PATCH_SUFFIX = ".patch";
    
    public static ArrayList<XWalkUpdater.PatchFileConfig> getPatchFileConfigList(int paramInt)
    {
      for (;;)
      {
        String str;
        int i;
        try
        {
          BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(XWalkEnvironment.getPatchConfig(paramInt)))));
          ArrayList localArrayList = new ArrayList();
          str = localBufferedReader.readLine();
          Object localObject1 = localArrayList;
          if (str != null)
          {
            if ((str == null) || (str.isEmpty())) {
              continue;
            }
            XWalkUpdater.PatchFileConfig localPatchFileConfig;
            if (str.startsWith("ADD:"))
            {
              localObject1 = str.substring(4);
              paramInt = 1;
              localObject1 = ((String)localObject1).split(",");
              int j = localObject1.length;
              i = 0;
              if (i >= j) {
                continue;
              }
              str = localObject1[i];
              if ((str == null) || (str.isEmpty())) {
                break label330;
              }
              localPatchFileConfig = new XWalkUpdater.PatchFileConfig();
              localPatchFileConfig.originalFileName = str;
              localPatchFileConfig.type = paramInt;
              if (paramInt == 2) {
                localPatchFileConfig.patchFileName = (localPatchFileConfig.originalFileName + ".patch");
              }
              if ((paramInt == 2) && (localPatchFileConfig.originalFileName.equals("base.apk")))
              {
                localPatchFileConfig.originalFileType = 1;
                Log.d("XWalkLib", "getPatchFileConfigList config:" + localPatchFileConfig.toString());
                localArrayList.add(localPatchFileConfig);
                break label330;
              }
            }
            else
            {
              if (str.startsWith("MOD:"))
              {
                localObject1 = str.substring(4);
                paramInt = 2;
                continue;
              }
              if (!str.startsWith("DEL:")) {
                break label322;
              }
              localObject1 = str.substring(4);
              paramInt = 3;
              continue;
            }
            localPatchFileConfig.originalFileType = 2;
            continue;
          }
          paramInt = 0;
        }
        catch (Exception localException)
        {
          Log.e("XWalkLib", "getPatchFileConfigList error:" + localException.getMessage());
          localObject2 = null;
          return (ArrayList<XWalkUpdater.PatchFileConfig>)localObject2;
        }
        label322:
        Object localObject2 = str;
        continue;
        label330:
        i += 1;
      }
    }
  }
  
  public static class UpdateConfig
  {
    public int apkVer = -1;
    public String downUrl;
    public String downloadFileMd5;
    public boolean isMatchMd5;
    public boolean isPatchUpdate;
    public String patchEndFileMd5;
    public String versionDetail;
    
    public UpdateConfig(String paramString, boolean paramBoolean, int paramInt)
    {
      this.isMatchMd5 = false;
      this.isPatchUpdate = paramBoolean;
      this.downUrl = paramString;
      this.apkVer = paramInt;
      if (!checkValid()) {
        throw new RuntimeException("royle:UpdateConfig is not valid");
      }
    }
    
    public UpdateConfig(String paramString1, boolean paramBoolean, String paramString2, String paramString3, int paramInt)
    {
      this.isMatchMd5 = true;
      this.downloadFileMd5 = paramString1;
      this.isPatchUpdate = paramBoolean;
      this.patchEndFileMd5 = paramString2;
      this.downUrl = paramString3;
      this.apkVer = paramInt;
      if (!checkValid()) {
        throw new RuntimeException("royle:UpdateConfig is not valid");
      }
    }
    
    public boolean checkValid()
    {
      if ((this.isMatchMd5) && ((this.downloadFileMd5 == null) || (this.downloadFileMd5.isEmpty()))) {}
      while ((this.downUrl == null) || (this.downUrl.isEmpty()) || (this.apkVer == -1) || ((this.isMatchMd5) && (this.isPatchUpdate) && ((this.patchEndFileMd5 == null) || (this.patchEndFileMd5.isEmpty())))) {
        return false;
      }
      return true;
    }
    
    public String getDownloadPath()
    {
      if (checkValid())
      {
        if (this.isPatchUpdate) {
          return XWalkEnvironment.getDownloadPatchPath(this.apkVer);
        }
        return XWalkEnvironment.getDownloadZipDir(this.apkVer);
      }
      throw new RuntimeException("royle:UpdateConfig is not valid");
    }
    
    public String getLogSelf()
    {
      if (checkValid()) {
        return "UpdateConfig isMatchMd5:" + this.isMatchMd5 + " downloadFileMd5:" + this.downloadFileMd5 + ",isPatchUpdate:" + this.isPatchUpdate + ",downUrl:" + this.downUrl + ",apkVer:" + this.apkVer + ",downloadPath:" + getDownloadPath() + ".";
      }
      return "UpdateConfig is not valid";
    }
  }
  
  public static abstract interface XWalkBackgroundUpdateListener
  {
    public abstract void onXWalkUpdateCancelled();
    
    public abstract void onXWalkUpdateCompleted();
    
    public abstract void onXWalkUpdateFailed(int paramInt);
    
    public abstract void onXWalkUpdateProgress(int paramInt);
    
    public abstract void onXWalkUpdateStarted();
  }
  
  public static abstract interface XWalkUpdateListener
  {
    public abstract void onXWalkUpdateCancelled();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\org\xwalk\core\XWalkUpdater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */