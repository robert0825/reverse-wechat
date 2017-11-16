package com.tencent.mm.plugin.exdevice.h;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends i<b>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(10996190019584L, 81928);
    fTX = new String[] { i.a(b.fTp, "HardDeviceInfo") };
    GMTrace.o(10996190019584L, 81928);
  }
  
  public c(e parame)
  {
    super(parame, b.fTp, "HardDeviceInfo", null);
    GMTrace.i(10994176753664L, 81913);
    this.fTZ = parame;
    parame.eZ("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceUsernameIndex ON HardDeviceInfo ( brandName )");
    parame.eZ("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceMacIndex ON HardDeviceInfo ( mac )");
    GMTrace.o(10994176753664L, 81913);
  }
  
  public static boolean wU(String paramString)
  {
    GMTrace.i(10994847842304L, 81918);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.exdevice.HardDeviceInfoStorage", "Ability is null or nil.");
      GMTrace.o(10994847842304L, 81918);
      return false;
    }
    if ((paramString.contains("wxmsg_music")) || (paramString.contains("wxmsg_poi")) || (paramString.contains("wxmsg_image")) || (paramString.contains("wxmsg_file")) || (paramString.contains("wxmsg_video")) || (paramString.contains("wxmsg_url")))
    {
      GMTrace.o(10994847842304L, 81918);
      return true;
    }
    GMTrace.o(10994847842304L, 81918);
    return false;
  }
  
  public final List<b> auv()
  {
    GMTrace.i(10994982060032L, 81919);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = Mx();
    if ((localCursor != null) && (localCursor.moveToFirst())) {
      do
      {
        b localb = new b();
        localb.b(localCursor);
        String str = localb.fsL;
        if ((str != null) && (wU(str))) {
          localLinkedList.add(localb);
        }
      } while (localCursor.moveToNext());
    }
    if (localCursor != null) {
      localCursor.close();
    }
    GMTrace.o(10994982060032L, 81919);
    return localLinkedList;
  }
  
  public final List<b> auw()
  {
    GMTrace.i(10995116277760L, 81920);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = Mx();
    if ((localCursor != null) && (localCursor.moveToFirst())) {
      do
      {
        b localb = new b();
        localb.b(localCursor);
        String str1 = localb.fsH;
        String str2 = localb.iconUrl;
        String str3 = localb.category;
        String str4 = localb.field_brandName;
        if ((!bg.nm(str3)) && (!str3.equals("1")) && (!str3.equals("0")) && (!bg.nm(str4)) && (!bg.nm(str1)) && (!bg.nm(str2))) {
          localLinkedList.add(localb);
        }
      } while (localCursor.moveToNext());
    }
    if (localCursor != null) {
      localCursor.close();
    }
    GMTrace.o(10995116277760L, 81920);
    return localLinkedList;
  }
  
  public final LinkedList<b> aux()
  {
    GMTrace.i(10995518930944L, 81923);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = rawQuery("select * from HardDeviceInfo where mac > 0 and connProto like '3'", new String[0]);
    if (localCursor == null)
    {
      w.e("MicroMsg.exdevice.HardDeviceInfoStorage", "get cursor is null");
      GMTrace.o(10995518930944L, 81923);
      return localLinkedList;
    }
    if (localCursor.moveToFirst()) {
      do
      {
        b localb = new b();
        localb.b(localCursor);
        localLinkedList.add(localb);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    GMTrace.o(10995518930944L, 81923);
    return localLinkedList;
  }
  
  public final b bR(long paramLong)
  {
    b localb = null;
    GMTrace.i(10994445189120L, 81915);
    Cursor localCursor = this.fTZ.query("HardDeviceInfo", null, "mac=?", new String[] { String.valueOf(paramLong) }, null, null, null);
    if (localCursor == null)
    {
      GMTrace.o(10994445189120L, 81915);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localb = new b();
      localb.b(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      GMTrace.o(10994445189120L, 81915);
      return localb;
      w.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:" + paramLong);
    }
  }
  
  public final b bY(String paramString1, String paramString2)
  {
    GMTrace.i(10994713624576L, 81917);
    if ((bg.nm(paramString2)) || (bg.nm(paramString1)))
    {
      w.e("MicroMsg.exdevice.HardDeviceInfoStorage", "deviceType(%s) or deviceId(%s) is null or nil.", new Object[] { paramString2, paramString1 });
      GMTrace.o(10994713624576L, 81917);
      return null;
    }
    Cursor localCursor = this.fTZ.a("HardDeviceInfo", null, "deviceType=? and deviceID=?", new String[] { paramString2, paramString1 }, null, null, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(10994713624576L, 81917);
      return null;
    }
    if (!localCursor.moveToFirst())
    {
      w.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceType:%s and deviceId:%s", new Object[] { paramString2, paramString1 });
      localCursor.close();
      GMTrace.o(10994713624576L, 81917);
      return null;
    }
    paramString1 = new b();
    paramString1.b(localCursor);
    localCursor.close();
    GMTrace.o(10994713624576L, 81917);
    return paramString1;
  }
  
  public final b bZ(String paramString1, String paramString2)
  {
    GMTrace.i(10995250495488L, 81921);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.e("MicroMsg.exdevice.HardDeviceInfoStorage", "brandName(%s) or deviceId(%s) is null or nil.", new Object[] { paramString1, paramString2 });
      GMTrace.o(10995250495488L, 81921);
      return null;
    }
    paramString2 = this.fTZ.a("HardDeviceInfo", null, "brandName=? and deviceID=?", new String[] { paramString1, paramString2 }, null, null, null, 2);
    if (paramString2 == null)
    {
      GMTrace.o(10995250495488L, 81921);
      return null;
    }
    if (!paramString2.moveToFirst())
    {
      w.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with brandName:" + paramString1);
      paramString2.close();
      GMTrace.o(10995250495488L, 81921);
      return null;
    }
    paramString1 = new b();
    paramString1.b(paramString2);
    paramString2.close();
    GMTrace.o(10995250495488L, 81921);
    return paramString1;
  }
  
  public final boolean ca(String paramString1, String paramString2)
  {
    GMTrace.i(10995787366400L, 81925);
    if (bg.nm(paramString1))
    {
      GMTrace.o(10995787366400L, 81925);
      return false;
    }
    if (this.fTZ.delete("HardDeviceInfo", "deviceID=? and deviceType=? ", new String[] { paramString1, paramString2 }) <= 0)
    {
      w.i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo fail, deviceId = %s", new Object[] { paramString1 });
      GMTrace.o(10995787366400L, 81925);
      return false;
    }
    w.i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo ok, deviceId = %s", new Object[] { paramString1 });
    GMTrace.o(10995787366400L, 81925);
    return true;
  }
  
  public final int e(b paramb)
  {
    GMTrace.i(10995921584128L, 81926);
    ContentValues localContentValues = paramb.qL();
    if (localContentValues.size() > 0) {}
    for (int i = this.fTZ.update("HardDeviceInfo", localContentValues, "deviceID = ? and deviceType = ? ", new String[] { paramb.field_deviceID, paramb.field_deviceType });; i = 0)
    {
      w.i("MicroMsg.exdevice.HardDeviceInfoStorage", "update: deviceId = %s, deviceType = %s, ret = %s ", new Object[] { paramb.field_deviceID, paramb.field_deviceType, Integer.valueOf(i) });
      GMTrace.o(10995921584128L, 81926);
      return i;
    }
  }
  
  public final b wS(String paramString)
  {
    GMTrace.i(10994310971392L, 81914);
    if (bg.nm(paramString))
    {
      GMTrace.o(10994310971392L, 81914);
      return null;
    }
    Cursor localCursor = this.fTZ.a("HardDeviceInfo", null, "mac=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(10994310971392L, 81914);
      return null;
    }
    if (!localCursor.moveToFirst())
    {
      w.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:" + paramString);
      localCursor.close();
      GMTrace.o(10994310971392L, 81914);
      return null;
    }
    paramString = new b();
    paramString.b(localCursor);
    localCursor.close();
    GMTrace.o(10994310971392L, 81914);
    return paramString;
  }
  
  public final b wT(String paramString)
  {
    GMTrace.i(10994579406848L, 81916);
    if (bg.nm(paramString))
    {
      GMTrace.o(10994579406848L, 81916);
      return null;
    }
    Cursor localCursor = this.fTZ.a("HardDeviceInfo", null, "deviceID=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(10994579406848L, 81916);
      return null;
    }
    if (!localCursor.moveToFirst())
    {
      w.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceId:" + paramString);
      localCursor.close();
      GMTrace.o(10994579406848L, 81916);
      return null;
    }
    paramString = new b();
    paramString.b(localCursor);
    localCursor.close();
    GMTrace.o(10994579406848L, 81916);
    return paramString;
  }
  
  public final LinkedList<b> wV(String paramString)
  {
    GMTrace.i(10995384713216L, 81922);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.exdevice.HardDeviceInfoStorage", "The given brandName is null or nil.");
      GMTrace.o(10995384713216L, 81922);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString = this.fTZ.a("HardDeviceInfo", null, "brandName=?", new String[] { paramString }, null, null, null, 2);
    if (paramString == null)
    {
      GMTrace.o(10995384713216L, 81922);
      return localLinkedList;
    }
    if (paramString.moveToFirst()) {
      do
      {
        b localb = new b();
        localb.b(paramString);
        localLinkedList.add(localb);
      } while (paramString.moveToNext());
    }
    paramString.close();
    GMTrace.o(10995384713216L, 81922);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */