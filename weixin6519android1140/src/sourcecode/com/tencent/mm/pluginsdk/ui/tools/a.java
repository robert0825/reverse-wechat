package com.tencent.mm.pluginsdk.ui.tools;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class a
{
  private static Intent tEW;
  private static WeakReference<Activity> tEX;
  private static final HashMap<String, String> tEY;
  
  static
  {
    GMTrace.i(1094411354112L, 8154);
    HashMap localHashMap = new HashMap();
    tEY = localHashMap;
    localHashMap.put("wps", "application/wps");
    tEY.put("ett", "application/ett");
    tEY.put("log", "application/log");
    tEY.put("wpt", "application/wpt");
    tEY.put("et", "application/et");
    tEY.put("ksdps", "application/ksdps");
    tEY.put("kset", "application/kset");
    tEY.put("kswps", "application/kswps");
    GMTrace.o(1094411354112L, 8154);
  }
  
  private static String PA(String paramString)
  {
    int i = 274528;
    GMTrace.i(1094008700928L, 8151);
    at.AR();
    t localt = c.xh();
    if (paramString != null) {
      i = 274528 + paramString.hashCode();
    }
    paramString = (String)localt.get(i, "");
    GMTrace.o(1094008700928L, 8151);
    return paramString;
  }
  
  private static String PB(String paramString)
  {
    GMTrace.i(1094277136384L, 8153);
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramString != null)
    {
      localObject1 = localObject2;
      if (paramString.length() > 0) {
        localObject1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
      }
    }
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (((String)localObject1).length() != 0) {}
    }
    else
    {
      localObject2 = (String)tEY.get(paramString);
    }
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      w.w("MicroMsg.AppChooserIntentUtil", "getMimeType fail, not a built-in mimetype, use \"*/{fileext}\" instead");
      localObject1 = "*/" + paramString;
    }
    GMTrace.o(1094277136384L, 8153);
    return (String)localObject1;
  }
  
  public static void a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(1093471830016L, 8147);
    if (paramInt1 == 2)
    {
      if ((-1 == paramInt2) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("selectpkg");
        Object localObject2 = paramIntent.getBundleExtra("transferback");
        paramIntent = (Intent)((Bundle)localObject2).getParcelable("targetintent");
        Object localObject1 = ((Bundle)localObject2).getString("filepath");
        localObject2 = ((Bundle)localObject2).getString("fileext");
        if (paramIntent != null)
        {
          w.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI select package name %s and target intent is not null", new Object[] { str });
          if (("com.tencent.mtt".equals(str)) && (localObject1 != null))
          {
            localObject1 = eJ((String)localObject1, (String)localObject2);
            ((Intent)localObject1).addFlags(524288);
            ((Intent)localObject1).putExtra("ChannelID", "com.tencent.mm");
            ((Intent)localObject1).putExtra("PosID", 4);
            if (bg.j(paramActivity, (Intent)localObject1))
            {
              w.i("MicroMsg.AppChooserIntentUtil", "user has installed new version of QQbrowser");
              paramActivity.startActivity((Intent)localObject1);
              g.ork.i(11168, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt5) });
              GMTrace.o(1093471830016L, 8147);
              return;
            }
          }
          paramIntent = new Intent(paramIntent);
          paramIntent.setPackage(str);
          paramIntent.addFlags(524288);
          if (bg.j(paramActivity, paramIntent))
          {
            paramActivity.startActivity(paramIntent);
            GMTrace.o(1093471830016L, 8147);
            return;
          }
          w.e("MicroMsg.AppChooserIntentUtil", "Always Intent is not support mimetype");
          if (paramBoolean) {
            h.h(paramActivity, paramInt3, paramInt4);
          }
          GMTrace.o(1093471830016L, 8147);
          return;
        }
        w.e("MicroMsg.AppChooserIntentUtil", "AppChooserUI target intent is null in handlerResultOfAppChooserUI");
        if (paramBoolean) {
          h.h(paramActivity, paramInt3, paramInt4);
        }
        GMTrace.o(1093471830016L, 8147);
        return;
      }
      if (4098 == paramInt2)
      {
        w.e("MicroMsg.AppChooserIntentUtil", "Not Found App Support media type");
        if (paramBoolean)
        {
          h.h(paramActivity, paramInt3, paramInt4);
          GMTrace.o(1093471830016L, 8147);
        }
      }
      else if (4097 == paramInt2)
      {
        w.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI result code is no choice");
        if (paramBoolean)
        {
          h.h(paramActivity, paramInt3, paramInt4);
          GMTrace.o(1093471830016L, 8147);
        }
      }
      else
      {
        w.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI result code is not ok or data is null");
      }
    }
    GMTrace.o(1093471830016L, 8147);
  }
  
  public static boolean a(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(1092934959104L, 8143);
    Object localObject1 = new File(paramString1);
    w.i("MicroMsg.AppChooserIntentUtil", "path:%s, isExisted:%b, size:%d", new Object[] { paramString1, Boolean.valueOf(((File)localObject1).exists()), Long.valueOf(((File)localObject1).length()) });
    if (!((File)localObject1).exists())
    {
      w.e("MicroMsg.AppChooserIntentUtil", "Cannot open file not existed!");
      GMTrace.o(1092934959104L, 8143);
      return true;
    }
    localObject1 = PB(paramString2);
    Object localObject2 = PA((String)localObject1);
    if (!((String)localObject2).equals(""))
    {
      w.i("MicroMsg.AppChooserIntentUtil", "User exist always config, package is %s", new Object[] { localObject2 });
      Intent localIntent = eH((String)localObject1, paramString1);
      localIntent.setPackage((String)localObject2);
      if (bg.j(paramActivity, localIntent))
      {
        w.i("MicroMsg.AppChooserIntentUtil", "Always package support mimeType");
        paramActivity.startActivity(localIntent);
        GMTrace.o(1092934959104L, 8143);
        return false;
      }
      w.i("MicroMsg.AppChooserIntentUtil", "Always package do not support mimeType");
      w.i("MicroMsg.AppChooserIntentUtil", "Always package do not support mimeType");
    }
    localObject2 = w(paramActivity, (String)localObject1, paramString1);
    w.i("MicroMsg.AppChooserIntentUtil", "QQBrowser status is %s", new Object[] { ((a)localObject2).name() });
    if (localObject2 == a.tFd)
    {
      localObject2 = eJ(paramString1, paramString2);
      if (bg.j(paramActivity, (Intent)localObject2))
      {
        ((Intent)localObject2).setFlags(268435456);
        paramActivity.startActivity((Intent)localObject2);
        g.ork.i(11168, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt) });
        GMTrace.o(1092934959104L, 8143);
        return false;
      }
      ((Intent)localObject2).setFlags(268435456);
      localObject1 = eI((String)localObject1, paramString1);
      if (bg.j(paramActivity, (Intent)localObject1))
      {
        paramActivity.startActivity((Intent)localObject1);
        g.ork.i(11168, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt) });
        w.e("MicroMsg.AppChooserIntentUtil", "Occur error, has bugs, status is install and support but not found support activity");
      }
    }
    else
    {
      if (bg.nm(paramString2)) {
        break label449;
      }
      at.AR();
      localObject1 = (String)c.xh().get(w.a.vuq, "");
      if ((bg.nm((String)localObject1)) || (!((String)localObject1).contains(paramString2))) {
        break label449;
      }
    }
    label449:
    for (paramInt = 1; paramInt != 0; paramInt = 0)
    {
      b(paramActivity, paramString1, paramString2);
      GMTrace.o(1092934959104L, 8143);
      return false;
      w.e("MicroMsg.AppChooserIntentUtil", "Occur error, has bugs, status is install and support but not found support activity");
      GMTrace.o(1092934959104L, 8143);
      return true;
    }
    GMTrace.o(1092934959104L, 8143);
    return true;
  }
  
  public static void ae(Intent paramIntent)
  {
    GMTrace.i(1093337612288L, 8146);
    boolean bool = paramIntent.getBooleanExtra("MINIQB_OPEN_RET_VAL", false);
    paramIntent.getStringExtra("file_path");
    String str2 = paramIntent.getStringExtra("file_ext");
    w.i("MicroMsg.AppChooserIntentUtil", "miniQB retVal:%b", new Object[] { Boolean.valueOf(bool) });
    if ((at.AJ()) || (!at.AU()))
    {
      GMTrace.o(1093337612288L, 8146);
      return;
    }
    at.AR();
    String str1 = (String)c.xh().get(w.a.vuq, "");
    if (!bool) {
      paramIntent = str1.replace(str2, "");
    }
    for (;;)
    {
      at.AR();
      c.xh().a(w.a.vuq, paramIntent);
      if ((!bool) && (tEW != null) && (tEX != null) && (tEX.get() != null))
      {
        tEW.setClass((Context)tEX.get(), AppChooserUI.class);
        ((Activity)tEX.get()).startActivityForResult(tEW, 2);
      }
      tEW = null;
      GMTrace.o(1093337612288L, 8146);
      return;
      paramIntent = str1;
      if (!str1.contains(str2)) {
        paramIntent = str1.concat(str2);
      }
    }
  }
  
  private static void b(Activity paramActivity, String paramString1, String paramString2)
  {
    GMTrace.i(1093203394560L, 8145);
    Intent localIntent = new Intent();
    localIntent.putExtra("file_path", paramString1);
    localIntent.putExtra("file_ext", paramString2);
    localIntent.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE");
    paramActivity.sendBroadcast(localIntent);
    GMTrace.o(1093203394560L, 8145);
  }
  
  public static void b(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(1093069176832L, 8144);
    Object localObject1 = new File(paramString1);
    w.i("MicroMsg.AppChooserIntentUtil", "path:%s, isExisted:%b, size:%d", new Object[] { paramString1, Boolean.valueOf(((File)localObject1).exists()), Long.valueOf(((File)localObject1).length()) });
    if (!((File)localObject1).exists())
    {
      w.e("MicroMsg.AppChooserIntentUtil", "Cannot open file not existed!");
      GMTrace.o(1093069176832L, 8144);
      return;
    }
    localObject1 = PB(paramString2);
    Object localObject2 = PA((String)localObject1);
    Object localObject3;
    if (!((String)localObject2).equals(""))
    {
      w.i("MicroMsg.AppChooserIntentUtil", "User exist always config, package is %s", new Object[] { localObject2 });
      localObject3 = eH((String)localObject1, paramString1);
      ((Intent)localObject3).setPackage((String)localObject2);
      if (bg.j(paramActivity, (Intent)localObject3))
      {
        w.i("MicroMsg.AppChooserIntentUtil", "Always package support mimeType");
        paramActivity.startActivity((Intent)localObject3);
        GMTrace.o(1093069176832L, 8144);
        return;
      }
      w.i("MicroMsg.AppChooserIntentUtil", "Always package do not support mimeType");
    }
    localObject2 = w(paramActivity, (String)localObject1, paramString1);
    w.i("MicroMsg.AppChooserIntentUtil", "QQBrowser status is %s", new Object[] { ((a)localObject2).name() });
    boolean bool = false;
    int i = 1;
    Object localObject4;
    switch (1.tEZ[localObject2.ordinal()])
    {
    default: 
      localObject1 = eH((String)localObject1, paramString1);
      localObject2 = PB(paramString2);
      localObject4 = Uri.fromFile(new File(paramString1));
      localObject3 = new Bundle();
      ((Bundle)localObject3).putString("targeturl", ((Uri)localObject4).toString());
      ((Bundle)localObject3).putString("filepath", paramString1);
      ((Bundle)localObject3).putString("fileext", paramString2);
      ((Bundle)localObject3).putParcelable("targetintent", (Parcelable)localObject1);
      localObject4 = new Intent();
      ((Intent)localObject4).putExtra("type", 0);
      ((Intent)localObject4).putExtra("title", paramActivity.getResources().getString(R.l.dhP));
      ((Intent)localObject4).putExtra("needupate", bool);
      if (i != 0) {
        break;
      }
    }
    for (bool = true;; bool = false)
    {
      ((Intent)localObject4).putExtra("not_show_recommend_app", bool);
      ((Intent)localObject4).putExtra("mimetype", (String)localObject2);
      ((Intent)localObject4).putExtra("targetintent", (Parcelable)localObject1);
      ((Intent)localObject4).putExtra("transferback", (Bundle)localObject3);
      ((Intent)localObject4).putExtra("scene", paramInt);
      b(paramActivity, paramString1, paramString2);
      tEW = (Intent)localObject4;
      tEX = new WeakReference(paramActivity);
      GMTrace.o(1093069176832L, 8144);
      return;
      localObject1 = eH((String)localObject1, paramString1);
      break;
      localObject1 = eH((String)localObject1, paramString1);
      i = 0;
      break;
      localObject1 = eH((String)localObject1, paramString1);
      bool = true;
      break;
      localObject2 = eJ(paramString1, paramString2);
      if (bg.j(paramActivity, (Intent)localObject2))
      {
        paramActivity.startActivity((Intent)localObject2);
        GMTrace.o(1093069176832L, 8144);
        return;
      }
      localObject1 = eH((String)localObject1, paramString1);
      break;
    }
  }
  
  private static Intent eH(String paramString1, String paramString2)
  {
    GMTrace.i(1093606047744L, 8148);
    paramString2 = Uri.fromFile(new File(paramString2));
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(paramString2, paramString1);
    GMTrace.o(1093606047744L, 8148);
    return localIntent;
  }
  
  private static Intent eI(String paramString1, String paramString2)
  {
    GMTrace.i(1093740265472L, 8149);
    Intent localIntent = new Intent();
    localIntent.setPackage("com.tencent.mtt");
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File(paramString2)), paramString1);
    GMTrace.o(1093740265472L, 8149);
    return localIntent;
  }
  
  private static Intent eJ(String paramString1, String paramString2)
  {
    GMTrace.i(1093874483200L, 8150);
    Intent localIntent = new Intent("com.tencent.QQBrowser.action.sdk.document");
    File localFile = new File(paramString1);
    localIntent.setPackage("com.tencent.mtt");
    localIntent.putExtra("ChannelID", "com.tencent.mm");
    localIntent.putExtra("PosID", 4);
    localIntent.putExtra("key_reader_sdk_id", 1);
    localIntent.putExtra("key_reader_sdk_type", 0);
    localIntent.putExtra("key_reader_sdk_format", paramString2);
    localIntent.putExtra("key_reader_sdk_path", paramString1);
    localIntent.setData(Uri.fromFile(localFile));
    GMTrace.o(1093874483200L, 8150);
    return localIntent;
  }
  
  private static a w(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(1094142918656L, 8152);
    if (q.dJ(paramContext))
    {
      if (bg.j(paramContext, eI(paramString1, paramString2)))
      {
        paramContext = a.tFd;
        GMTrace.o(1094142918656L, 8152);
        return paramContext;
      }
      if (q.On(paramString1))
      {
        paramContext = a.tFb;
        GMTrace.o(1094142918656L, 8152);
        return paramContext;
      }
      paramContext = a.tFc;
      GMTrace.o(1094142918656L, 8152);
      return paramContext;
    }
    paramContext = a.tFa;
    GMTrace.o(1094142918656L, 8152);
    return paramContext;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1061393793024L, 7908);
      tFa = new a("NOT_INSTALL", 0);
      tFb = new a("INSTALL_BUT_NEED_UPDATE", 1);
      tFc = new a("INSTALL_BUT_NOT_SUPPORT", 2);
      tFd = new a("INSTALL_AND_SUPPORT", 3);
      tFe = new a[] { tFa, tFb, tFc, tFd };
      GMTrace.o(1061393793024L, 7908);
    }
    
    private a()
    {
      GMTrace.i(1061259575296L, 7907);
      GMTrace.o(1061259575296L, 7907);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */