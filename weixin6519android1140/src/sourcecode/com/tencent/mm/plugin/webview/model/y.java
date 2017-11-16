package com.tencent.mm.plugin.webview.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.h.a;
import com.tencent.mm.protocal.c.aqt;
import com.tencent.mm.protocal.c.baa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public final class y
{
  public static String[] rEr;
  public static boolean rEs;
  
  static
  {
    GMTrace.i(18177375338496L, 135432);
    rEs = false;
    GMTrace.o(18177375338496L, 135432);
  }
  
  public static LinkedList<baa> W(ArrayList<byte[]> paramArrayList)
  {
    GMTrace.i(18177241120768L, 135431);
    LinkedList localLinkedList = new LinkedList();
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
    {
      GMTrace.o(18177241120768L, 135431);
      return localLinkedList;
    }
    int i = 0;
    while (i < paramArrayList.size()) {
      try
      {
        aqt localaqt = new aqt();
        localaqt.aD((byte[])paramArrayList.get(i));
        baa localbaa = new baa();
        localbaa.uOa = localaqt.uGY;
        localbaa.lPj = localaqt.desc;
        localbaa.tWJ = localaqt.scope;
        localbaa.ibU = localaqt.ibU;
        localLinkedList.add(localbaa);
        i += 1;
      }
      catch (IOException paramArrayList)
      {
        w.w("MicroMsg.OauthAuthorizeLogic", "bytesListToBytesListScopeInfoList: i:%d, exp:%s", new Object[] { Integer.valueOf(i), paramArrayList.getLocalizedMessage() });
        localLinkedList.clear();
        GMTrace.o(18177241120768L, 135431);
        return localLinkedList;
      }
    }
    GMTrace.o(18177241120768L, 135431);
    return localLinkedList;
  }
  
  public static ArrayList<byte[]> aq(LinkedList<aqt> paramLinkedList)
  {
    GMTrace.i(18177106903040L, 135430);
    ArrayList localArrayList = new ArrayList();
    if ((paramLinkedList == null) || (paramLinkedList.isEmpty()))
    {
      GMTrace.o(18177106903040L, 135430);
      return localArrayList;
    }
    int i = 0;
    while (i < paramLinkedList.size()) {
      try
      {
        localArrayList.add(((aqt)paramLinkedList.get(i)).toByteArray());
        i += 1;
      }
      catch (IOException paramLinkedList)
      {
        w.w("MicroMsg.OauthAuthorizeLogic", "oauthScopeInfoListToBytesList index:%d, exp:%s ", new Object[] { Integer.valueOf(i), paramLinkedList.getLocalizedMessage() });
        localArrayList.clear();
        GMTrace.o(18177106903040L, 135430);
        return localArrayList;
      }
    }
    GMTrace.o(18177106903040L, 135430);
    return localArrayList;
  }
  
  public static abstract interface a
  {
    public abstract boolean bCj();
    
    public abstract void remove(int paramInt);
    
    public abstract void xt(int paramInt);
  }
  
  public static final class b
  {
    static void a(d paramd, String paramString, int paramInt1, ArrayList<String> paramArrayList, y.a parama, boolean paramBoolean, int paramInt2)
    {
      GMTrace.i(20497865637888L, 152721);
      if (paramd == null)
      {
        w.e("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorizeConfirm invoker null");
        GMTrace.o(20497865637888L, 152721);
        return;
      }
      Bundle localBundle = new Bundle();
      localBundle.putString("oauth_url", paramString);
      localBundle.putInt("opt", paramInt1);
      localBundle.putStringArrayList("scopes", paramArrayList);
      localBundle.putInt("webview_binder_id", paramInt2);
      if (paramBoolean) {}
      try
      {
        parama.xt(1373);
        paramd.q(1373, localBundle);
        GMTrace.o(20497865637888L, 152721);
        return;
      }
      catch (RemoteException paramd)
      {
        w.w("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorizeConfirm doScene exp : %s", new Object[] { paramd.getLocalizedMessage() });
        GMTrace.o(20497865637888L, 152721);
      }
    }
    
    public static boolean a(d paramd)
    {
      GMTrace.i(18180193910784L, 135453);
      try
      {
        paramd = paramd.d(93, new Bundle());
        if (paramd == null)
        {
          w.w("MicroMsg.OauthAuthorizeLogic", "shouldNativeOauthIntercept Bundle isOauthNative null");
          GMTrace.o(18180193910784L, 135453);
          return false;
        }
        boolean bool = paramd.getBoolean("is_oauth_native");
        GMTrace.o(18180193910784L, 135453);
        return bool;
      }
      catch (RemoteException paramd)
      {
        w.w("MicroMsg.OauthAuthorizeLogic", "shouldNativeOauthIntercept exp:%s", new Object[] { paramd.getLocalizedMessage() });
        GMTrace.o(18180193910784L, 135453);
      }
      return false;
    }
    
    public static boolean a(String paramString, d paramd)
    {
      GMTrace.i(18180059693056L, 135452);
      if ((y.rEr == null) && (!y.rEs)) {}
      try
      {
        Object localObject = paramd.d(94, new Bundle());
        paramd = null;
        if (localObject != null) {
          paramd = ((Bundle)localObject).getString("oauth_host_paths");
        }
        localObject = paramd;
        if (bg.nm(paramd)) {
          localObject = "open.weixin.qq.com/connect/oauth2/authorize";
        }
        y.rEr = ((String)localObject).split(";");
        y.rEs = true;
        if ((y.rEr == null) || (y.rEr.length == 0))
        {
          w.i("MicroMsg.OauthAuthorizeLogic", "isOauthHost sOauthHostPaths nil");
          GMTrace.o(18180059693056L, 135452);
          return false;
        }
      }
      catch (RemoteException paramString)
      {
        w.w("MicroMsg.OauthAuthorizeLogic", "isOauthHost exp:%s", new Object[] { paramString.getLocalizedMessage() });
        GMTrace.o(18180059693056L, 135452);
        return false;
      }
      paramString = Uri.parse(paramString);
      paramString = paramString.getAuthority() + paramString.getPath();
      if (bg.nm(paramString))
      {
        w.i("MicroMsg.OauthAuthorizeLogic", "isOauthHost target nil");
        GMTrace.o(18180059693056L, 135452);
        return false;
      }
      w.d("MicroMsg.OauthAuthorizeLogic", "isOauthHost target:%s", new Object[] { paramString });
      int i = 0;
      while (i < y.rEr.length)
      {
        if (paramString.equalsIgnoreCase(y.rEr[i]))
        {
          GMTrace.o(18180059693056L, 135452);
          return true;
        }
        i += 1;
      }
      GMTrace.o(18180059693056L, 135452);
      return false;
    }
    
    public static boolean a(String paramString1, String paramString2, int paramInt1, d paramd, y.c paramc, final y.a parama, int paramInt2)
    {
      GMTrace.i(20497731420160L, 152720);
      if (paramd == null)
      {
        w.e("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize invoker null");
        GMTrace.o(20497731420160L, 152720);
        return false;
      }
      w.i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize scene: %d", new Object[] { Integer.valueOf(paramInt1) });
      paramc.c(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(18179657039872L, 135449);
          w.i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize user cancel");
          this.rEt.ase();
          parama.remove(1254);
          GMTrace.o(18179657039872L, 135449);
        }
      });
      paramc = new Bundle();
      paramc.putString("oauth_url", paramString1);
      paramc.putString("biz_username", paramString2);
      paramc.putInt("scene", paramInt1);
      paramc.putInt("webview_binder_id", paramInt2);
      try
      {
        parama.xt(1254);
        paramd.q(1254, paramc);
        GMTrace.o(20497731420160L, 152720);
        return true;
      }
      catch (RemoteException paramString1)
      {
        w.w("MicroMsg.OauthAuthorizeLogic", "invoker.doScene exp : %s", new Object[] { paramString1.getLocalizedMessage() });
        GMTrace.o(20497731420160L, 152720);
      }
      return false;
    }
  }
  
  public static abstract interface c
  {
    public abstract void Le(String paramString);
    
    public abstract void ase();
    
    public abstract void c(DialogInterface.OnCancelListener paramOnCancelListener);
    
    public abstract void goBack();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\model\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */