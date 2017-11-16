package com.tencent.liteav.basic.serverconfig;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.util.Base64;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.PrivateKey;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TXCConfigCenter
{
  private static final String AGC = "AGC";
  private static final String BLACK_LIST = "BlackList";
  private static final String CHECKCOUNT = "CheckCount";
  private static final String CPU = "CPU";
  private static final String CPU_MAX = "CPU_MAX";
  protected static final String DEC_ZIPFILENAME = "serverconfig_dec.zip";
  private static final String EXPIREDTIME = "expired_time";
  private static final String EXPOSURECOMPENSATION = "ExposureCompensation";
  private static final String EXPOSURECONFIG = "ExposureWhiteConfig";
  private static final String FPS = "FPS";
  private static final String FPS_MIN = "FPS_MIN";
  private static final String HWAACCodec = "HWAACCodec";
  public static final int HWBLACK = 0;
  private static final String HWBLACK_CONFIG = "HWBlackConfig";
  private static final String HWCONFIGVALUE = "hw_config";
  public static final int HWGRAY = 1;
  private static final String HWMINIAPI = "HWMiniSupportAPI";
  public static final int HWWHITE = 2;
  private static final String HWWHITE_CONFIG = "HWWhiteList";
  private static final String INFO_LIST = "InfoList";
  private static final String LASTMODIFY = "last_modify";
  private static final String LOCALFILENAME = "cloud_config";
  private static final String MANUFACTURE = "Manufacture";
  private static final String MODEL = "Model";
  protected static final String NET_CONFIG_URI = "http://dldir1.qq.com/hudongzhibo/liteavsvrcfg/serverconfig_en.zip";
  public static final String ONSERCONFIGFET = "com.tencent.liteav.basic.serverconfig.get";
  private static final String PROFILE = "profile";
  private static final String SAMPLE_RATE = "SampleRate";
  private static final String SCENE_TYPE = "SceneType";
  public static final int SCENE_TYPE_COMMUNICATION = 2;
  public static final int SCENE_TYPE_LINKMIC = 1;
  private static final String STR_PRIVATEKEY = "MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBAOnmX5h7KCQsoIQ+2ot1dIayWsmA3LU7p0kl1t5T2cbosedcsSGT+YM5bFiVBeAYbAM10WSvzZ2+oexMW7B2RcYZ1qulSR4eNXk74biDy2DmQqXK3qt1ZP4DnpiR+UXVKt6rqdtpDqRk4VGUw33/w3mMOyzkSjueewYB32n/l2JPAgMBAAECgYEA5rzfcyGTQNRRaQREPa0ZzcLmcr/Pem2lojBU3jBjtqhYz/8Nsi0yyHP+YQhpql8NNsGBlk0jjsi/HcdZ8CNMwbRfPYoe9mICe/iKMJ5P3+DtcH7AtE0ckHg01rY8pbqV9EAICijU1BwgbZh9M715HLSCeKwSWBWmpq1aQ/8l7PkCQQD5GFqrmGtMJOfTxaqS5hCHg+VsYpPsb566DEZQIJBWMP7eE58H1rphWMMSQ36c1V/iZuauYO0gYC1UlMfYHsRVAkEA8GIwlFXPG+LnkPENHo2pKORCnY7wo63hjyeQRipHhY7yUJjaPA50wDI7XCGOrJryBCVTOVszEUz4ocHQ0mOQEwJBAOnCPySVTuwQHjaQYzikCpMB5gVGpUbWoQA7kKiVRp58MFG73BwBGLtODxJOoL0RSIAwzP6MGzusxh1/2eMpTFkCQQCk5tboi0z+llPArHwRf6CRurSwHUSbJEddywg/+fUCfCNigtkC5e/VgSATfbnAUrK/gVNsP1HzBlhxruGv0jkdAkEAjNSVhjcoLg1JodbhBmD16vsAUzJpDR6EZIeiXj4pN+hKiDq9+aHEtMxtjFXiqbdKkrUjrzfZKrzQm0wy950BUw==";
  private static final String SWTOHWTHRESHOLD = "SWToHWThreshold";
  private static final String SYSTEMAECCONFIG = "system_aec_config";
  private static final String SYSTEM_AEC_CONFIG = "SystemAECConfig";
  private static final String SYS_AEC = "SystemAEC";
  public static final String TAG = "TXCConfigCenter";
  private static final String TRAECONFIG = "trae_config";
  private static final String TRAE_CONFIG = "TraeConfig";
  private static final String TRAE_CONFIG_VALUE = "ConfigValue";
  private static final String TRAE_FACTORY = "Factory";
  private static final String TRAE_MACHINE_TYPE = "MachineType";
  private static final String UPDATE_FREQUENCY = "UpdateFrequency";
  private static final String WHITE_LIST = "WhiteList";
  protected static final String ZIPFILEPATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/txrtmp/";
  private static Context mContext = null;
  protected static TXCConfigCenter sConfig;
  private Config mConfig = new Config();
  long mExpiredTime = 0L;
  private boolean mIsLoaded = false;
  private boolean mIsUpdating = false;
  String mLastModify = "";
  SharedPreferences.Editor mShareEditor;
  SharedPreferences mSharedPreferences;
  
  public static TXCConfigCenter getInstance()
  {
    if (sConfig == null) {}
    try
    {
      if (sConfig == null) {
        sConfig = new TXCConfigCenter();
      }
      return sConfig;
    }
    finally {}
  }
  
  private void load()
  {
    int i = 0;
    for (;;)
    {
      try
      {
        if (needLoad())
        {
          setLoadFlag(true);
          if (mContext == null) {
            break label653;
          }
          this.mSharedPreferences = mContext.getSharedPreferences("cloud_config", 0);
          if ((this.mSharedPreferences != null) && (this.mSharedPreferences.contains("expired_time"))) {
            this.mShareEditor = this.mSharedPreferences.edit();
          }
        }
        else
        {
          try
          {
            this.mLastModify = this.mSharedPreferences.getString("last_modify", "");
            this.mExpiredTime = this.mSharedPreferences.getLong("expired_time", System.currentTimeMillis());
            this.mConfig.mHWBlackValue = this.mSharedPreferences.getInt("hw_config", 2);
            this.mConfig.mExposureCompensation = this.mSharedPreferences.getInt("ExposureCompensation", 0);
            this.mConfig.mHwWhite_SWToHWThreshold_CPU = this.mSharedPreferences.getInt("CPU", 60);
            this.mConfig.mHwWhite_SWToHWThreshold_FPS = this.mSharedPreferences.getInt("FPS", 70);
            this.mConfig.mHwWhite_SWToHWThreshold_CPU_MAX = this.mSharedPreferences.getInt("CPU_MAX", 80);
            this.mConfig.mHwWhite_SWToHWThreshold_FPS_MIN = this.mSharedPreferences.getInt("FPS_MIN", 50);
            this.mConfig.mHwWhite_SWToHWThreshold_CheckCount = this.mSharedPreferences.getInt("CheckCount", 10);
            this.mConfig.mTraeConfig = this.mSharedPreferences.getString("trae_config", "");
            localObject1 = this.mSharedPreferences.getString("system_aec_config", "");
            TXCLog.i("TXCConfigCenter", "system aec config:" + (String)localObject1);
            boolean bool = ((String)localObject1).isEmpty();
            if (bool) {}
          }
          catch (ClassCastException localClassCastException)
          {
            Object localObject1;
            this.mShareEditor.clear();
            this.mShareEditor.commit();
            TXCLog.d("TXCConfigCenter", "local config is invalid " + localClassCastException);
            continue;
          }
          try
          {
            localObject1 = ((String)localObject1).split(",");
            if ((localObject1 != null) && (localObject1.length >= 5))
            {
              this.mConfig.mEnableAEC = Integer.valueOf(localObject1[0]).intValue();
              this.mConfig.mEnableAGC = Integer.valueOf(localObject1[1]).intValue();
              String[] arrayOfString = localObject1[2].split("\\|");
              if (arrayOfString != null)
              {
                this.mConfig.mRecordSampleRates = new int[arrayOfString.length];
                if (i < arrayOfString.length)
                {
                  this.mConfig.mRecordSampleRates[i] = Integer.valueOf(arrayOfString[i].trim()).intValue();
                  i += 1;
                  continue;
                }
              }
              this.mConfig.mEnableHWAACCodec = Integer.valueOf(localObject1[3]).intValue();
              this.mConfig.mSceneType = localObject1[4];
            }
          }
          catch (Exception localException)
          {
            TXCLog.e("TXCConfigCenter", "load Exception: " + localException.getMessage());
            continue;
          }
          TXCLog.i("TXCConfigCenter", "load config(system aec):" + this.mConfig.mEnableAEC + "," + this.mConfig.mEnableAGC + "," + this.mConfig.mEnableHWAACCodec + "," + this.mConfig.mSceneType + ", model = " + Build.MODEL + ", manufacturer = " + Build.MANUFACTURER + "， board = " + Build.BOARD);
          return;
        }
      }
      finally {}
      loadLocalDefaultConfig(this.mConfig);
      continue;
      label653:
      loadLocalDefaultConfig(this.mConfig);
    }
  }
  
  private void loadLocalDefaultConfig(Config paramConfig)
  {
    try
    {
      parseConfig(new JSONObject("{\n    \"version\": 3,\n\t\"UpdateFrequency\": 1,\n    \"UGCSWMuxerConfig\": {\n        \"InfoList\": [\n            {\n                \"Manufacture\": \"HUAWEI\"\n            }\n        ]\n    },\n    \"HWBlackConfig\": {\n        \"HWMiniSupportAPI\": 17,\n        \"InfoList\": [\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"Model\": \"P6-U06\"\n            },\n            {\n                \"Manufacture\": \"Samsung\",\n                \"Model\": \"SCH-I939(S3)\"\n            },\n            {\n                \"Manufacture\": \"VIVO\",\n                \"Model\": \"vivoX5Pro D\"\n            },\n            {\n                \"Manufacture\": \"金立\",\n                \"Model\": \"GN9006\"\n            },\n            {\n                \"Manufacture\": \"Samsung\",\n                \"Model\": \"A7000\"\n            },\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"Model\": \"HUAWEI NXT-AL10\"\n            },\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"Model\": \"HUAWEI MHA-AL00\"\n            },\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"Model\": \"EVA-AL00\"\n            },\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"Model\": \"EVA-AL10\"\n            },\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"Model\": \"MHA-L29\",\n\t\t\t\t\"Profile\": \"baseline\"\n            },\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"Model\": \"MHA-L00\",\n\t\t\t\t\"Profile\": \"baseline\"\n            },\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"Model\": \"MHA-TL00\",\n\t\t\t\t\"Profile\": \"baseline\"\n            },\n             {\n                 \"Manufacture\": \"HUAWEI\",\n                 \"Model\": \"HUAWEI GRA-UL00\"\n             }\n        ]\n    },\n    \"ExposureWhiteConfig\": {\n        \"InfoList\": [\n            {\n                \"Manufacture\": \"Meizu\",\n                \"Model\": \"MX4 Pro\",\n                \"ExposureCompensation\": 1\n            },\n            {\n                \"Manufacture\": \"Xiaomi\",\n                \"Model\": \"MI 3\",\n                \"ExposureCompensation\": 30\n            },\n            {\n                \"Manufacture\": \"Xiaomi\",\n                \"Model\": \"MI 3C\",\n                \"ExposureCompensation\": 30\n            }\n        ]\n    },\n    \"SystemAECConfig\": {\n        \"__comment__\":\"SceneType(开启系统aec的场景，1为连麦，2为通话)\",\n        \"InfoList\": [\n            {\n                \"Manufacture\": \"vivo\",\n                \"WhiteList\": [{\"Model\":\"vivo X9\"},{\"Model\":\"vivo Y67A\"}],\n                \"BlackList\": [],\n                \"SystemAEC\": 1,\n                \"AGC\": 0,\n                \"SampleRate\": \"48000|16000\",\n                \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n            {\n                \"Manufacture\": \"vivo\",\n                \"WhiteList\": [{\"Model\":\"vivo X9Plus\"},{\"Model\":\"vivo X7Plus\"},{\"Model\":\"vivo X7\"}],\n                \"BlackList\": [{\"Model\":\"vivo Y51A\"}],\n                \"SystemAEC\": 1,\n                \"AGC\": 0,\n                \"SampleRate\": \"16000\",\n                \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n            {\n                \"Manufacture\": \"HUAWEI\",\n                \"WhiteList\": [{\"Model\":\"VTR-TL00\"},{\"Model\":\"HUAWEI GRA-UL00\"},{\"Model\":\"MHA-AL00\"},{\"Model\":\"HUAWEI NXT-AL10\"},{\"Model\":\"PLK-AL10\"},{\"Model\":\"PLK-UL00\"},{\"Model\":\"EVA-AL10\"},{\"Model\":\"HUAWEI MT7-TL10\"}],\n                \"SystemAEC\": 1,\n                \"AGC\": 0,\n                \"SampleRate\": \"48000|16000\",\n                \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n            {\n                \"Manufacture\": \"Xiaomi\",\n                \"WhiteList\": [{\"Model\":\"Redmi Note 2\"},{\"Model\":\"Redmi Note 4\"}],\n                \"SystemAEC\": 1,\n                \"AGC\": 0,\n                \"SampleRate\": \"48000|16000\",\n                \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n            {\n                \"Manufacture\": \"Xiaomi\",\n                \"WhiteList\": [{\"Model\":\"Redmi Note 3\"}],\n                \"SystemAEC\": 1,\n                \"AGC\": 0,\n                \"SampleRate\": \"48000\",\n                \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n            {\n                \"Manufacture\": \"Xiaomi\",\n                \"WhiteList\": [{\"Model\":\"MI 6\"},{\"Model\":\"MI 4\"},{\"Model\":\"MI 3C\"},{\"Model\":\"Mi-4c\"},{\"Model\":\"MI 5\"}],\n                \"BlackList\": [{\"Model\":\"Redmi 4A\"},{\"Model\":\"MI 5X\"}],\n                \"SystemAEC\": 1,\n                \"AGC\": 0,\n                \"SampleRate\": \"16000\",\n                \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n            {\n                \"Manufacture\": \"Google\",\n                \"WhiteList\": [{\"Model\":\"Pixel XL\"}],\n                \"SystemAEC\": 1,\n                \"AGC\": 0,\n                \"SampleRate\": \"48000|16000\",\n                \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n            {\n                \"Manufacture\": \"samsung\",\n                \"WhiteList\": [{\"Model\":\"SM-G9350\"},{\"Model\":\"SM-G9500\"},{\"Model\":\"SM-G950U\"}],\n                \"SystemAEC\": 1,\n                \"AGC\": 0,\n                \"SampleRate\": \"48000|16000\",\n                \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n            {\n                 \"Manufacture\": \"LeMobile\",\n                 \"WhiteList\": [{\"Model\":\"X620\"}],\n                 \"SystemAEC\": 1,\n                 \"AGC\": 0,\n                 \"SampleRate\": \"48000|16000\",\n                 \"HWAACCodec\": 1,\n                \"SceneType\": \"1|2\"\n            },\n             {\n                  \"Manufacture\": \"asus\",\n                  \"WhiteList\": [{\"Model\":\"ASUS_Z00ADB\"}],\n                  \"SystemAEC\": 1,\n                  \"AGC\": 0,\n                  \"SampleRate\": \"48000|16000\",\n                  \"HWAACCodec\": 1,\n                 \"SceneType\": \"1|2\"\n             }\n        ]\n    },\n    \"HWWhiteList\": {\n        \"SWToHWThreshold\": {\n            \"CPU_MAX\": 80,\n            \"FPS_MIN\": 50,\n            \"CPU\": 20,\n            \"FPS\": 70,\n            \"CheckCount\": 10,\n            \"__comment__\": \"软编根据性能切硬编的阈值，avgTotalCPU >= CPU_MAX || avgFPS <= FPS_MIN || (avgAppCPU >= CPU && avgFPS <= FPS) 性能指标满足上述条件则切硬编。CheckCount表示需要做X次有效性能数据采集。\"\n\t\t}\n    },\n    \"TraeConfig\": {\n        \"InfoList\": [\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-AL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-AL10\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-CL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-DL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-TL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"HUAWEI MT7-CL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"HUAWEI MT7-TL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"HUAWEI MT7-TL10\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"HUAWEI NXT-AL10\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"PLK-AL10\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"JTY\",\n            \"MachineType\": \"KT096H\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 12.0\\r\\npreAGCvvolmax 20.0\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"LENOVO\",\n            \"MachineType\": \"Lenovo K900\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nUseHQAEC n\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"LGE\",\n            \"MachineType\": \"Nexus 5\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\ntrae {\\r\\nagc {\\r\\nswitch y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"LGE\",\n            \"MachineType\": \"Nexus 5X\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"M5\",\n            \"MachineType\": \"X5 R1\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 12.0\\r\\npreAGCvvolmax 20.0\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Meizu\",\n            \"MachineType\": \"MX4 Pro\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"A31\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\nagc {\\r\\nswitch y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO A33\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\nagc {\\r\\nswitch y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO A59s\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R7\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R9km\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nMkechoRatio 0\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R9m\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nMkechoRatio 0\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R9s\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 2\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\naec {\\r\\nUseHQAEC y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R9tm\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nMkechoRatio 0\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"samsung\",\n            \"MachineType\": \"SM-G9350\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 17\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nloopback y\\r\\nloop {\\r\\ngap 4\\r\\nbufnum 2\\r\\nvolume 2.0\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nMkechoRatio 1\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 2\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"samsung\",\n            \"MachineType\": \"SM-N9108V\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 12.0\\r\\npreAGCvvolmax 20.0\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"samsung\",\n            \"MachineType\": \"SM-N9200\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 2\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\nprep {\\r\\ndrop_mic_ms 300\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"TCL\",\n            \"MachineType\": \"TCL P501M\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 15.0\\r\\npreAGCvvolmax 23.0\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 3\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\nprep {\\r\\ndrop_mic_ms 300\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 4LTE\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 4W\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 17\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 5\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nloopback y\\r\\nloop {\\r\\ngap 4\\r\\nbufnum 2\\r\\nvolume 0.25\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 5s\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nloopback y\\r\\nloop {\\r\\ngap 4\\r\\nbufnum 2\\r\\n}\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 5s Plus\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nloopback y\\r\\nloop {\\r\\ngap 4\\r\\nbufnum 2\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI NOTE LTE\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 17\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"Redmi Note 3\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nUseHQAEC n\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"ZTE\",\n            \"MachineType\": \"ZTE N928Dt\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 15.0\\r\\npreAGCvvolmax 23.0\\r\\n}\\r\\n}\\r\\n}\"\n          }\n        ]\n    }\n}"), paramConfig);
      return;
    }
    catch (JSONException paramConfig)
    {
      TXCLog.w("TXCConfigCenter", "parseRespon catch ecxeption" + paramConfig);
    }
  }
  
  /* Error */
  private boolean needLoad()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 191	com/tencent/liteav/basic/serverconfig/TXCConfigCenter:mIsLoaded	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +9 -> 17
    //   11: iconst_0
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_1
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	TXCConfigCenter
    //   6	13	1	bool	boolean
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  /* Error */
  private boolean needUpdate()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 189	com/tencent/liteav/basic/serverconfig/TXCConfigCenter:mIsUpdating	Z
    //   6: ifne +18 -> 24
    //   9: aload_0
    //   10: getfield 187	com/tencent/liteav/basic/serverconfig/TXCConfigCenter:mExpiredTime	J
    //   13: lstore_1
    //   14: invokestatic 242	java/lang/System:currentTimeMillis	()J
    //   17: lstore_3
    //   18: lload_1
    //   19: lload_3
    //   20: lcmp
    //   21: ifle +11 -> 32
    //   24: iconst_0
    //   25: istore 5
    //   27: aload_0
    //   28: monitorexit
    //   29: iload 5
    //   31: ireturn
    //   32: iconst_1
    //   33: istore 5
    //   35: goto -8 -> 27
    //   38: astore 6
    //   40: aload_0
    //   41: monitorexit
    //   42: aload 6
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	TXCConfigCenter
    //   13	6	1	l1	long
    //   17	3	3	l2	long
    //   25	9	5	bool	boolean
    //   38	5	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	18	38	finally
  }
  
  private void parseAutoSWHWConfig(JSONObject paramJSONObject, Config paramConfig)
  {
    paramConfig.mHwWhite_SWToHWThreshold_CPU = 60;
    paramConfig.mHwWhite_SWToHWThreshold_FPS = 70;
    paramConfig.mHwWhite_SWToHWThreshold_CPU_MAX = 80;
    paramConfig.mHwWhite_SWToHWThreshold_FPS_MIN = 50;
    paramConfig.mHwWhite_SWToHWThreshold_CheckCount = 10;
    if (paramJSONObject.has("HWWhiteList"))
    {
      paramJSONObject = paramJSONObject.getJSONObject("HWWhiteList");
      if (paramJSONObject.has("SWToHWThreshold"))
      {
        paramJSONObject = paramJSONObject.getJSONObject("SWToHWThreshold");
        if (paramJSONObject.has("CPU"))
        {
          paramConfig.mHwWhite_SWToHWThreshold_CPU = paramJSONObject.getInt("CPU");
          TXCLog.d("TXCConfigCenter", "parseAutoSWHWConfig get SWToHWThreshold.CPU:" + paramConfig.mHwWhite_SWToHWThreshold_CPU);
        }
        if (paramJSONObject.has("FPS"))
        {
          paramConfig.mHwWhite_SWToHWThreshold_FPS = paramJSONObject.getInt("FPS");
          TXCLog.d("TXCConfigCenter", "parseAutoSWHWConfig get SWToHWThreshold.FPS:" + paramConfig.mHwWhite_SWToHWThreshold_FPS);
        }
        if (paramJSONObject.has("CPU_MAX"))
        {
          paramConfig.mHwWhite_SWToHWThreshold_CPU_MAX = paramJSONObject.getInt("CPU_MAX");
          TXCLog.d("TXCConfigCenter", "parseAutoSWHWConfig get SWToHWThreshold.CPU:" + paramConfig.mHwWhite_SWToHWThreshold_CPU_MAX);
        }
        if (paramJSONObject.has("FPS_MIN"))
        {
          paramConfig.mHwWhite_SWToHWThreshold_FPS_MIN = paramJSONObject.getInt("FPS_MIN");
          TXCLog.d("TXCConfigCenter", "parseAutoSWHWConfig get SWToHWThreshold.FPS:" + paramConfig.mHwWhite_SWToHWThreshold_FPS_MIN);
        }
        if (paramJSONObject.has("CheckCount"))
        {
          paramConfig.mHwWhite_SWToHWThreshold_CheckCount = paramJSONObject.getInt("CheckCount");
          TXCLog.d("TXCConfigCenter", "parseAutoSWHWConfig get SWToHWThreshold.CheckCount:" + paramConfig.mHwWhite_SWToHWThreshold_CheckCount);
        }
      }
    }
  }
  
  private void parseConfig(JSONObject paramJSONObject, Config paramConfig)
  {
    if ((paramJSONObject == null) || (paramConfig == null)) {
      return;
    }
    try
    {
      parseHWBlackConfig(paramJSONObject, paramConfig);
      parseExposureConfig(paramJSONObject, paramConfig);
      parseAutoSWHWConfig(paramJSONObject, paramConfig);
      parseSysAECConfig(paramJSONObject, paramConfig);
      parseTRAEConfig(paramJSONObject, paramConfig);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      TXCLog.w("TXCConfigCenter", "parse catch ecxeption" + paramJSONObject);
    }
  }
  
  private void parseExposureConfig(JSONObject paramJSONObject, Config paramConfig)
  {
    int i;
    if (paramJSONObject.has("ExposureWhiteConfig"))
    {
      paramJSONObject = paramJSONObject.getJSONObject("ExposureWhiteConfig").getJSONArray("InfoList");
      i = 0;
    }
    for (;;)
    {
      if (i < paramJSONObject.length())
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        if ((localJSONObject.getString("Manufacture").equalsIgnoreCase(Build.MANUFACTURER)) && (localJSONObject.getString("Model").equalsIgnoreCase(Build.MODEL)))
        {
          paramConfig.mExposureCompensation = localJSONObject.getInt("ExposureCompensation");
          TXCLog.d("TXCConfigCenter", "parseExposureConfig get exposure config: " + paramConfig.mExposureCompensation);
        }
      }
      else
      {
        if (mContext != null)
        {
          paramJSONObject = new Intent("com.tencent.liteav.basic.serverconfig.get");
          mContext.sendBroadcast(paramJSONObject);
        }
        return;
      }
      i += 1;
    }
  }
  
  private void parseHWBlackConfig(JSONObject paramJSONObject, Config paramConfig)
  {
    int i;
    if (paramJSONObject.has("HWBlackConfig"))
    {
      paramJSONObject = paramJSONObject.getJSONObject("HWBlackConfig");
      i = 16;
      if (paramJSONObject.has("HWMiniSupportAPI")) {
        i = paramJSONObject.getInt("HWMiniSupportAPI");
      }
      if (Build.VERSION.SDK_INT >= i) {
        break label48;
      }
      paramConfig.mHWBlackValue = 0;
    }
    for (;;)
    {
      return;
      label48:
      paramJSONObject = paramJSONObject.getJSONArray("InfoList");
      i = 0;
      while (i < paramJSONObject.length())
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        if ((localJSONObject.getString("Manufacture").equalsIgnoreCase(Build.MANUFACTURER)) && (localJSONObject.getString("Model").equalsIgnoreCase(Build.MODEL)))
        {
          if (localJSONObject.has("profile"))
          {
            paramConfig.mHWBlackValue = 1;
            TXCLog.d("TXCConfigCenter", "parseHWBlackConfig get HWBlack config: " + paramConfig.mHWBlackValue);
            return;
          }
          paramConfig.mHWBlackValue = 0;
          TXCLog.d("TXCConfigCenter", "parseHWBlackConfig get HWBlack config: " + paramConfig.mHWBlackValue);
          return;
        }
        i += 1;
      }
    }
  }
  
  private void parseRespon(String paramString)
  {
    setUpdatingFlag(false);
    try
    {
      paramString = new JSONObject(paramString);
      int i = 1;
      if (paramString.has("UpdateFrequency")) {
        i = paramString.getInt("UpdateFrequency");
      }
      setExpiredtime(i);
      Config localConfig = new Config();
      parseConfig(paramString, localConfig);
      save(localConfig);
      return;
    }
    catch (JSONException paramString)
    {
      TXCLog.w("TXCConfigCenter", "parseRespon catch ecxeption" + paramString);
    }
  }
  
  private void parseSysAECConfig(JSONObject paramJSONObject, Config paramConfig)
  {
    Object localObject2 = null;
    paramConfig.mEnableAEC = 0;
    paramConfig.mEnableAGC = 0;
    paramConfig.mRecordSampleRates = null;
    paramConfig.mEnableHWAACCodec = 0;
    paramConfig.mSceneType = "";
    Object localObject1 = localObject2;
    int i;
    JSONObject localJSONObject2;
    int j;
    label135:
    label187:
    int k;
    if (paramJSONObject.has("SystemAECConfig"))
    {
      paramJSONObject = paramJSONObject.getJSONObject("SystemAECConfig");
      localObject1 = localObject2;
      if (paramJSONObject.has("InfoList"))
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("InfoList");
        i = 0;
        paramJSONObject = null;
        if (i < localJSONArray.length())
        {
          localJSONObject2 = localJSONArray.getJSONObject(i);
          localObject2 = paramJSONObject;
          if (localJSONObject2 != null)
          {
            localObject2 = paramJSONObject;
            if (localJSONObject2.getString("Manufacture").equalsIgnoreCase(Build.MANUFACTURER))
            {
              localObject1 = localJSONObject2.optJSONArray("WhiteList");
              if (localObject1 == null) {
                break label605;
              }
              j = 0;
              if (j >= ((JSONArray)localObject1).length()) {
                break label605;
              }
              localObject2 = ((JSONArray)localObject1).optJSONObject(j);
              if (localObject2 == null) {
                break label611;
              }
              localObject2 = ((JSONObject)localObject2).optString("Model");
              if ((localObject2 == null) || (!Build.MODEL.equals(localObject2))) {
                break label611;
              }
              j = 1;
              localObject1 = localJSONObject2.optJSONArray("BlackList");
              if (localObject1 == null) {
                break label599;
              }
              k = 0;
            }
          }
        }
      }
    }
    for (;;)
    {
      if (k < ((JSONArray)localObject1).length())
      {
        localObject2 = ((JSONArray)localObject1).optJSONObject(k);
        if (localObject2 != null)
        {
          localObject2 = ((JSONObject)localObject2).optString("Model");
          if ((localObject2 == null) || (!Build.MODEL.equals(localObject2))) {}
        }
      }
      else
      {
        label599:
        for (k = 1;; k = 0)
        {
          localObject1 = paramJSONObject;
          if (j != 0) {}
          for (;;)
          {
            try
            {
              paramConfig.mEnableAEC = localJSONObject2.optInt("SystemAEC", 0);
              paramConfig.mEnableAGC = localJSONObject2.optInt("AGC", 0);
              localObject1 = localJSONObject2.optString("SampleRate", "");
              paramJSONObject = (JSONObject)localObject1;
              try
              {
                if (!paramJSONObject.isEmpty())
                {
                  localObject1 = paramJSONObject.split("\\|");
                  paramConfig.mRecordSampleRates = new int[localObject1.length];
                  j = 0;
                  if (j < localObject1.length)
                  {
                    paramConfig.mRecordSampleRates[j] = Integer.valueOf(localObject1[j].trim()).intValue();
                    j += 1;
                    continue;
                  }
                }
                paramConfig.mEnableHWAACCodec = localJSONObject2.optInt("HWAACCodec", 0);
                paramConfig.mSceneType = localJSONObject2.optString("SceneType", "");
                localObject1 = paramJSONObject;
                localObject2 = localObject1;
                if (k != 0)
                {
                  paramConfig.mEnableAEC = 0;
                  paramConfig.mEnableAGC = 0;
                  paramConfig.mRecordSampleRates = null;
                  paramConfig.mEnableHWAACCodec = 0;
                  paramConfig.mSceneType = "";
                  localObject2 = localObject1;
                }
                i += 1;
                paramJSONObject = (JSONObject)localObject2;
              }
              catch (Exception localException1) {}
            }
            catch (Exception localException2)
            {
              JSONObject localJSONObject1;
              continue;
            }
            TXCLog.e("TXCConfigCenter", "parseSysAECConfig Exception: " + localException1.getMessage());
            localJSONObject1 = paramJSONObject;
          }
          localJSONObject1 = paramJSONObject;
          TXCLog.i("TXCConfigCenter", "system aec config1:" + paramConfig.mEnableAEC + "," + paramConfig.mEnableAGC + "," + localJSONObject1 + "," + paramConfig.mEnableHWAACCodec + "," + paramConfig.mSceneType + ", model = " + Build.MODEL + ", manufacturer = " + Build.MANUFACTURER + "， board = " + Build.BOARD);
          return;
        }
        label605:
        j = 0;
        break label187;
        label611:
        j += 1;
        break label135;
      }
      k += 1;
    }
  }
  
  private void parseTRAEConfig(JSONObject paramJSONObject, Config paramConfig)
  {
    int i;
    if (paramJSONObject.has("TraeConfig"))
    {
      paramJSONObject = paramJSONObject.getJSONObject("TraeConfig");
      if (paramJSONObject.has("InfoList"))
      {
        paramJSONObject = paramJSONObject.getJSONArray("InfoList");
        i = 0;
      }
    }
    for (;;)
    {
      if (i < paramJSONObject.length())
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
        if ((localJSONObject != null) && (localJSONObject.getString("MachineType").equals(Build.MODEL)))
        {
          paramConfig.mTraeConfig = localJSONObject.getString("ConfigValue");
          TXCLog.d("TXCConfigCenter", "parseTRAEConfig get TRAE config: " + paramConfig.mTraeConfig);
        }
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
  
  private void parseTraeLocalConfig(String paramString, Config paramConfig)
  {
    try
    {
      paramString = new JSONObject(paramString);
      int i;
      if (paramString.has("InfoList"))
      {
        paramString = paramString.getJSONArray("InfoList");
        i = 0;
      }
      for (;;)
      {
        if (i < paramString.length())
        {
          JSONObject localJSONObject = paramString.getJSONObject(i);
          if ((localJSONObject != null) && (localJSONObject.getString("MachineType").equals(Build.MODEL))) {
            paramConfig.mTraeConfig = localJSONObject.getString("ConfigValue");
          }
        }
        else
        {
          return;
        }
        i += 1;
      }
      return;
    }
    catch (JSONException paramString)
    {
      TXCLog.w("TXCConfigCenter", "parseTraeLocalConfig catch ecxeption" + paramString);
    }
  }
  
  private void save(Config paramConfig)
  {
    Object localObject1;
    if ((this.mShareEditor == null) && (mContext != null))
    {
      localObject1 = mContext.getSharedPreferences("cloud_config", 0);
      if (localObject1 != null) {
        this.mShareEditor = ((SharedPreferences)localObject1).edit();
      }
    }
    if (this.mShareEditor != null)
    {
      this.mShareEditor.putLong("expired_time", this.mExpiredTime);
      this.mShareEditor.putInt("hw_config", paramConfig.mHWBlackValue);
      this.mShareEditor.putInt("ExposureCompensation", paramConfig.mExposureCompensation);
      this.mShareEditor.putInt("CPU", paramConfig.mHwWhite_SWToHWThreshold_CPU);
      this.mShareEditor.putInt("FPS", paramConfig.mHwWhite_SWToHWThreshold_FPS);
      this.mShareEditor.putInt("CPU_MAX", paramConfig.mHwWhite_SWToHWThreshold_CPU_MAX);
      this.mShareEditor.putInt("FPS_MIN", paramConfig.mHwWhite_SWToHWThreshold_FPS_MIN);
      this.mShareEditor.putInt("CheckCount", paramConfig.mHwWhite_SWToHWThreshold_CheckCount);
      this.mShareEditor.putString("trae_config", paramConfig.mTraeConfig);
      Object localObject2 = "0";
      if (paramConfig.mRecordSampleRates != null)
      {
        localObject1 = paramConfig.mRecordSampleRates[0];
        int i = 1;
        for (;;)
        {
          localObject2 = localObject1;
          if (i >= paramConfig.mRecordSampleRates.length) {
            break;
          }
          localObject1 = (String)localObject1 + "|";
          localObject1 = (String)localObject1 + paramConfig.mRecordSampleRates[i];
          i += 1;
        }
      }
      if (paramConfig.mSceneType == null) {
        paramConfig.mSceneType = "";
      }
      this.mShareEditor.putString("system_aec_config", paramConfig.mEnableAEC + "," + paramConfig.mEnableAGC + "," + (String)localObject2 + "," + paramConfig.mEnableHWAACCodec + "," + paramConfig.mSceneType);
      this.mShareEditor.commit();
    }
  }
  
  private void setExpiredtime(int paramInt)
  {
    int i = paramInt;
    if (paramInt <= 0) {
      i = 1;
    }
    try
    {
      this.mExpiredTime = (System.currentTimeMillis() + i * 24 * 60 * 60 * 1000);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void setLoadFlag(boolean paramBoolean)
  {
    try
    {
      this.mIsLoaded = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void setUpdatingFlag(boolean paramBoolean)
  {
    try
    {
      this.mIsUpdating = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static String upZipFile(File paramFile)
  {
    Object localObject2;
    try
    {
      paramFile = new ZipFile(paramFile);
      Object localObject1 = paramFile.entries();
      do
      {
        if (!((Enumeration)localObject1).hasMoreElements()) {
          break;
        }
        localObject2 = (ZipEntry)((Enumeration)localObject1).nextElement();
      } while (((ZipEntry)localObject2).isDirectory());
      paramFile = paramFile.getInputStream((ZipEntry)localObject2);
      localObject1 = new byte[1048576];
      localObject2 = new ByteArrayOutputStream();
      for (;;)
      {
        int i = paramFile.read((byte[])localObject1);
        if (i <= 0) {
          break;
        }
        ((ByteArrayOutputStream)localObject2).write((byte[])localObject1, 0, i);
      }
      paramFile.close();
    }
    finally {}
    paramFile = ((ByteArrayOutputStream)localObject2).toString();
    return paramFile;
    return "";
  }
  
  public void Init(Context paramContext)
  {
    if (mContext == null) {
      mContext = paramContext.getApplicationContext();
    }
  }
  
  public boolean getAGCEnable()
  {
    load();
    update();
    return this.mConfig.mEnableAGC == 1;
  }
  
  public int getExposureCompensation()
  {
    load();
    update();
    return this.mConfig.mExposureCompensation;
  }
  
  public boolean getHWAACCodec()
  {
    load();
    update();
    return this.mConfig.mEnableHWAACCodec == 1;
  }
  
  public int getHWEncValue()
  {
    load();
    update();
    return this.mConfig.mHWBlackValue;
  }
  
  public int getMaxRecordSampleRate()
  {
    int k = 0;
    load();
    update();
    int j;
    if (this.mConfig.mRecordSampleRates != null)
    {
      int i = this.mConfig.mRecordSampleRates[0];
      int[] arrayOfInt = this.mConfig.mRecordSampleRates;
      int m = arrayOfInt.length;
      j = 0;
      k = i;
      if (j < m)
      {
        k = arrayOfInt[j];
        if (i >= k) {
          break label75;
        }
        i = k;
      }
    }
    label75:
    for (;;)
    {
      j += 1;
      break;
      return k;
    }
  }
  
  public int getMinRecordSampleRate()
  {
    int k = 0;
    load();
    update();
    int j;
    if (this.mConfig.mRecordSampleRates != null)
    {
      int i = this.mConfig.mRecordSampleRates[0];
      int[] arrayOfInt = this.mConfig.mRecordSampleRates;
      int m = arrayOfInt.length;
      j = 0;
      k = i;
      if (j < m)
      {
        k = arrayOfInt[j];
        if (i <= k) {
          break label75;
        }
        i = k;
      }
    }
    label75:
    for (;;)
    {
      j += 1;
      break;
      return k;
    }
  }
  
  public boolean getSWToHWChangeble(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    load();
    update();
    return (paramFloat2 >= this.mConfig.mHwWhite_SWToHWThreshold_CPU_MAX) || (paramFloat3 <= this.mConfig.mHwWhite_SWToHWThreshold_FPS_MIN) || ((paramFloat1 >= this.mConfig.mHwWhite_SWToHWThreshold_CPU) && (paramFloat3 <= this.mConfig.mHwWhite_SWToHWThreshold_FPS));
  }
  
  public int getSWToHWThresholdCheckCount()
  {
    update();
    load();
    return this.mConfig.mHwWhite_SWToHWThreshold_CheckCount;
  }
  
  public boolean getSysAecEnable(int paramInt)
  {
    load();
    update();
    int i;
    if (this.mConfig.mSceneType != null)
    {
      String[] arrayOfString = this.mConfig.mSceneType.split("\\|");
      if (arrayOfString != null)
      {
        int j = arrayOfString.length;
        i = 0;
        if (i < j)
        {
          String str = arrayOfString[i];
          if ((str == null) || (!str.equalsIgnoreCase(String.valueOf(paramInt)))) {}
        }
      }
    }
    for (paramInt = 1;; paramInt = 0)
    {
      if ((this.mConfig.mEnableAEC == 1) && (paramInt != 0))
      {
        return true;
        i += 1;
        break;
      }
      return false;
    }
  }
  
  public String getTRAEConfig()
  {
    load();
    update();
    if (this.mConfig.mTraeConfig.isEmpty()) {
      parseTraeLocalConfig("{\n        \"InfoList\": [\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-AL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-AL10\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-CL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-DL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"EVA-TL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"HUAWEI MT7-CL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"HUAWEI MT7-TL00\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"HUAWEI MT7-TL10\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"HUAWEI NXT-AL10\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"HUAWEI\",\n            \"MachineType\": \"PLK-AL10\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"JTY\",\n            \"MachineType\": \"KT096H\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 12.0\\r\\npreAGCvvolmax 20.0\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"LENOVO\",\n            \"MachineType\": \"Lenovo K900\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nUseHQAEC n\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"LGE\",\n            \"MachineType\": \"Nexus 5\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\ntrae {\\r\\nagc {\\r\\nswitch y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"LGE\",\n            \"MachineType\": \"Nexus 5X\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"M5\",\n            \"MachineType\": \"X5 R1\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 12.0\\r\\npreAGCvvolmax 20.0\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Meizu\",\n            \"MachineType\": \"MX4 Pro\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"A31\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\nagc {\\r\\nswitch y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO A33\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\nagc {\\r\\nswitch y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO A59s\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R7\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R9km\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nMkechoRatio 0\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R9m\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nMkechoRatio 0\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R9s\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 2\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\naec {\\r\\nUseHQAEC y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"OPPO\",\n            \"MachineType\": \"OPPO R9tm\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nMkechoRatio 0\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"samsung\",\n            \"MachineType\": \"SM-G9350\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 17\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nloopback y\\r\\nloop {\\r\\ngap 4\\r\\nbufnum 2\\r\\nvolume 2.0\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nMkechoRatio 1\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 2\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"samsung\",\n            \"MachineType\": \"SM-N9108V\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 12.0\\r\\npreAGCvvolmax 20.0\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"samsung\",\n            \"MachineType\": \"SM-N9200\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 2\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 21\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\nprep {\\r\\ndrop_mic_ms 300\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"TCL\",\n            \"MachineType\": \"TCL P501M\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 15.0\\r\\npreAGCvvolmax 23.0\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 3\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\nprep {\\r\\ndrop_mic_ms 300\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 4LTE\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 4W\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 17\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 5\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nloopback y\\r\\nloop {\\r\\ngap 4\\r\\nbufnum 2\\r\\nvolume 0.25\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 5s\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nloopback y\\r\\nloop {\\r\\ngap 4\\r\\nbufnum 2\\r\\n}\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI 5s Plus\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nloopback y\\r\\nloop {\\r\\ngap 4\\r\\nbufnum 2\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"MI NOTE LTE\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\ndev {\\r\\nforcevoip y\\r\\n}\\r\\n}\\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 17\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"Xiaomi\",\n            \"MachineType\": \"Redmi Note 3\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\nhwcodec_new {\\r\\navc_decoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.2\\r\\n}\\r\\n}\\r\\navc_encoder {\\r\\nwhite_list {\\r\\nmin_sdk 19\\r\\nmin_version 1.8.1\\r\\n}\\r\\n}\\r\\n}\\r\\ntrae {\\r\\naec {\\r\\nUseHQAEC n\\r\\n}\\r\\n}\\r\\ntrae {\\r\\ndev {\\r\\ncap {\\r\\nhw_ch_191 2\\r\\nStereoCapLorR 1\\r\\n}\\r\\ncomponent 1\\r\\n}\\r\\n}\\r\\n}\"\n          },\n          {\n            \"Factory\": \"ZTE\",\n            \"MachineType\": \"ZTE N928Dt\",\n            \"ConfigValue\": \"sharp{\\r\\nos android \\r\\ntrae {\\r\\npreAGC {\\r\\npreAGCSwitch y\\r\\npreAGCdy 0\\r\\npreVADkind 1\\r\\npreAGCvvolmin 0.0\\r\\npreAGCvvolfst 15.0\\r\\npreAGCvvolmax 23.0\\r\\n}\\r\\n}\\r\\n}\"\n          }\n        ]\n    }", this.mConfig);
    }
    return this.mConfig.mTraeConfig;
  }
  
  public void update()
  {
    if (needUpdate())
    {
      setUpdatingFlag(true);
      new Thread()
      {
        public void run()
        {
          TXCConfigCenter.this.updateInternal();
        }
      }.start();
    }
  }
  
  public void updateInternal()
  {
    int i;
    do
    {
      Object localObject3;
      Object localObject4;
      try
      {
        Object localObject1 = (HttpURLConnection)new URL("http://dldir1.qq.com/hudongzhibo/liteavsvrcfg/serverconfig_en.zip").openConnection();
        if (!this.mLastModify.isEmpty()) {
          ((HttpURLConnection)localObject1).addRequestProperty("If-Modified-Since", this.mLastModify);
        }
        localObject3 = ((HttpURLConnection)localObject1).getHeaderField("Last-Modified");
        i = ((HttpURLConnection)localObject1).getResponseCode();
        if (i != 200) {
          continue;
        }
        if ((localObject3 != null) && (!((String)localObject3).isEmpty()))
        {
          this.mLastModify = ((String)localObject3);
          if (this.mShareEditor != null) {
            this.mShareEditor.putString("last_modify", this.mLastModify);
          }
        }
        localObject3 = ((HttpURLConnection)localObject1).getInputStream();
        localObject4 = new byte['Ѐ'];
        localObject1 = new ByteArrayOutputStream();
        for (;;)
        {
          i = ((InputStream)localObject3).read((byte[])localObject4);
          if (i == -1) {
            break;
          }
          ((ByteArrayOutputStream)localObject1).write((byte[])localObject4, 0, i);
        }
        localObject3 = RSAUtils.getPrivateKey(Base64.decode("MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBAOnmX5h7KCQsoIQ+2ot1dIayWsmA3LU7p0kl1t5T2cbosedcsSGT+YM5bFiVBeAYbAM10WSvzZ2+oexMW7B2RcYZ1qulSR4eNXk74biDy2DmQqXK3qt1ZP4DnpiR+UXVKt6rqdtpDqRk4VGUw33/w3mMOyzkSjueewYB32n/l2JPAgMBAAECgYEA5rzfcyGTQNRRaQREPa0ZzcLmcr/Pem2lojBU3jBjtqhYz/8Nsi0yyHP+YQhpql8NNsGBlk0jjsi/HcdZ8CNMwbRfPYoe9mICe/iKMJ5P3+DtcH7AtE0ckHg01rY8pbqV9EAICijU1BwgbZh9M715HLSCeKwSWBWmpq1aQ/8l7PkCQQD5GFqrmGtMJOfTxaqS5hCHg+VsYpPsb566DEZQIJBWMP7eE58H1rphWMMSQ36c1V/iZuauYO0gYC1UlMfYHsRVAkEA8GIwlFXPG+LnkPENHo2pKORCnY7wo63hjyeQRipHhY7yUJjaPA50wDI7XCGOrJryBCVTOVszEUz4ocHQ0mOQEwJBAOnCPySVTuwQHjaQYzikCpMB5gVGpUbWoQA7kKiVRp58MFG73BwBGLtODxJOoL0RSIAwzP6MGzusxh1/2eMpTFkCQQCk5tboi0z+llPArHwRf6CRurSwHUSbJEddywg/+fUCfCNigtkC5e/VgSATfbnAUrK/gVNsP1HzBlhxruGv0jkdAkEAjNSVhjcoLg1JodbhBmD16vsAUzJpDR6EZIeiXj4pN+hKiDq9+aHEtMxtjFXiqbdKkrUjrzfZKrzQm0wy950BUw==".getBytes("UTF-8"), 2));
      }
      catch (Exception localException)
      {
        TXCLog.e("TXCConfigCenter", "fetchconfig catch exception " + localException);
        setUpdatingFlag(false);
        return;
      }
      byte[] arrayOfByte = RSAUtils.decryptData(localException.toByteArray(), (PrivateKey)localObject3);
      try
      {
        localObject3 = new File(ZIPFILEPATH, "serverconfig_dec.zip");
        localObject4 = new FileOutputStream((File)localObject3);
        ((FileOutputStream)localObject4).write(arrayOfByte);
        ((FileOutputStream)localObject4).close();
        parseRespon(upZipFile((File)localObject3));
        return;
      }
      finally {}
    } while (i != 304);
    setUpdatingFlag(false);
    if ("fetchconfig Not-Modified-Since " + this.mLastModify == null) {}
    for (String str = "";; str = this.mLastModify)
    {
      TXCLog.d("TXCConfigCenter", str);
      return;
    }
  }
  
  private static class Config
  {
    public int mEnableAEC = 0;
    public int mEnableAGC = 0;
    public int mEnableHWAACCodec = 0;
    public int mExposureCompensation = 0;
    public int mHWBlackValue = 2;
    public int mHwWhite_SWToHWThreshold_CPU = 60;
    public int mHwWhite_SWToHWThreshold_CPU_MAX = 80;
    public int mHwWhite_SWToHWThreshold_CheckCount = 10;
    public int mHwWhite_SWToHWThreshold_FPS = 70;
    public int mHwWhite_SWToHWThreshold_FPS_MIN = 50;
    public int[] mRecordSampleRates = null;
    public String mSceneType = "";
    String mTraeConfig = "";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\serverconfig\TXCConfigCenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */