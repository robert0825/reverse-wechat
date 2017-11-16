package com.tencent.mm.plugin.ae;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends ContentObserver
{
  private boolean guN;
  private Context mContext;
  private ContentResolver oWB;
  private boolean oWC;
  private boolean oWD;
  public a oWE;
  private long oWF;
  public String[] oWG;
  
  public a(Context paramContext)
  {
    super(ae.fetchFreeHandler());
    GMTrace.i(15358668832768L, 114431);
    this.oWC = false;
    this.oWD = false;
    this.guN = false;
    this.oWF = 0L;
    this.mContext = paramContext;
    GMTrace.o(15358668832768L, 114431);
  }
  
  private String aq(int paramInt, String paramString)
  {
    GMTrace.i(15359205703680L, 114435);
    for (;;)
    {
      int i = paramInt;
      if (paramInt >= paramString.length())
      {
        GMTrace.o(15359205703680L, 114435);
        return null;
      }
      while ((i < paramString.length()) && (!Character.isDigit(paramString.charAt(i)))) {
        i += 1;
      }
      paramInt = i + 1;
      while ((paramInt < paramString.length()) && (Character.isDigit(paramString.charAt(paramInt)))) {
        paramInt += 1;
      }
      String str = paramString.substring(i, paramInt);
      w.v("MicroMsg.SmsVerifyObserver", "verify number from sms:" + str);
      if (str.length() == 6)
      {
        GMTrace.o(15359205703680L, 114435);
        return str;
      }
      paramInt += 1;
    }
  }
  
  public final void onChange(boolean paramBoolean)
  {
    GMTrace.i(15359071485952L, 114434);
    super.onChange(paramBoolean);
    Object localObject2;
    int i;
    for (;;)
    {
      try
      {
        if ((this.oWC) || (this.guN) || (this.oWD))
        {
          GMTrace.o(15359071485952L, 114434);
          return;
        }
        localObject2 = Uri.parse("content://sms/inbox");
        this.oWB = this.mContext.getContentResolver();
        String str = "( ";
        if (this.oWG != null)
        {
          i = 0;
          if (i < this.oWG.length)
          {
            if (i == this.oWG.length - 1)
            {
              str = str + " body like \"%" + this.oWG[i] + "%\" ) ";
              break label463;
            }
            str = str + "body like \"%" + this.oWG[i] + "%\" or ";
            break label463;
          }
          str = str + " and date > " + this.oWF + " ";
          w.v("MicroMsg.SmsVerifyObserver", "sql where:" + str);
          if ((str != null) && (!str.equals(""))) {
            break;
          }
          GMTrace.o(15359071485952L, 114434);
          return;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.SmsVerifyObserver", localException, "", new Object[0]);
        GMTrace.o(15359071485952L, 114434);
        return;
      }
      localObject1 = null;
    }
    Object localObject1 = this.oWB.query((Uri)localObject2, new String[] { "body", "_id", "date" }, (String)localObject1, null, "date desc");
    long l1;
    if (localObject1 != null)
    {
      i = -1;
      l1 = 0L;
    }
    label463:
    label470:
    for (;;)
    {
      if (((Cursor)localObject1).moveToNext())
      {
        long l2 = ((Cursor)localObject1).getLong(2);
        if (l2 > l1)
        {
          i = ((Cursor)localObject1).getPosition();
          l1 = l2;
          break label470;
        }
      }
      else
      {
        if (i >= 0)
        {
          ((Cursor)localObject1).moveToPosition(i);
          localObject2 = aq(0, ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex("body")));
          if ((!bg.nm((String)localObject2)) && (((String)localObject2).length() == 6))
          {
            if (this.oWE != null) {
              this.oWE.qo((String)localObject2);
            }
            this.oWD = true;
          }
        }
        ((Cursor)localObject1).close();
        GMTrace.o(15359071485952L, 114434);
        return;
      }
      break label470;
      i += 1;
      break;
    }
  }
  
  public final void start()
  {
    GMTrace.i(15358803050496L, 114432);
    this.oWC = false;
    this.oWD = false;
    this.guN = false;
    w.i("MicroMsg.SmsVerifyObserver", "summerper checkPermission checkSMS[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.h.a.a((Activity)this.mContext, "android.permission.READ_SMS", 128, "", "")), bg.bQW(), this.mContext });
    for (;;)
    {
      int i;
      try
      {
        Uri localUri = Uri.parse("content://sms/inbox");
        this.oWB = this.mContext.getContentResolver();
        Object localObject = "( ";
        if (this.oWG != null)
        {
          i = 0;
          if (i < this.oWG.length)
          {
            if (i == this.oWG.length - 1)
            {
              localObject = (String)localObject + " body like \"%" + this.oWG[i] + "%\" ) ";
              break label360;
            }
            localObject = (String)localObject + "body like \"%" + this.oWG[i] + "%\" or ";
            break label360;
          }
          w.v("MicroMsg.SmsVerifyObserver", "sql where:" + (String)localObject);
          localObject = this.oWB.query(localUri, new String[] { "date" }, (String)localObject, null, "date desc limit 1");
          if ((localObject != null) && (((Cursor)localObject).getCount() > 0))
          {
            ((Cursor)localObject).moveToFirst();
            l = ((Cursor)localObject).getLong(0);
            if (localObject != null) {
              ((Cursor)localObject).close();
            }
            this.oWF = l;
            this.mContext.getContentResolver().registerContentObserver(Uri.parse("content://sms/"), true, this);
            GMTrace.o(15358803050496L, 114432);
          }
        }
        else
        {
          localObject = "";
          continue;
        }
        long l = 0L;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.SmsVerifyObserver", localException, "", new Object[0]);
        GMTrace.o(15358803050496L, 114432);
        return;
      }
      continue;
      label360:
      i += 1;
    }
  }
  
  public final void stop()
  {
    GMTrace.i(15358937268224L, 114433);
    if (this.mContext != null) {}
    try
    {
      this.mContext.getContentResolver().unregisterContentObserver(this);
      this.guN = true;
      GMTrace.o(15358937268224L, 114433);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SmsVerifyObserver", localException, "", new Object[0]);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void qo(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ae\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */