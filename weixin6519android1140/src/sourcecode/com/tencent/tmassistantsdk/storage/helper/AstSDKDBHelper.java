package com.tencent.tmassistantsdk.storage.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadLogTable;
import com.tencent.tmassistantsdk.storage.table.DownloadSettingTable;
import com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable;
import com.tencent.tmassistantsdk.util.GlobalUtil;

public class AstSDKDBHelper
  extends SqliteHelper
{
  public static final String DB_NAME = "tmassistant_sdk.db";
  protected static final int DB_VERSION = 2;
  private static final Class<?>[] TABLESS = { DownloadInfoTable.class, DownloadSettingTable.class, ClientInfoTable.class, TipsInfoLogTable.class, DownloadLogTable.class };
  protected static SqliteHelper mInstance = null;
  
  public AstSDKDBHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, "tmassistant_sdk.db", paramCursorFactory, paramInt);
  }
  
  public static SqliteHelper getInstance()
  {
    try
    {
      if (mInstance == null)
      {
        localObject1 = GlobalUtil.getInstance().getContext();
        if (localObject1 != null) {
          mInstance = new AstSDKDBHelper((Context)localObject1, "tmassistant_sdk.db", null, 2);
        }
      }
      Object localObject1 = mInstance;
      return (SqliteHelper)localObject1;
    }
    finally {}
  }
  
  public int getDBVersion()
  {
    return 2;
  }
  
  public Class<?>[] getTables()
  {
    return TABLESS;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\storage\helper\AstSDKDBHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */