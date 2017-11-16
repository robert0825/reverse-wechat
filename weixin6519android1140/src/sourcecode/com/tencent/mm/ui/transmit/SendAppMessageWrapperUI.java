package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.kernel.h;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.protocal.c.buj;
import com.tencent.mm.protocal.c.buk;
import com.tencent.mm.protocal.c.but;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.u.b;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class SendAppMessageWrapperUI
  extends MMActivity
{
  private String aEe;
  private aj euU;
  private int leu;
  private int scene;
  private String toUser;
  private WXMediaMessage wBf;
  private f xlY;
  private boolean xlZ;
  
  public SendAppMessageWrapperUI()
  {
    GMTrace.i(3049829433344L, 22723);
    this.aEe = null;
    this.xlY = null;
    this.toUser = null;
    this.wBf = null;
    this.scene = 0;
    this.xlZ = false;
    this.leu = 0;
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3015738130432L, 22469);
        if ((SendAppMessageWrapperUI.this.getWindow() == null) || (SendAppMessageWrapperUI.this.getWindow().getDecorView() == null) || (SendAppMessageWrapperUI.this.getWindow().getDecorView().getWindowToken() == null))
        {
          if (SendAppMessageWrapperUI.a(SendAppMessageWrapperUI.this) < 10)
          {
            SendAppMessageWrapperUI.b(SendAppMessageWrapperUI.this);
            GMTrace.o(3015738130432L, 22469);
            return true;
          }
          GMTrace.o(3015738130432L, 22469);
          return false;
        }
        SendAppMessageWrapperUI.c(SendAppMessageWrapperUI.this);
        GMTrace.o(3015738130432L, 22469);
        return false;
      }
    }, true);
    GMTrace.o(3049829433344L, 22723);
  }
  
  private o.a a(final WXMediaMessage paramWXMediaMessage)
  {
    GMTrace.i(17933904379904L, 133618);
    paramWXMediaMessage = new o.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(3038018273280L, 22635);
        if (paramAnonymousBoolean)
        {
          SendAppMessageWrapperUI.a(SendAppMessageWrapperUI.this, paramWXMediaMessage, paramAnonymousString, paramAnonymousInt);
          GMTrace.o(3038018273280L, 22635);
          return;
        }
        SendAppMessageWrapperUI.d(SendAppMessageWrapperUI.this);
        GMTrace.o(3038018273280L, 22635);
      }
    };
    GMTrace.o(17933904379904L, 133618);
    return paramWXMediaMessage;
  }
  
  private void a(final WXMediaMessage paramWXMediaMessage, final LinkedList<String> paramLinkedList)
  {
    GMTrace.i(17934038597632L, 133619);
    final WXMiniProgramObject localWXMiniProgramObject = (WXMiniProgramObject)paramWXMediaMessage.mediaObject;
    ((com.tencent.mm.plugin.appbrand.k.b)h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(localWXMiniProgramObject.userName);
    final Object localObject1 = new StringBuilder("1_");
    ((StringBuilder)localObject1).append(this.xlY.field_appId);
    ((StringBuilder)localObject1).append("_");
    at.AR();
    ((StringBuilder)localObject1).append(o.getString(c.ww()));
    ((StringBuilder)localObject1).append("_");
    ((StringBuilder)localObject1).append(bg.Pu());
    ((StringBuilder)localObject1).append("_");
    ((StringBuilder)localObject1).append("1");
    final Object localObject2 = ((StringBuilder)localObject1).toString();
    localObject1 = ((com.tencent.mm.plugin.appbrand.k.b)h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(localWXMiniProgramObject.userName);
    Object localObject3;
    Object localObject4;
    if (localWXMiniProgramObject.withShareTicket)
    {
      if (localObject1 == null)
      {
        w.e("MicroMsg.SendAppMessageWrapperUI", "get wxaAttributes for appbrand info failed");
        setResult(-1);
        finish();
        ReportUtil.a(this, ReportUtil.b(getIntent().getExtras(), -1));
        GMTrace.o(17934038597632L, 133619);
        return;
      }
      localObject3 = new b.a();
      ((b.a)localObject3).gtE = 1118;
      ((b.a)localObject3).uri = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
      localObject4 = new buj();
      ((buj)localObject4).eSd = ((WxaAttributes)localObject1).field_appId;
      ((buj)localObject4).vcL = paramLinkedList;
      ((b.a)localObject3).gtF = ((com.tencent.mm.bm.a)localObject4);
      ((b.a)localObject3).gtG = new buk();
      com.tencent.mm.ad.u.a(((b.a)localObject3).DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(17930683154432L, 133594);
          w.i("MicroMsg.SendAppMessageWrapperUI", "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          paramAnonymousString = (buk)paramAnonymousb.gtD.gtK;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (paramAnonymousString != null) && (paramAnonymousString.vcM != null))
          {
            if (paramAnonymousString.vcM == null)
            {
              paramAnonymousString = new LinkedList();
              w.i("MicroMsg.SendAppMessageWrapperUI", "get wxaAppShareInfoList size = %d, toUserList size = %d", new Object[] { Integer.valueOf(paramAnonymousString.size()), Integer.valueOf(paramLinkedList.size()) });
              paramAnonymousInt1 = 0;
              label119:
              if (paramAnonymousInt1 >= paramLinkedList.size()) {
                break label348;
              }
              if (paramAnonymousInt1 >= paramAnonymousString.size()) {
                break label272;
              }
            }
            label272:
            for (paramAnonymousb = (but)paramAnonymousString.get(paramAnonymousInt1);; paramAnonymousb = new but())
            {
              paramAnonymousk = new f.a();
              paramAnonymousk.appId = SendAppMessageWrapperUI.e(SendAppMessageWrapperUI.this).field_appId;
              paramAnonymousk.gkS = localObject1.field_appId;
              paramAnonymousk.gkY = localWXMiniProgramObject.miniprogramType;
              paramAnonymousk.appName = SendAppMessageWrapperUI.e(SendAppMessageWrapperUI.this).field_appName;
              paramAnonymousk.giy = 2;
              paramAnonymousk.gkX = paramAnonymousb.vdk;
              paramAnonymousk.gkW = localObject2;
              l.a(paramAnonymousk, paramWXMediaMessage, (String)paramLinkedList.get(paramAnonymousInt1));
              paramAnonymousInt1 += 1;
              break label119;
              paramAnonymousString = paramAnonymousString.vcM;
              break;
            }
          }
          else
          {
            paramAnonymousString = paramLinkedList.iterator();
            while (paramAnonymousString.hasNext())
            {
              paramAnonymousb = (String)paramAnonymousString.next();
              l.a(paramWXMediaMessage, SendAppMessageWrapperUI.e(SendAppMessageWrapperUI.this).field_appId, SendAppMessageWrapperUI.e(SendAppMessageWrapperUI.this).field_appName, paramAnonymousb, 2, null, null);
            }
          }
          label348:
          GMTrace.o(17930683154432L, 133594);
          return 0;
        }
      });
      paramLinkedList = paramLinkedList.iterator();
      label295:
      if (!paramLinkedList.hasNext()) {
        break label582;
      }
      localObject1 = (String)paramLinkedList.next();
      if (!((String)localObject1).endsWith("chatroom")) {
        break label577;
      }
    }
    label577:
    for (int i = 1;; i = 0)
    {
      localObject2 = p.encode(bg.nl(localWXMiniProgramObject.webpageUrl));
      localObject3 = p.encode(bg.nl(paramWXMediaMessage.title));
      localObject4 = p.encode(bg.nl(paramWXMediaMessage.description));
      String str = p.encode(bg.nl(localWXMiniProgramObject.path));
      com.tencent.mm.plugin.report.service.g.ork.i(14127, new Object[] { this.xlY.field_appId, localWXMiniProgramObject.userName, str, localObject3, localObject4, "", localObject2, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i), localObject1 });
      break label295;
      localObject2 = paramLinkedList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        localObject4 = new f.a();
        ((f.a)localObject4).appId = this.xlY.field_appId;
        ((f.a)localObject4).gkS = ((WxaAttributes)localObject1).field_appId;
        ((f.a)localObject4).gkY = localWXMiniProgramObject.miniprogramType;
        ((f.a)localObject4).appName = this.xlY.field_appName;
        ((f.a)localObject4).giy = 2;
        l.a((f.a)localObject4, paramWXMediaMessage, (String)localObject3);
      }
      break;
    }
    label582:
    GMTrace.o(17934038597632L, 133619);
  }
  
  private void ciL()
  {
    GMTrace.i(20402705268736L, 152012);
    Intent localIntent = com.tencent.mm.modelsns.a.a(this.wBf, this.xlY.field_appId, this.xlY.field_appName);
    if (localIntent == null)
    {
      finish();
      GMTrace.o(20402705268736L, 152012);
      return;
    }
    String str = null;
    if ((this.wBf.getType() == 5) || (this.wBf.getType() == 2) || (this.wBf.getType() == 38))
    {
      w.d("MicroMsg.SendAppMessageWrapperUI", "report(11954), to timeline, appId : %s", new Object[] { this.xlY.field_appId });
      str = com.tencent.mm.y.u.gy("app_" + this.xlY.field_appId);
      u.b localb = com.tencent.mm.y.u.Av().p(str, true);
      localb.o("prePublishId", "app_" + this.xlY.field_appId);
      if ((this.wBf.mediaObject instanceof WXWebpageObject)) {
        localb.o("url", ((WXWebpageObject)this.wBf.mediaObject).webpageUrl);
      }
    }
    localIntent.putExtra("reportSessionId", str);
    d.b(this, "sns", ".ui.En_c4f742e5", localIntent, 1);
    GMTrace.o(20402705268736L, 152012);
  }
  
  protected final void MP()
  {
    GMTrace.i(3050634739712L, 22729);
    GMTrace.o(3050634739712L, 22729);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3050768957440L, 22730);
    GMTrace.o(3050768957440L, 22730);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(3050097868800L, 22725);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.SendAppMessageWrapperUI", "requestCode " + paramInt1 + " resultCode " + paramInt2);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1) {
        ReportUtil.a(this, ReportUtil.b(getIntent().getExtras(), 0));
      }
      for (;;)
      {
        finish();
        GMTrace.o(3050097868800L, 22725);
        return;
        ReportUtil.a(this, ReportUtil.b(getIntent().getExtras(), -2));
      }
    }
    if ((paramInt1 == 2) && (paramInt2 == -1))
    {
      WXVideoFileObject localWXVideoFileObject = (WXVideoFileObject)this.wBf.mediaObject;
      localWXVideoFileObject.filePath = paramIntent.getStringExtra("K_SEGMENTVIDEOPATH");
      if ((!bg.nm(localWXVideoFileObject.filePath)) && (e.aZ(localWXVideoFileObject.filePath)))
      {
        ciL();
        GMTrace.o(3050097868800L, 22725);
        return;
      }
      setResult(-5);
      finish();
    }
    GMTrace.o(3050097868800L, 22725);
  }
  
  /* Error */
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc2_w 913
    //   3: sipush 22724
    //   6: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 916	com/tencent/mm/ui/MMActivity:onCreate	(Landroid/os/Bundle;)V
    //   14: aload_0
    //   15: invokevirtual 922	android/support/v7/app/AppCompatActivity:cN	()Landroid/support/v7/app/d;
    //   18: invokevirtual 928	android/support/v7/app/d:cO	()Landroid/support/v7/app/ActionBar;
    //   21: invokevirtual 933	android/support/v7/app/ActionBar:hide	()V
    //   24: aload_0
    //   25: invokestatic 938	com/tencent/mm/sdk/platformtools/ab:bPU	()Ljava/lang/String;
    //   28: iconst_0
    //   29: invokevirtual 942	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   32: astore_1
    //   33: aload_1
    //   34: ldc_w 944
    //   37: iconst_0
    //   38: invokeinterface 950 3 0
    //   43: ifne +42 -> 85
    //   46: ldc -89
    //   48: ldc_w 952
    //   51: invokestatic 508	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: aload_0
    //   55: iconst_1
    //   56: putfield 57	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:xlZ	Z
    //   59: aload_0
    //   60: iconst_m1
    //   61: invokevirtual 955	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:setRequestedOrientation	(I)V
    //   64: aload_1
    //   65: invokeinterface 959 1 0
    //   70: ldc_w 944
    //   73: iconst_1
    //   74: invokeinterface 965 3 0
    //   79: invokeinterface 968 1 0
    //   84: pop
    //   85: aload_0
    //   86: invokevirtual 186	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getIntent	()Landroid/content/Intent;
    //   89: invokevirtual 192	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   92: astore 5
    //   94: new 970	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req
    //   97: dup
    //   98: aload 5
    //   100: invokespecial 972	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:<init>	(Landroid/os/Bundle;)V
    //   103: astore 4
    //   105: aload_0
    //   106: aload 5
    //   108: ldc_w 738
    //   111: invokevirtual 974	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   114: putfield 51	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:toUser	Ljava/lang/String;
    //   117: aload_0
    //   118: aload 5
    //   120: ldc_w 976
    //   123: iconst_0
    //   124: invokevirtual 977	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   127: putfield 55	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:scene	I
    //   130: aload 5
    //   132: ldc_w 979
    //   135: invokevirtual 974	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   138: astore_3
    //   139: aload_3
    //   140: astore_1
    //   141: aload_3
    //   142: ifnonnull +21 -> 163
    //   145: aload 5
    //   147: ldc_w 981
    //   150: invokevirtual 974	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   153: invokestatic 987	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   156: ldc_w 989
    //   159: invokevirtual 992	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   162: astore_1
    //   163: aload_0
    //   164: new 120	com/tencent/mm/pluginsdk/model/app/f
    //   167: dup
    //   168: invokespecial 993	com/tencent/mm/pluginsdk/model/app/f:<init>	()V
    //   171: putfield 49	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:xlY	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   174: aload_0
    //   175: getfield 49	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:xlY	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   178: aload_1
    //   179: putfield 123	com/tencent/mm/pluginsdk/model/app/f:field_appId	Ljava/lang/String;
    //   182: invokestatic 999	com/tencent/mm/pluginsdk/model/app/an:aWy	()Lcom/tencent/mm/pluginsdk/model/app/i;
    //   185: aload_0
    //   186: getfield 49	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:xlY	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   189: iconst_0
    //   190: anewarray 265	java/lang/String
    //   193: invokevirtual 1004	com/tencent/mm/pluginsdk/model/app/i:b	(Lcom/tencent/mm/sdk/e/c;[Ljava/lang/String;)Z
    //   196: pop
    //   197: aload_0
    //   198: getfield 49	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:xlY	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   201: getfield 329	com/tencent/mm/pluginsdk/model/app/f:field_appName	Ljava/lang/String;
    //   204: ifnonnull +103 -> 307
    //   207: aload_0
    //   208: getstatic 1007	com/tencent/mm/R$l:diz	I
    //   211: invokevirtual 473	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getString	(I)Ljava/lang/String;
    //   214: astore_1
    //   215: aload_0
    //   216: aload_0
    //   217: getstatic 1010	com/tencent/mm/R$l:dix	I
    //   220: iconst_1
    //   221: anewarray 300	java/lang/Object
    //   224: dup
    //   225: iconst_0
    //   226: aload_1
    //   227: aastore
    //   228: invokevirtual 504	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   231: putfield 47	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:aEe	Ljava/lang/String;
    //   234: aload_0
    //   235: aload 4
    //   237: getfield 1013	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   240: putfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:wBf	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   243: ldc -89
    //   245: ldc_w 1015
    //   248: iconst_2
    //   249: anewarray 300	java/lang/Object
    //   252: dup
    //   253: iconst_0
    //   254: aload_0
    //   255: getfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:wBf	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   258: getfield 1018	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageAction	Ljava/lang/String;
    //   261: aastore
    //   262: dup
    //   263: iconst_1
    //   264: aload_0
    //   265: getfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:wBf	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   268: getfield 1021	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageExt	Ljava/lang/String;
    //   271: aastore
    //   272: invokestatic 1023	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   275: aload_0
    //   276: getfield 55	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:scene	I
    //   279: iconst_1
    //   280: if_icmpne +985 -> 1265
    //   283: aload_0
    //   284: getfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:wBf	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   287: getfield 94	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   290: ifnonnull +36 -> 326
    //   293: aload_0
    //   294: invokevirtual 182	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   297: ldc2_w 913
    //   300: sipush 22724
    //   303: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   306: return
    //   307: aload_0
    //   308: getfield 780	com/tencent/mm/ui/MMActivity:vKB	Lcom/tencent/mm/ui/p;
    //   311: getfield 602	com/tencent/mm/ui/p:vKW	Landroid/support/v7/app/ActionBarActivity;
    //   314: aload_0
    //   315: getfield 49	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:xlY	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   318: aconst_null
    //   319: invokestatic 1026	com/tencent/mm/pluginsdk/model/app/g:a	(Landroid/content/Context;Lcom/tencent/mm/pluginsdk/model/app/f;Ljava/lang/String;)Ljava/lang/String;
    //   322: astore_1
    //   323: goto -108 -> 215
    //   326: aload_0
    //   327: getfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:wBf	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   330: invokevirtual 363	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   333: bipush 38
    //   335: if_icmpne +302 -> 637
    //   338: aload_0
    //   339: getfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:wBf	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   342: getfield 94	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   345: checkcast 894	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject
    //   348: astore_1
    //   349: aload_1
    //   350: getfield 902	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   353: astore 5
    //   355: aload_1
    //   356: getfield 902	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   359: invokestatic 746	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   362: ifne +268 -> 630
    //   365: aload_1
    //   366: getfield 902	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   369: invokestatic 906	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
    //   372: ifeq +258 -> 630
    //   375: new 1028	android/media/MediaMetadataRetriever
    //   378: dup
    //   379: invokespecial 1029	android/media/MediaMetadataRetriever:<init>	()V
    //   382: astore_3
    //   383: aload_3
    //   384: astore_1
    //   385: aload_3
    //   386: aload 5
    //   388: invokevirtual 1032	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   391: aload_3
    //   392: astore_1
    //   393: aload_3
    //   394: bipush 9
    //   396: invokevirtual 1035	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   399: iconst_m1
    //   400: invokestatic 420	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   403: istore_2
    //   404: aload_3
    //   405: astore_1
    //   406: ldc -89
    //   408: ldc_w 1037
    //   411: iconst_1
    //   412: anewarray 300	java/lang/Object
    //   415: dup
    //   416: iconst_0
    //   417: iload_2
    //   418: invokestatic 308	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   421: aastore
    //   422: invokestatic 1023	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   425: iload_2
    //   426: sipush 10500
    //   429: if_icmplt +17 -> 446
    //   432: aload_3
    //   433: astore_1
    //   434: aload_0
    //   435: bipush -5
    //   437: invokevirtual 179	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:setResult	(I)V
    //   440: aload_3
    //   441: astore_1
    //   442: aload_0
    //   443: invokevirtual 182	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   446: aload_3
    //   447: invokevirtual 1040	android/media/MediaMetadataRetriever:release	()V
    //   450: new 188	android/content/Intent
    //   453: dup
    //   454: invokespecial 864	android/content/Intent:<init>	()V
    //   457: astore_1
    //   458: aload_1
    //   459: ldc_w 896
    //   462: aload 5
    //   464: invokevirtual 852	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   467: pop
    //   468: aload_1
    //   469: ldc_w 1042
    //   472: ldc_w 302
    //   475: invokevirtual 852	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   478: pop
    //   479: aload_0
    //   480: ldc_w 1044
    //   483: ldc_w 1046
    //   486: aload_1
    //   487: iconst_2
    //   488: invokestatic 861	com/tencent/mm/bj/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;I)V
    //   491: ldc2_w 913
    //   494: sipush 22724
    //   497: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   500: return
    //   501: astore_1
    //   502: ldc -89
    //   504: aload_1
    //   505: ldc_w 1048
    //   508: iconst_1
    //   509: anewarray 300	java/lang/Object
    //   512: dup
    //   513: iconst_0
    //   514: aload_1
    //   515: invokevirtual 1051	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   518: aastore
    //   519: invokestatic 1055	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   522: goto -72 -> 450
    //   525: astore 4
    //   527: aconst_null
    //   528: astore_3
    //   529: aload_3
    //   530: astore_1
    //   531: ldc -89
    //   533: aload 4
    //   535: ldc_w 1057
    //   538: iconst_2
    //   539: anewarray 300	java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: aload 5
    //   546: aastore
    //   547: dup
    //   548: iconst_1
    //   549: aload 4
    //   551: invokevirtual 1051	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   554: aastore
    //   555: invokestatic 1055	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   558: aload_3
    //   559: ifnull -109 -> 450
    //   562: aload_3
    //   563: invokevirtual 1040	android/media/MediaMetadataRetriever:release	()V
    //   566: goto -116 -> 450
    //   569: astore_1
    //   570: ldc -89
    //   572: aload_1
    //   573: ldc_w 1048
    //   576: iconst_1
    //   577: anewarray 300	java/lang/Object
    //   580: dup
    //   581: iconst_0
    //   582: aload_1
    //   583: invokevirtual 1051	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   586: aastore
    //   587: invokestatic 1055	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   590: goto -140 -> 450
    //   593: astore_3
    //   594: aconst_null
    //   595: astore_1
    //   596: aload_1
    //   597: ifnull +7 -> 604
    //   600: aload_1
    //   601: invokevirtual 1040	android/media/MediaMetadataRetriever:release	()V
    //   604: aload_3
    //   605: athrow
    //   606: astore_1
    //   607: ldc -89
    //   609: aload_1
    //   610: ldc_w 1048
    //   613: iconst_1
    //   614: anewarray 300	java/lang/Object
    //   617: dup
    //   618: iconst_0
    //   619: aload_1
    //   620: invokevirtual 1051	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   623: aastore
    //   624: invokestatic 1055	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   627: goto -23 -> 604
    //   630: aload_0
    //   631: invokevirtual 182	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   634: goto -184 -> 450
    //   637: aload_0
    //   638: getfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:wBf	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   641: invokevirtual 363	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   644: bipush 39
    //   646: if_icmpne +605 -> 1251
    //   649: aload_0
    //   650: getfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:wBf	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   653: getfield 94	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   656: checkcast 1059	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject
    //   659: astore_1
    //   660: aload_1
    //   661: getfield 1060	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   664: invokestatic 746	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   667: ifne +62 -> 729
    //   670: aload_1
    //   671: getfield 1060	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   674: invokestatic 906	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
    //   677: ifeq +52 -> 729
    //   680: aload_1
    //   681: getfield 1060	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   684: astore_1
    //   685: invokestatic 408	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   688: ldc_w 1062
    //   691: ldc_w 1063
    //   694: invokevirtual 1064	com/tencent/mm/k/e:getInt	(Ljava/lang/String;I)I
    //   697: istore_2
    //   698: aload_1
    //   699: invokestatic 1070	com/tencent/mm/modelsfs/FileOp:kX	(Ljava/lang/String;)J
    //   702: iload_2
    //   703: i2l
    //   704: lcmp
    //   705: ifle +54 -> 759
    //   708: ldc_w 1072
    //   711: ldc_w 1074
    //   714: invokestatic 175	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   717: iconst_1
    //   718: istore_2
    //   719: iload_2
    //   720: ifeq +44 -> 764
    //   723: iconst_1
    //   724: istore_2
    //   725: iload_2
    //   726: ifeq +525 -> 1251
    //   729: aload_0
    //   730: aload_0
    //   731: invokevirtual 186	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getIntent	()Landroid/content/Intent;
    //   734: invokevirtual 192	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   737: bipush -5
    //   739: invokestatic 198	com/tencent/mm/pluginsdk/model/app/ReportUtil:b	(Landroid/os/Bundle;I)Lcom/tencent/mm/pluginsdk/model/app/ReportUtil$ReportArgs;
    //   742: invokestatic 201	com/tencent/mm/pluginsdk/model/app/ReportUtil:a	(Landroid/content/Context;Lcom/tencent/mm/pluginsdk/model/app/ReportUtil$ReportArgs;)V
    //   745: aload_0
    //   746: invokevirtual 182	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   749: ldc2_w 913
    //   752: sipush 22724
    //   755: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   758: return
    //   759: iconst_0
    //   760: istore_2
    //   761: goto -42 -> 719
    //   764: aload_1
    //   765: invokestatic 1080	com/tencent/mm/modelsns/a$a:lt	(Ljava/lang/String;)Lcom/tencent/mm/modelsns/a$a;
    //   768: astore_1
    //   769: aload_1
    //   770: getfield 1083	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   773: ifle +46 -> 819
    //   776: aload_1
    //   777: getfield 1086	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   780: ifle +39 -> 819
    //   783: aload_1
    //   784: getfield 1083	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   787: i2f
    //   788: aload_1
    //   789: getfield 1086	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   792: i2f
    //   793: fdiv
    //   794: ldc_w 1087
    //   797: fcmpl
    //   798: ifgt +21 -> 819
    //   801: aload_1
    //   802: getfield 1083	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   805: i2f
    //   806: aload_1
    //   807: getfield 1086	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   810: i2f
    //   811: fdiv
    //   812: ldc_w 1088
    //   815: fcmpg
    //   816: ifge +193 -> 1009
    //   819: ldc_w 1072
    //   822: ldc_w 1090
    //   825: iconst_2
    //   826: anewarray 300	java/lang/Object
    //   829: dup
    //   830: iconst_0
    //   831: aload_1
    //   832: getfield 1083	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   835: invokestatic 308	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   838: aastore
    //   839: dup
    //   840: iconst_1
    //   841: aload_1
    //   842: getfield 1086	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   845: invokestatic 308	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   848: aastore
    //   849: invokestatic 1023	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   852: iconst_1
    //   853: istore_2
    //   854: iload_2
    //   855: ifne +149 -> 1004
    //   858: ldc_w 1072
    //   861: ldc_w 1092
    //   864: iconst_1
    //   865: anewarray 300	java/lang/Object
    //   868: dup
    //   869: iconst_0
    //   870: aload_1
    //   871: getfield 1095	com/tencent/mm/modelsns/a$a:gVq	I
    //   874: invokestatic 308	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   877: aastore
    //   878: invokestatic 1023	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   881: aload_1
    //   882: getfield 1095	com/tencent/mm/modelsns/a$a:gVq	I
    //   885: sipush 1000
    //   888: if_icmpgt +126 -> 1014
    //   891: iconst_1
    //   892: istore_2
    //   893: iload_2
    //   894: ifne +110 -> 1004
    //   897: ldc_w 1072
    //   900: ldc_w 1097
    //   903: iconst_1
    //   904: anewarray 300	java/lang/Object
    //   907: dup
    //   908: iconst_0
    //   909: aload_1
    //   910: aastore
    //   911: invokestatic 351	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   914: aload_1
    //   915: getfield 1100	com/tencent/mm/modelsns/a$a:gVn	Ljava/lang/String;
    //   918: invokestatic 746	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   921: ifne +57 -> 978
    //   924: aload_1
    //   925: getfield 1100	com/tencent/mm/modelsns/a$a:gVn	Ljava/lang/String;
    //   928: astore_3
    //   929: aload_3
    //   930: invokestatic 746	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   933: ifeq +101 -> 1034
    //   936: iconst_1
    //   937: istore_2
    //   938: iload_2
    //   939: ifne +39 -> 978
    //   942: ldc_w 1102
    //   945: aload_1
    //   946: getfield 1105	com/tencent/mm/modelsns/a$a:gVo	Ljava/lang/String;
    //   949: invokevirtual 1108	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   952: ifeq +26 -> 978
    //   955: aload_1
    //   956: getfield 1111	com/tencent/mm/modelsns/a$a:gVp	Ljava/lang/String;
    //   959: invokestatic 746	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   962: ifne +279 -> 1241
    //   965: ldc_w 1113
    //   968: aload_1
    //   969: getfield 1111	com/tencent/mm/modelsns/a$a:gVp	Ljava/lang/String;
    //   972: invokevirtual 1108	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   975: ifne +266 -> 1241
    //   978: ldc_w 1072
    //   981: ldc_w 1115
    //   984: iconst_1
    //   985: anewarray 300	java/lang/Object
    //   988: dup
    //   989: iconst_0
    //   990: aload_1
    //   991: getfield 1105	com/tencent/mm/modelsns/a$a:gVo	Ljava/lang/String;
    //   994: aastore
    //   995: invokestatic 1023	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   998: iconst_1
    //   999: istore_2
    //   1000: iload_2
    //   1001: ifeq +245 -> 1246
    //   1004: iconst_1
    //   1005: istore_2
    //   1006: goto -281 -> 725
    //   1009: iconst_0
    //   1010: istore_2
    //   1011: goto -157 -> 854
    //   1014: aload_1
    //   1015: getfield 1095	com/tencent/mm/modelsns/a$a:gVq	I
    //   1018: sipush 10500
    //   1021: if_icmplt +8 -> 1029
    //   1024: iconst_1
    //   1025: istore_2
    //   1026: goto -133 -> 893
    //   1029: iconst_0
    //   1030: istore_2
    //   1031: goto -138 -> 893
    //   1034: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1037: ifnonnull +148 -> 1185
    //   1040: new 1121	java/util/HashSet
    //   1043: dup
    //   1044: invokespecial 1122	java/util/HashSet:<init>	()V
    //   1047: astore 4
    //   1049: aload 4
    //   1051: putstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1054: aload 4
    //   1056: ldc_w 1124
    //   1059: invokeinterface 1129 2 0
    //   1064: pop
    //   1065: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1068: ldc_w 1131
    //   1071: invokeinterface 1129 2 0
    //   1076: pop
    //   1077: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1080: ldc_w 1133
    //   1083: invokeinterface 1129 2 0
    //   1088: pop
    //   1089: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1092: ldc_w 1135
    //   1095: invokeinterface 1129 2 0
    //   1100: pop
    //   1101: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1104: ldc_w 1137
    //   1107: invokeinterface 1129 2 0
    //   1112: pop
    //   1113: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1116: ldc_w 1139
    //   1119: invokeinterface 1129 2 0
    //   1124: pop
    //   1125: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1128: ldc_w 1141
    //   1131: invokeinterface 1129 2 0
    //   1136: pop
    //   1137: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1140: ldc_w 1143
    //   1143: invokeinterface 1129 2 0
    //   1148: pop
    //   1149: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1152: ldc_w 1145
    //   1155: invokeinterface 1129 2 0
    //   1160: pop
    //   1161: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1164: ldc_w 1147
    //   1167: invokeinterface 1129 2 0
    //   1172: pop
    //   1173: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1176: ldc_w 1149
    //   1179: invokeinterface 1129 2 0
    //   1184: pop
    //   1185: aload_3
    //   1186: invokevirtual 1152	java/lang/String:trim	()Ljava/lang/String;
    //   1189: astore_3
    //   1190: aload_3
    //   1191: ldc_w 1154
    //   1194: invokevirtual 1157	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   1197: istore_2
    //   1198: iload_2
    //   1199: iflt +11 -> 1210
    //   1202: iload_2
    //   1203: aload_3
    //   1204: invokevirtual 493	java/lang/String:length	()I
    //   1207: if_icmplt +8 -> 1215
    //   1210: iconst_1
    //   1211: istore_2
    //   1212: goto -274 -> 938
    //   1215: getstatic 1119	com/tencent/mm/modelsns/a:gVm	Ljava/util/Set;
    //   1218: aload_3
    //   1219: iload_2
    //   1220: invokevirtual 1160	java/lang/String:substring	(I)Ljava/lang/String;
    //   1223: invokeinterface 1163 2 0
    //   1228: ifne +8 -> 1236
    //   1231: iconst_1
    //   1232: istore_2
    //   1233: goto -295 -> 938
    //   1236: iconst_0
    //   1237: istore_2
    //   1238: goto -300 -> 938
    //   1241: iconst_0
    //   1242: istore_2
    //   1243: goto -243 -> 1000
    //   1246: iconst_0
    //   1247: istore_2
    //   1248: goto -523 -> 725
    //   1251: aload_0
    //   1252: invokespecial 908	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:ciL	()V
    //   1255: ldc2_w 913
    //   1258: sipush 22724
    //   1261: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1264: return
    //   1265: aload_0
    //   1266: getfield 69	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:euU	Lcom/tencent/mm/sdk/platformtools/aj;
    //   1269: ldc2_w 1164
    //   1272: ldc2_w 1164
    //   1275: invokevirtual 1169	com/tencent/mm/sdk/platformtools/aj:z	(JJ)V
    //   1278: ldc2_w 913
    //   1281: sipush 22724
    //   1284: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1287: return
    //   1288: astore_3
    //   1289: goto -693 -> 596
    //   1292: astore 4
    //   1294: goto -765 -> 529
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1297	0	this	SendAppMessageWrapperUI
    //   0	1297	1	paramBundle	android.os.Bundle
    //   403	845	2	i	int
    //   138	425	3	localObject1	Object
    //   593	12	3	localObject2	Object
    //   928	291	3	str	String
    //   1288	1	3	localObject3	Object
    //   103	133	4	localReq	com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req
    //   525	25	4	localException1	Exception
    //   1047	8	4	localHashSet	java.util.HashSet
    //   1292	1	4	localException2	Exception
    //   92	453	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   446	450	501	java/lang/Exception
    //   375	383	525	java/lang/Exception
    //   562	566	569	java/lang/Exception
    //   375	383	593	finally
    //   600	604	606	java/lang/Exception
    //   385	391	1288	finally
    //   393	404	1288	finally
    //   406	425	1288	finally
    //   434	440	1288	finally
    //   442	446	1288	finally
    //   531	558	1288	finally
    //   385	391	1292	java/lang/Exception
    //   393	404	1292	java/lang/Exception
    //   406	425	1292	java/lang/Exception
    //   434	440	1292	java/lang/Exception
    //   442	446	1292	java/lang/Exception
  }
  
  protected void onDestroy()
  {
    GMTrace.i(3050232086528L, 22726);
    super.onDestroy();
    if (this.xlZ)
    {
      w.d("MicroMsg.SendAppMessageWrapperUI", "restore orientation");
      SharedPreferences localSharedPreferences = getSharedPreferences(ab.bPU(), 0);
      setRequestedOrientation(1);
      localSharedPreferences.edit().putBoolean("settings_landscape_mode", false).commit();
    }
    GMTrace.o(3050232086528L, 22726);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3050366304256L, 22727);
    aLo();
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(3050366304256L, 22727);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\transmit\SendAppMessageWrapperUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */