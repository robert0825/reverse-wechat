package com.tencent.liteav.beauty;

import android.content.Context;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;

public class ReportDuaManage
{
  public static final int DR_SDK_ID_AVSDK = 10;
  public static final int DR_SDK_ID_BEAUTY_SDK = 3;
  public static final int DR_SDK_ID_RTMPSDK = 1;
  public static final int TXCVideoPreprocessor_REPORT_BEGIN = 1200;
  public static final int TXCVideoPreprocessor_REPORT_Beauty = 1202;
  public static final int TXCVideoPreprocessor_REPORT_Dau = 1201;
  public static final int TXCVideoPreprocessor_REPORT_End = 1299;
  public static final int TXCVideoPreprocessor_REPORT_EyeScale = 1205;
  public static final int TXCVideoPreprocessor_REPORT_FaceSlim = 1206;
  public static final int TXCVideoPreprocessor_REPORT_FilterImage = 1208;
  public static final int TXCVideoPreprocessor_REPORT_FilterType = 1207;
  public static final int TXCVideoPreprocessor_REPORT_Green = 1209;
  public static final int TXCVideoPreprocessor_REPORT_Ruddy = 1204;
  public static final int TXCVideoPreprocessor_REPORT_Sharp = 1210;
  public static final int TXCVideoPreprocessor_REPORT_Template = 1211;
  public static final int TXCVideoPreprocessor_REPORT_WaterMark = 1212;
  public static final int TXCVideoPreprocessor_REPORT_White = 1203;
  private static ReportDuaManage m_Instance = null;
  private static boolean m_bIfReportBeauty;
  private static boolean m_bIfReportEnd = false;
  private static boolean m_bIfReportEyeScale;
  private static boolean m_bIfReportFaceSlim;
  private static boolean m_bIfReportFilterType;
  private static boolean m_bIfReportGreen;
  private static boolean m_bIfReportImage;
  private static boolean m_bIfReportInit;
  private static boolean m_bIfReportRuddy;
  private static boolean m_bIfReportSharp;
  private static boolean m_bIfReportTemplate;
  private static boolean m_bIfReportWaterMark;
  private static boolean m_bIfReportWhite;
  private static Context m_context = null;
  private String TAG = "ReportDuaManage";
  
  static
  {
    m_bIfReportInit = false;
    m_bIfReportBeauty = false;
    m_bIfReportWhite = false;
    m_bIfReportRuddy = false;
    m_bIfReportEyeScale = false;
    m_bIfReportFaceSlim = false;
    m_bIfReportFilterType = false;
    m_bIfReportImage = false;
    m_bIfReportGreen = false;
    m_bIfReportSharp = false;
    m_bIfReportTemplate = false;
    m_bIfReportWaterMark = false;
  }
  
  public static ReportDuaManage getInstance()
  {
    if (m_Instance == null) {
      m_Instance = new ReportDuaManage();
    }
    return m_Instance;
  }
  
  private void resetReportState()
  {
    TXCLog.i(this.TAG, "resetReportState");
    m_bIfReportInit = false;
    m_bIfReportBeauty = false;
    m_bIfReportWhite = false;
    m_bIfReportRuddy = false;
    m_bIfReportEyeScale = false;
    m_bIfReportFaceSlim = false;
    m_bIfReportFilterType = false;
    m_bIfReportImage = false;
    m_bIfReportGreen = false;
    m_bIfReportSharp = false;
    m_bIfReportTemplate = false;
    m_bIfReportWaterMark = false;
    m_bIfReportEnd = false;
  }
  
  public void reportBeautyDua()
  {
    if (!m_bIfReportBeauty)
    {
      TXCLog.i(this.TAG, "reportBeautyDua");
      TXCDRApi.txReportDAU(m_context, 1202, 0, "reportBeautyDua");
    }
    m_bIfReportBeauty = true;
  }
  
  public void reportEndDua()
  {
    if (!m_bIfReportEnd)
    {
      TXCLog.i(this.TAG, "reportEndDua");
      TXCDRApi.txReportDAU(m_context, 1299, 0, "reportEndDua");
    }
    m_bIfReportEnd = true;
  }
  
  public void reportEyeScaleDua()
  {
    if (!m_bIfReportEyeScale)
    {
      TXCLog.i(this.TAG, "reportEyeScaleDua");
      TXCDRApi.txReportDAU(m_context, 1205, 0, "reportEyeScaleDua");
    }
    m_bIfReportEyeScale = true;
  }
  
  public void reportFaceSlimDua()
  {
    if (!m_bIfReportFaceSlim)
    {
      TXCLog.i(this.TAG, "reportFaceSlimDua");
      TXCDRApi.txReportDAU(m_context, 1206, 0, "reportFaceSlimDua");
    }
    m_bIfReportFaceSlim = true;
  }
  
  public void reportFilterImageDua()
  {
    if (!m_bIfReportImage)
    {
      TXCLog.i(this.TAG, "reportFilterImageDua");
      TXCDRApi.txReportDAU(m_context, 1208, 0, "reportFilterImageDua");
    }
    m_bIfReportImage = true;
  }
  
  public void reportFilterTypeDua()
  {
    if (!m_bIfReportFilterType)
    {
      TXCLog.i(this.TAG, "reportFilterTypeDua");
      TXCDRApi.txReportDAU(m_context, 1207, 0, "reportFilterTypeDua");
    }
    m_bIfReportFilterType = true;
  }
  
  public void reportGreenDua()
  {
    if (!m_bIfReportGreen)
    {
      TXCLog.i(this.TAG, "reportGreenDua");
      TXCDRApi.txReportDAU(m_context, 1209, 0, "reportGreenDua");
    }
    m_bIfReportGreen = true;
  }
  
  public void reportRuddyDua()
  {
    if (!m_bIfReportRuddy)
    {
      TXCLog.i(this.TAG, "reportRuddyDua");
      TXCDRApi.txReportDAU(m_context, 1204, 0, "reportRuddyDua");
    }
    m_bIfReportRuddy = true;
  }
  
  public void reportSDKInit(Context paramContext)
  {
    resetReportState();
    m_context = paramContext.getApplicationContext();
    if (!m_bIfReportInit)
    {
      TXCLog.i(this.TAG, "reportSDKInit");
      TXCDRApi.txReportDAU(m_context, 1201, 0, "reportSDKInit!");
    }
    m_bIfReportInit = true;
  }
  
  public void reportSharpDua()
  {
    if (!m_bIfReportSharp)
    {
      TXCLog.i(this.TAG, "reportSharpDua");
      TXCDRApi.txReportDAU(m_context, 1210, 0, "reportSharpDua");
    }
    m_bIfReportSharp = true;
  }
  
  public void reportTemplateDua()
  {
    if (!m_bIfReportTemplate)
    {
      TXCLog.i(this.TAG, "reportTemplateDua");
      TXCDRApi.txReportDAU(m_context, 1211, 0, "reportTemplateDua");
    }
    m_bIfReportTemplate = true;
  }
  
  public void reportWarterMarkDua()
  {
    if (!m_bIfReportWaterMark)
    {
      TXCLog.i(this.TAG, "reportWarterMarkDua");
      TXCDRApi.txReportDAU(m_context, 1212, 0, "reportWarterMarkDua");
    }
    m_bIfReportWaterMark = true;
  }
  
  public void reportWhiteDua()
  {
    if (!m_bIfReportWhite)
    {
      TXCLog.i(this.TAG, "reportWhiteDua");
      TXCDRApi.txReportDAU(m_context, 1203, 0, "reportWhiteDua");
    }
    m_bIfReportWhite = true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\ReportDuaManage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */