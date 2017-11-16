package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.mm.opensdk.modelmsg.*;
import com.tencent.gmtrace.*;
import android.widget.*;
import com.tencent.mm.ui.widget.*;
import com.tencent.mm.ao.a.a.*;
import com.tencent.mm.ao.a.*;
import com.tencent.mm.sdk.platformtools.*;
import com.tencent.mm.*;
import android.os.*;
import android.view.*;
import com.tencent.xweb.*;

public class OAuthUI extends WebViewUI
{
    private String appId;
    private boolean mMT;
    private boolean rIQ;
    private SendAuth$Req rIR;
    private c rIS;
    private aj rIT;
    
    public OAuthUI() {
        GMTrace.i(12106707501056L, 90202);
        this.rIQ = true;
        this.mMT = false;
        GMTrace.o(12106707501056L, 90202);
    }
    
    static /* synthetic */ void a(final OAuthUI p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          5
        //     3: ldc2_w          12108452331520
        //     6: ldc             90215
        //     8: invokestatic    com/tencent/gmtrace/GMTrace.i:(JI)V
        //    11: ldc             "MicroMsg.OAuthUI"
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: ldc             "checkUrlAndLoad, url = "
        //    19: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    22: aload_1        
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    29: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //    32: aload_1        
        //    33: invokestatic    com/tencent/mm/sdk/platformtools/bg.nm:(Ljava/lang/String;)Z
        //    36: ifne            495
        //    39: aload_1        
        //    40: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    43: astore          6
        //    45: aload           6
        //    47: ifnonnull       67
        //    50: aload_0        
        //    51: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.nXD:Lcom/tencent/mm/ui/widget/MMWebView;
        //    54: aload_1        
        //    55: invokevirtual   com/tencent/mm/ui/widget/MMWebView.loadUrl:(Ljava/lang/String;)V
        //    58: ldc2_w          12108452331520
        //    61: ldc             90215
        //    63: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //    66: return         
        //    67: ldc             "MicroMsg.OAuthUI"
        //    69: new             Ljava/lang/StringBuilder;
        //    72: dup            
        //    73: ldc             "check schema as appId:"
        //    75: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    78: aload_0        
        //    79: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    88: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //    91: aload_0        
        //    92: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //    95: aload_0        
        //    96: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //    99: invokeinterface com/tencent/mm/plugin/webview/stub/d.LK:(Ljava/lang/String;)Ljava/lang/String;
        //   104: astore_3       
        //   105: aload_0        
        //   106: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //   109: invokeinterface com/tencent/mm/plugin/webview/stub/d.bDm:()Ljava/lang/String;
        //   114: astore_2       
        //   115: aload_0        
        //   116: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //   119: ldc             274436
        //   121: aconst_null    
        //   122: invokeinterface com/tencent/mm/plugin/webview/stub/d.aB:(ILjava/lang/String;)Ljava/lang/String;
        //   127: astore          4
        //   129: aload_3        
        //   130: invokestatic    com/tencent/mm/sdk/platformtools/bg.nm:(Ljava/lang/String;)Z
        //   133: ifeq            215
        //   136: ldc             "MicroMsg.OAuthUI"
        //   138: new             Ljava/lang/StringBuilder;
        //   141: dup            
        //   142: ldc             "find app info failed, appid="
        //   144: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   147: aload_0        
        //   148: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   157: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //   160: aload_0        
        //   161: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.nXD:Lcom/tencent/mm/ui/widget/MMWebView;
        //   164: aload_1        
        //   165: invokevirtual   com/tencent/mm/ui/widget/MMWebView.loadUrl:(Ljava/lang/String;)V
        //   168: ldc2_w          12108452331520
        //   171: ldc             90215
        //   173: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   176: return         
        //   177: astore          4
        //   179: aconst_null    
        //   180: astore_3       
        //   181: aconst_null    
        //   182: astore_2       
        //   183: ldc             "MicroMsg.OAuthUI"
        //   185: new             Ljava/lang/StringBuilder;
        //   188: dup            
        //   189: ldc             "getPackageName, ex = "
        //   191: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   194: aload           4
        //   196: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   205: invokestatic    com/tencent/mm/sdk/platformtools/w.w:(Ljava/lang/String;Ljava/lang/String;)V
        //   208: aload           5
        //   210: astore          4
        //   212: goto            129
        //   215: aload_1        
        //   216: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   219: ldc             "http"
        //   221: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   224: ifeq            251
        //   227: ldc             "MicroMsg.OAuthUI"
        //   229: ldc             "checkUrlAndLoad, http scheme, loadUrl"
        //   231: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   234: aload_0        
        //   235: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.nXD:Lcom/tencent/mm/ui/widget/MMWebView;
        //   238: aload_1        
        //   239: invokevirtual   com/tencent/mm/ui/widget/MMWebView.loadUrl:(Ljava/lang/String;)V
        //   242: ldc2_w          12108452331520
        //   245: ldc             90215
        //   247: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   250: return         
        //   251: aload_0        
        //   252: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.mMT:Z
        //   255: ifeq            274
        //   258: ldc             "MicroMsg.OAuthUI"
        //   260: ldc             "checkUrlAndLoad has callback, ignore this callback"
        //   262: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //   265: ldc2_w          12108452331520
        //   268: ldc             90215
        //   270: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   273: return         
        //   274: aload_0        
        //   275: iconst_1       
        //   276: putfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.mMT:Z
        //   279: new             Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;
        //   282: dup            
        //   283: invokespecial   com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.<init>:()V
        //   286: astore          5
        //   288: aload           5
        //   290: aload_0        
        //   291: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.rIR:Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;
        //   294: getfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Req.transaction:Ljava/lang/String;
        //   297: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.transaction:Ljava/lang/String;
        //   300: aload           5
        //   302: aload_2        
        //   303: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.lang:Ljava/lang/String;
        //   306: aload           5
        //   308: aload           4
        //   310: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.country:Ljava/lang/String;
        //   313: aload           6
        //   315: ldc             "code"
        //   317: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   320: astore_2       
        //   321: ldc             "MicroMsg.OAuthUI"
        //   323: new             Ljava/lang/StringBuilder;
        //   326: dup            
        //   327: ldc             "checkUrlAndLoad, code = "
        //   329: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   332: aload_2        
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   336: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   339: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   342: aload_2        
        //   343: invokestatic    com/tencent/mm/sdk/platformtools/bg.nm:(Ljava/lang/String;)Z
        //   346: ifeq            504
        //   349: aload           5
        //   351: iconst_m1      
        //   352: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.errCode:I
        //   355: aload           5
        //   357: aload           6
        //   359: ldc             "state"
        //   361: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   364: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.state:Ljava/lang/String;
        //   367: aload           5
        //   369: aload           6
        //   371: ldc             "reason"
        //   373: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   376: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.errStr:Ljava/lang/String;
        //   379: aload           5
        //   381: aload_1        
        //   382: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.url:Ljava/lang/String;
        //   385: ldc             "MicroMsg.OAuthUI"
        //   387: new             Ljava/lang/StringBuilder;
        //   390: dup            
        //   391: ldc             "checkUrlAndLoad, code="
        //   393: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   396: aload           5
        //   398: getfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.code:Ljava/lang/String;
        //   401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   404: ldc             ", errCode="
        //   406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   409: aload           5
        //   411: getfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.errCode:I
        //   414: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   417: ldc             ", state="
        //   419: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   422: aload           5
        //   424: getfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.state:Ljava/lang/String;
        //   427: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   430: ldc             ", reason="
        //   432: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   435: aload           5
        //   437: getfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.errStr:Ljava/lang/String;
        //   440: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   443: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   446: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   449: new             Landroid/os/Bundle;
        //   452: dup            
        //   453: invokespecial   android/os/Bundle.<init>:()V
        //   456: astore_1       
        //   457: aload           5
        //   459: aload_1        
        //   460: invokevirtual   com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.toBundle:(Landroid/os/Bundle;)V
        //   463: aload_1        
        //   464: invokestatic    com/tencent/mm/pluginsdk/model/app/p.ag:(Landroid/os/Bundle;)V
        //   467: new             Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;
        //   470: dup            
        //   471: invokespecial   com/tencent/mm/opensdk/channel/MMessageActV2$Args.<init>:()V
        //   474: astore_2       
        //   475: aload_2        
        //   476: aload_3        
        //   477: putfield        com/tencent/mm/opensdk/channel/MMessageActV2$Args.targetPkgName:Ljava/lang/String;
        //   480: aload_2        
        //   481: aload_1        
        //   482: putfield        com/tencent/mm/opensdk/channel/MMessageActV2$Args.bundle:Landroid/os/Bundle;
        //   485: aload_0        
        //   486: aload_2        
        //   487: invokestatic    com/tencent/mm/opensdk/channel/MMessageActV2.send:(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z
        //   490: pop            
        //   491: aload_0        
        //   492: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.finish:()V
        //   495: ldc2_w          12108452331520
        //   498: ldc             90215
        //   500: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   503: return         
        //   504: aload_2        
        //   505: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   508: ldc             "authdeny"
        //   510: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   513: ifeq            526
        //   516: aload           5
        //   518: bipush          -4
        //   520: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.errCode:I
        //   523: goto            355
        //   526: aload           5
        //   528: iconst_0       
        //   529: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.errCode:I
        //   532: aload           5
        //   534: aload_2        
        //   535: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.code:Ljava/lang/String;
        //   538: goto            355
        //   541: astore          4
        //   543: aconst_null    
        //   544: astore_2       
        //   545: goto            183
        //   548: astore          4
        //   550: goto            183
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  91     105    177    183    Ljava/lang/Exception;
        //  105    115    541    548    Ljava/lang/Exception;
        //  115    129    548    553    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 247, Size: 247
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.DecompilerLinkProvider.generateContent(DecompilerLinkProvider.java:97)
        //     at us.deathmarine.luyten.OpenFile.decompileWithNavigationLinks(OpenFile.java:469)
        //     at us.deathmarine.luyten.OpenFile.decompile(OpenFile.java:442)
        //     at us.deathmarine.luyten.Model.extractClassToTextPane(Model.java:420)
        //     at us.deathmarine.luyten.Model.openEntryByTreePath(Model.java:339)
        //     at us.deathmarine.luyten.Model$TreeListener$1.run(Model.java:266)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static /* synthetic */ void a(final OAuthUI oAuthUI, final String s, final String text, final String s2) {
        GMTrace.i(16335773892608L, 121711);
        final View inflate = ((ViewStub)oAuthUI.findViewById(R$h.bPq)).inflate();
        oAuthUI.sq(oAuthUI.getString(R$l.ekL));
        oAuthUI.Ve(oAuthUI.getString(R$l.dVZ));
        oAuthUI.AZ(1);
        final ImageView imageView = (ImageView)oAuthUI.findViewById(R$h.bFP);
        final TextView textView = (TextView)oAuthUI.findViewById(R$h.coF);
        final ThreeDotsLoadingView threeDotsLoadingView = (ThreeDotsLoadingView)oAuthUI.findViewById(R$h.bKA);
        threeDotsLoadingView.cju();
        final c$a c$a = new c$a();
        c$a.gLa = 10.0f;
        c$a.gKR = R$k.cNd;
        a.Jk().a(s, imageView, c$a.Jn());
        if (bg.nm(text)) {
            textView.setVisibility(8);
        }
        else {
            textView.setText((CharSequence)text);
        }
        (oAuthUI.rIT = new aj((aj$a)new aj$a() {
            {
                GMTrace.i(16334431715328L, 121701);
                GMTrace.o(16334431715328L, 121701);
            }
            
            public final boolean pM() {
                GMTrace.i(16334565933056L, 121702);
                OAuthUI.a(OAuthUI.this, s2);
                inflate.setVisibility(8);
                threeDotsLoadingView.ZI();
                GMTrace.o(16334565933056L, 121702);
                return false;
            }
        }, false)).z(1000L, 1000L);
        GMTrace.o(16335773892608L, 121711);
    }
    
    static /* synthetic */ void b(final OAuthUI oAuthUI, final String text) {
        GMTrace.i(16335908110336L, 121712);
        ((ViewStub)oAuthUI.findViewById(R$h.bPr)).inflate();
        oAuthUI.sq(oAuthUI.getString(R$l.ekL));
        oAuthUI.Ve(oAuthUI.getString(R$l.dVZ));
        oAuthUI.AZ(1);
        final TextView textView = (TextView)oAuthUI.findViewById(R$h.coF);
        if (bg.nm(text)) {
            textView.setVisibility(8);
            GMTrace.o(16335908110336L, 121712);
            return;
        }
        textView.setText((CharSequence)text);
        GMTrace.o(16335908110336L, 121712);
    }
    
    private void bDC() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: ldc2_w          12107781242880
        //     6: ldc_w           90210
        //     9: invokestatic    com/tencent/gmtrace/GMTrace.i:(JI)V
        //    12: ldc             "MicroMsg.OAuthUI"
        //    14: new             Ljava/lang/StringBuilder;
        //    17: dup            
        //    18: ldc_w           "callbackResultCancel, appId = "
        //    21: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    24: aload_0        
        //    25: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    34: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //    37: aload_0        
        //    38: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.mMT:Z
        //    41: ifeq            62
        //    44: ldc             "MicroMsg.OAuthUI"
        //    46: ldc_w           "has callback, ignore this callback"
        //    49: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //    52: ldc2_w          12107781242880
        //    55: ldc_w           90210
        //    58: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //    61: return         
        //    62: aload_0        
        //    63: iconst_1       
        //    64: putfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.mMT:Z
        //    67: aload_0        
        //    68: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //    71: aload_0        
        //    72: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //    75: invokeinterface com/tencent/mm/plugin/webview/stub/d.LK:(Ljava/lang/String;)Ljava/lang/String;
        //    80: astore_2       
        //    81: aload_0        
        //    82: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //    85: invokeinterface com/tencent/mm/plugin/webview/stub/d.bDm:()Ljava/lang/String;
        //    90: astore_1       
        //    91: aload_0        
        //    92: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //    95: ldc             274436
        //    97: aconst_null    
        //    98: invokeinterface com/tencent/mm/plugin/webview/stub/d.aB:(ILjava/lang/String;)Ljava/lang/String;
        //   103: astore_3       
        //   104: aload_2        
        //   105: invokestatic    com/tencent/mm/sdk/platformtools/bg.nm:(Ljava/lang/String;)Z
        //   108: ifeq            181
        //   111: ldc             "MicroMsg.OAuthUI"
        //   113: new             Ljava/lang/StringBuilder;
        //   116: dup            
        //   117: ldc_w           "callbackResultCancel, get app info failed, appid="
        //   120: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   123: aload_0        
        //   124: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   133: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //   136: ldc2_w          12107781242880
        //   139: ldc_w           90210
        //   142: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   145: return         
        //   146: astore_3       
        //   147: aconst_null    
        //   148: astore_2       
        //   149: aconst_null    
        //   150: astore_1       
        //   151: ldc             "MicroMsg.OAuthUI"
        //   153: new             Ljava/lang/StringBuilder;
        //   156: dup            
        //   157: ldc             "getPackageName, ex = "
        //   159: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   162: aload_3        
        //   163: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   172: invokestatic    com/tencent/mm/sdk/platformtools/w.w:(Ljava/lang/String;Ljava/lang/String;)V
        //   175: aload           4
        //   177: astore_3       
        //   178: goto            104
        //   181: new             Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;
        //   184: dup            
        //   185: invokespecial   com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.<init>:()V
        //   188: astore          4
        //   190: aload           4
        //   192: aload_0        
        //   193: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.rIR:Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;
        //   196: getfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Req.transaction:Ljava/lang/String;
        //   199: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.transaction:Ljava/lang/String;
        //   202: aload           4
        //   204: bipush          -2
        //   206: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.errCode:I
        //   209: aload           4
        //   211: aload_1        
        //   212: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.lang:Ljava/lang/String;
        //   215: aload           4
        //   217: aload_3        
        //   218: putfield        com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.country:Ljava/lang/String;
        //   221: new             Landroid/os/Bundle;
        //   224: dup            
        //   225: invokespecial   android/os/Bundle.<init>:()V
        //   228: astore_1       
        //   229: aload           4
        //   231: aload_1        
        //   232: invokevirtual   com/tencent/mm/opensdk/modelmsg/SendAuth$Resp.toBundle:(Landroid/os/Bundle;)V
        //   235: aload_1        
        //   236: invokestatic    com/tencent/mm/pluginsdk/model/app/p.ag:(Landroid/os/Bundle;)V
        //   239: new             Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;
        //   242: dup            
        //   243: invokespecial   com/tencent/mm/opensdk/channel/MMessageActV2$Args.<init>:()V
        //   246: astore_3       
        //   247: aload_3        
        //   248: aload_2        
        //   249: putfield        com/tencent/mm/opensdk/channel/MMessageActV2$Args.targetPkgName:Ljava/lang/String;
        //   252: aload_3        
        //   253: aload_1        
        //   254: putfield        com/tencent/mm/opensdk/channel/MMessageActV2$Args.bundle:Landroid/os/Bundle;
        //   257: aload_0        
        //   258: aload_3        
        //   259: invokestatic    com/tencent/mm/opensdk/channel/MMessageActV2.send:(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z
        //   262: pop            
        //   263: ldc2_w          12107781242880
        //   266: ldc_w           90210
        //   269: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   272: return         
        //   273: astore_3       
        //   274: aconst_null    
        //   275: astore_1       
        //   276: goto            151
        //   279: astore_3       
        //   280: goto            151
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  67     81     146    151    Ljava/lang/Exception;
        //  81     91     273    279    Ljava/lang/Exception;
        //  91     104    279    283    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 130, Size: 130
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.DecompilerLinkProvider.generateContent(DecompilerLinkProvider.java:97)
        //     at us.deathmarine.luyten.OpenFile.decompileWithNavigationLinks(OpenFile.java:469)
        //     at us.deathmarine.luyten.OpenFile.decompile(OpenFile.java:442)
        //     at us.deathmarine.luyten.Model.extractClassToTextPane(Model.java:420)
        //     at us.deathmarine.luyten.Model.openEntryByTreePath(Model.java:339)
        //     at us.deathmarine.luyten.Model$TreeListener$1.run(Model.java:266)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void bDE() {
        GMTrace.i(12108183896064L, 90213);
        v.d(this.getSharedPreferences(ab.bPU(), 0));
        this.rIS = c.a(this, this.appId, this.rIR, (c.a)new c.a() {
            {
                GMTrace.i(12325482397696L, 91832);
                GMTrace.o(12325482397696L, 91832);
            }
            
            @Override
            public final void a(final c c, final String eVw, final boolean b) {
                GMTrace.i(12325616615424L, 91833);
                w.i("MicroMsg.OAuthUI", "onResult, url = " + eVw + ", isShowLocalErrorPage = " + b);
                if (c != null) {
                    c.rIL = false;
                }
                if (b) {
                    while (true) {
                        try {
                            final String string = OAuthUI.this.getString(R$l.dNi);
                            w.i("MicroMsg.OAuthUI", "onResult, html = " + string);
                            if (OAuthUI.this.nXD != null) {
                                OAuthUI.this.nXD.loadUrl(string);
                                if (OAuthUI.this.rDV != null) {
                                    OAuthUI.this.rDV.bCy().eVw = string;
                                }
                            }
                            GMTrace.o(12325616615424L, 91833);
                            return;
                        }
                        catch (Exception ex) {
                            w.printErrStackTrace("MicroMsg.OAuthUI", (Throwable)ex, "", new Object[0]);
                            final String string = null;
                            continue;
                        }
                        break;
                    }
                }
                if (!bg.nm(eVw) && OAuthUI.this.nXD != null) {
                    OAuthUI.this.nXD.loadUrl(eVw);
                    if (OAuthUI.this.rDV != null) {
                        OAuthUI.this.rDV.bCy().eVw = eVw;
                    }
                }
                GMTrace.o(12325616615424L, 91833);
            }
            
            @Override
            public final void c(final boolean b, final String s, final String s2, final String s3) {
                GMTrace.i(16336579198976L, 121717);
                if (b) {
                    OAuthUI.a(OAuthUI.this, s2, s3, s);
                    GMTrace.o(16336579198976L, 121717);
                    return;
                }
                OAuthUI.b(OAuthUI.this, s3);
                GMTrace.o(16336579198976L, 121717);
            }
        }, this.ioh);
        GMTrace.o(12108183896064L, 90213);
    }
    
    protected final void MP() {
        GMTrace.i(12108049678336L, 90212);
        super.MP();
        this.nXD.getSettings().setJavaScriptEnabled(true);
        this.nXD.setVerticalScrollBarEnabled(false);
        GMTrace.o(12108049678336L, 90212);
    }
    
    protected final void aaO() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           90206
        //     6: invokestatic    com/tencent/gmtrace/GMTrace.i:(JI)V
        //     9: aload_0        
        //    10: invokespecial   com/tencent/mm/plugin/webview/ui/tools/WebViewUI.aaO:()V
        //    13: aload_0        
        //    14: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //    17: invokeinterface com/tencent/mm/plugin/webview/stub/d.aDJ:()Z
        //    22: istore_1       
        //    23: iload_1        
        //    24: ifne            104
        //    27: ldc             "MicroMsg.OAuthUI"
        //    29: ldc_w           "start, hasSetUin fail"
        //    32: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //    35: aload_0        
        //    36: getstatic       com/tencent/mm/R$l.cQg:I
        //    39: iconst_1       
        //    40: invokestatic    android/widget/Toast.makeText:(Landroid/content/Context;II)Landroid/widget/Toast;
        //    43: invokevirtual   android/widget/Toast.show:()V
        //    46: aload_0        
        //    47: new             Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI$1;
        //    50: dup            
        //    51: aload_0        
        //    52: invokespecial   com/tencent/mm/plugin/webview/ui/tools/OAuthUI$1.<init>:(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
        //    55: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.a:(Landroid/view/MenuItem$OnMenuItemClickListener;)V
        //    58: aload_0        
        //    59: iconst_0       
        //    60: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.lf:(Z)V
        //    63: ldc2_w          12107244371968
        //    66: ldc_w           90206
        //    69: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //    72: return         
        //    73: astore_2       
        //    74: ldc             "MicroMsg.OAuthUI"
        //    76: new             Ljava/lang/StringBuilder;
        //    79: dup            
        //    80: ldc_w           "hasSetUin, ex = "
        //    83: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    86: aload_2        
        //    87: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    96: invokestatic    com/tencent/mm/sdk/platformtools/w.w:(Ljava/lang/String;Ljava/lang/String;)V
        //    99: iconst_0       
        //   100: istore_1       
        //   101: goto            23
        //   104: aload_0        
        //   105: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.nXD:Lcom/tencent/mm/ui/widget/MMWebView;
        //   108: new             Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI$2;
        //   111: dup            
        //   112: aload_0        
        //   113: invokespecial   com/tencent/mm/plugin/webview/ui/tools/OAuthUI$2.<init>:(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
        //   116: invokevirtual   com/tencent/mm/ui/widget/MMWebView.setWebChromeClient:(Lcom/tencent/xweb/h;)V
        //   119: aload_0        
        //   120: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.nXD:Lcom/tencent/mm/ui/widget/MMWebView;
        //   123: new             Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI$3;
        //   126: dup            
        //   127: aload_0        
        //   128: invokespecial   com/tencent/mm/plugin/webview/ui/tools/OAuthUI$3.<init>:(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
        //   131: invokevirtual   com/tencent/mm/ui/widget/MMWebView.setWebViewClient:(Lcom/tencent/xweb/n;)V
        //   134: aload_0        
        //   135: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.nXD:Lcom/tencent/mm/ui/widget/MMWebView;
        //   138: new             Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI$4;
        //   141: dup            
        //   142: aload_0        
        //   143: invokespecial   com/tencent/mm/plugin/webview/ui/tools/OAuthUI$4.<init>:(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
        //   146: invokevirtual   com/tencent/mm/ui/widget/MMWebView.setDownloadListener:(Landroid/webkit/DownloadListener;)V
        //   149: aload_0        
        //   150: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.nXD:Lcom/tencent/mm/ui/widget/MMWebView;
        //   153: invokevirtual   com/tencent/mm/ui/widget/MMWebView.cjl:()V
        //   156: aload_0        
        //   157: new             Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI$5;
        //   160: dup            
        //   161: aload_0        
        //   162: invokespecial   com/tencent/mm/plugin/webview/ui/tools/OAuthUI$5.<init>:(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
        //   165: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.a:(Landroid/view/MenuItem$OnMenuItemClickListener;)V
        //   168: aload_0        
        //   169: iconst_1       
        //   170: aload_0        
        //   171: getstatic       com/tencent/mm/R$l.cUo:I
        //   174: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.getString:(I)Ljava/lang/String;
        //   177: new             Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI$6;
        //   180: dup            
        //   181: aload_0        
        //   182: invokespecial   com/tencent/mm/plugin/webview/ui/tools/OAuthUI$6.<init>:(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
        //   185: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.a:(ILjava/lang/String;Landroid/view/MenuItem$OnMenuItemClickListener;)V
        //   188: aload_0        
        //   189: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.getIntent:()Landroid/content/Intent;
        //   192: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   195: astore_2       
        //   196: aload_2        
        //   197: ldc_w           "_mmessage_content"
        //   200: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   203: astore_3       
        //   204: aload_3        
        //   205: invokestatic    com/tencent/mm/sdk/platformtools/bg.nm:(Ljava/lang/String;)Z
        //   208: ifeq            229
        //   211: ldc             "MicroMsg.OAuthUI"
        //   213: ldc_w           "content is null"
        //   216: invokestatic    com/tencent/mm/sdk/platformtools/w.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   219: ldc2_w          12107244371968
        //   222: ldc_w           90206
        //   225: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   228: return         
        //   229: aload_0        
        //   230: aload_3        
        //   231: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   234: ldc_w           "appid"
        //   237: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   240: putfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //   243: ldc             "MicroMsg.OAuthUI"
        //   245: new             Ljava/lang/StringBuilder;
        //   248: dup            
        //   249: ldc_w           "initView, appId = "
        //   252: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   255: aload_0        
        //   256: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //   259: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   262: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   265: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   268: aload_0        
        //   269: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //   272: aload_0        
        //   273: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.appId:Ljava/lang/String;
        //   276: invokeinterface com/tencent/mm/plugin/webview/stub/d.LJ:(Ljava/lang/String;)V
        //   281: aload_0        
        //   282: new             Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;
        //   285: dup            
        //   286: aload_2        
        //   287: invokespecial   com/tencent/mm/opensdk/modelmsg/SendAuth$Req.<init>:(Landroid/os/Bundle;)V
        //   290: putfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.rIR:Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;
        //   293: aload_0        
        //   294: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.rLl:Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI$n;
        //   297: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/WebViewUI$n.bEC:()V
        //   300: aload_0        
        //   301: invokespecial   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.bDE:()V
        //   304: ldc2_w          12107244371968
        //   307: ldc_w           90206
        //   310: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   313: return         
        //   314: astore_3       
        //   315: ldc             "MicroMsg.OAuthUI"
        //   317: new             Ljava/lang/StringBuilder;
        //   320: dup            
        //   321: ldc_w           "checkGetAppSetting, ex = "
        //   324: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   327: aload_3        
        //   328: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   331: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   334: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   337: invokestatic    com/tencent/mm/sdk/platformtools/w.w:(Ljava/lang/String;Ljava/lang/String;)V
        //   340: goto            281
        //   343: astore_2       
        //   344: ldc             "MicroMsg.OAuthUI"
        //   346: new             Ljava/lang/StringBuilder;
        //   349: dup            
        //   350: ldc_w           "AC_ADD_SCENE_END, ex = "
        //   353: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   356: aload_2        
        //   357: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   360: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   363: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   366: invokestatic    com/tencent/mm/sdk/platformtools/w.w:(Ljava/lang/String;Ljava/lang/String;)V
        //   369: goto            300
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  13     23     73     104    Ljava/lang/Exception;
        //  268    281    314    343    Ljava/lang/Exception;
        //  293    300    343    372    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0300:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.DecompilerLinkProvider.generateContent(DecompilerLinkProvider.java:97)
        //     at us.deathmarine.luyten.OpenFile.decompileWithNavigationLinks(OpenFile.java:469)
        //     at us.deathmarine.luyten.OpenFile.decompile(OpenFile.java:442)
        //     at us.deathmarine.luyten.Model.extractClassToTextPane(Model.java:420)
        //     at us.deathmarine.luyten.Model.openEntryByTreePath(Model.java:339)
        //     at us.deathmarine.luyten.Model$TreeListener$1.run(Model.java:266)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void b(final com.tencent.mm.plugin.webview.stub.c p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           90214
        //     6: invokestatic    com/tencent/gmtrace/GMTrace.i:(JI)V
        //     9: aload_0        
        //    10: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.rIS:Lcom/tencent/mm/plugin/webview/ui/tools/c;
        //    13: ifnull          612
        //    16: aload_0        
        //    17: getfield        com/tencent/mm/plugin/webview/ui/tools/OAuthUI.rIS:Lcom/tencent/mm/plugin/webview/ui/tools/c;
        //    20: astore          13
        //    22: aload           13
        //    24: getfield        com/tencent/mm/plugin/webview/ui/tools/c.rIL:Z
        //    27: ifne            49
        //    30: ldc_w           "MicroMsg.OAuthSession"
        //    33: ldc_w           "onScenEnd, not listening"
        //    36: invokestatic    com/tencent/mm/sdk/platformtools/w.w:(Ljava/lang/String;Ljava/lang/String;)V
        //    39: ldc2_w          12108318113792
        //    42: ldc_w           90214
        //    45: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //    48: return         
        //    49: iconst_m1      
        //    50: istore          5
        //    52: iconst_m1      
        //    53: istore_3       
        //    54: aconst_null    
        //    55: astore          10
        //    57: aconst_null    
        //    58: astore          11
        //    60: iconst_m1      
        //    61: istore          6
        //    63: aload           11
        //    65: astore          8
        //    67: aload           10
        //    69: astore          9
        //    71: iload_3        
        //    72: istore          4
        //    74: aload_1        
        //    75: invokeinterface com/tencent/mm/plugin/webview/stub/c.bDe:()I
        //    80: istore_2       
        //    81: aload           11
        //    83: astore          8
        //    85: aload           10
        //    87: astore          9
        //    89: iload_3        
        //    90: istore          4
        //    92: iload_2        
        //    93: istore          5
        //    95: aload_1        
        //    96: invokeinterface com/tencent/mm/plugin/webview/stub/c.bDf:()I
        //   101: istore_3       
        //   102: aload           11
        //   104: astore          8
        //   106: aload           10
        //   108: astore          9
        //   110: iload_3        
        //   111: istore          4
        //   113: iload_2        
        //   114: istore          5
        //   116: aload_1        
        //   117: invokeinterface com/tencent/mm/plugin/webview/stub/c.En:()Ljava/lang/String;
        //   122: pop            
        //   123: aload           11
        //   125: astore          8
        //   127: aload           10
        //   129: astore          9
        //   131: iload_3        
        //   132: istore          4
        //   134: iload_2        
        //   135: istore          5
        //   137: aload_1        
        //   138: invokeinterface com/tencent/mm/plugin/webview/stub/c.getData:()Landroid/os/Bundle;
        //   143: ldc_w           "geta8key_result_full_url"
        //   146: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   149: astore          10
        //   151: aload           11
        //   153: astore          8
        //   155: aload           10
        //   157: astore          9
        //   159: iload_3        
        //   160: istore          4
        //   162: iload_2        
        //   163: istore          5
        //   165: aload_1        
        //   166: invokeinterface com/tencent/mm/plugin/webview/stub/c.getData:()Landroid/os/Bundle;
        //   171: ldc_w           "geta8key_result_head_img"
        //   174: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   177: astore          11
        //   179: aload           11
        //   181: astore          8
        //   183: aload           10
        //   185: astore          9
        //   187: iload_3        
        //   188: istore          4
        //   190: iload_2        
        //   191: istore          5
        //   193: aload_1        
        //   194: invokeinterface com/tencent/mm/plugin/webview/stub/c.getData:()Landroid/os/Bundle;
        //   199: ldc_w           "geta8key_result_wording"
        //   202: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   205: astore          12
        //   207: aload           12
        //   209: astore          8
        //   211: aload_1        
        //   212: invokeinterface com/tencent/mm/plugin/webview/stub/c.getData:()Landroid/os/Bundle;
        //   217: ldc_w           "geta8key_result_action_code"
        //   220: iconst_m1      
        //   221: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //   224: istore          4
        //   226: aload           8
        //   228: astore_1       
        //   229: ldc_w           "MicroMsg.OAuthSession"
        //   232: new             Ljava/lang/StringBuilder;
        //   235: dup            
        //   236: ldc_w           "onSceneEnd, errType = "
        //   239: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   242: iload_2        
        //   243: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   246: ldc_w           ", errCode = "
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: iload_3        
        //   253: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   256: ldc_w           " , actionCode="
        //   259: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   262: iload           4
        //   264: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   267: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   270: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   273: aload           13
        //   275: getfield        com/tencent/mm/plugin/webview/ui/tools/c.luk:Lcom/tencent/mm/ui/base/r;
        //   278: ifnull          289
        //   281: aload           13
        //   283: getfield        com/tencent/mm/plugin/webview/ui/tools/c.luk:Lcom/tencent/mm/ui/base/r;
        //   286: invokevirtual   com/tencent/mm/ui/base/r.dismiss:()V
        //   289: aload           13
        //   291: iconst_0       
        //   292: putfield        com/tencent/mm/plugin/webview/ui/tools/c.rIK:Z
        //   295: aload           13
        //   297: getfield        com/tencent/mm/plugin/webview/ui/tools/c.gsj:Lcom/tencent/mm/sdk/platformtools/aj;
        //   300: invokevirtual   com/tencent/mm/sdk/platformtools/aj.stopTimer:()V
        //   303: iload_3        
        //   304: ifne            311
        //   307: iload_2        
        //   308: ifeq            318
        //   311: iload_3        
        //   312: sipush          -2033
        //   315: if_icmpne       452
        //   318: iload           4
        //   320: bipush          27
        //   322: if_icmpne       427
        //   325: aload           13
        //   327: iconst_0       
        //   328: putfield        com/tencent/mm/plugin/webview/ui/tools/c.rIL:Z
        //   331: aload           13
        //   333: getfield        com/tencent/mm/plugin/webview/ui/tools/c.rIM:Lcom/tencent/mm/plugin/webview/ui/tools/c$a;
        //   336: astore          8
        //   338: iload_3        
        //   339: ifne            421
        //   342: iconst_1       
        //   343: istore          7
        //   345: aload           8
        //   347: iload           7
        //   349: aload           10
        //   351: aload           11
        //   353: aload_1        
        //   354: invokeinterface com/tencent/mm/plugin/webview/ui/tools/c$a.c:(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   359: ldc2_w          12108318113792
        //   362: ldc_w           90214
        //   365: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   368: return         
        //   369: astore          10
        //   371: aconst_null    
        //   372: astore_1       
        //   373: iload           5
        //   375: istore_2       
        //   376: iload           4
        //   378: istore_3       
        //   379: ldc_w           "MicroMsg.OAuthSession"
        //   382: new             Ljava/lang/StringBuilder;
        //   385: dup            
        //   386: ldc_w           "onSceneEnd, ex = "
        //   389: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   392: aload           10
        //   394: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   397: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   400: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   403: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //   406: iload           6
        //   408: istore          4
        //   410: aload           8
        //   412: astore          11
        //   414: aload           9
        //   416: astore          10
        //   418: goto            229
        //   421: iconst_0       
        //   422: istore          7
        //   424: goto            345
        //   427: aload           13
        //   429: getfield        com/tencent/mm/plugin/webview/ui/tools/c.rIM:Lcom/tencent/mm/plugin/webview/ui/tools/c$a;
        //   432: aload           13
        //   434: aload           10
        //   436: iconst_0       
        //   437: invokeinterface com/tencent/mm/plugin/webview/ui/tools/c$a.a:(Lcom/tencent/mm/plugin/webview/ui/tools/c;Ljava/lang/String;Z)V
        //   442: ldc2_w          12108318113792
        //   445: ldc_w           90214
        //   448: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   451: return         
        //   452: iload_2        
        //   453: iconst_4       
        //   454: if_icmpne       537
        //   457: iload_3        
        //   458: bipush          -100
        //   460: if_icmpne       537
        //   463: aload           13
        //   465: getfield        com/tencent/mm/plugin/webview/ui/tools/c.rIN:Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;
        //   468: iconst_1       
        //   469: iconst_1       
        //   470: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/OAuthUI.B:(ZZ)V
        //   473: aload           13
        //   475: getfield        com/tencent/mm/plugin/webview/ui/tools/c.ioh:Lcom/tencent/mm/plugin/webview/stub/d;
        //   478: iload_2        
        //   479: iload_3        
        //   480: aload           13
        //   482: invokevirtual   java/lang/Object.hashCode:()I
        //   485: invokeinterface com/tencent/mm/plugin/webview/stub/d.S:(III)V
        //   490: ldc2_w          12108318113792
        //   493: ldc_w           90214
        //   496: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   499: return         
        //   500: astore_1       
        //   501: ldc_w           "MicroMsg.OAuthSession"
        //   504: new             Ljava/lang/StringBuilder;
        //   507: dup            
        //   508: ldc_w           "accountExpired, ex = "
        //   511: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   514: aload_1        
        //   515: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   518: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   521: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   524: invokestatic    com/tencent/mm/sdk/platformtools/w.w:(Ljava/lang/String;Ljava/lang/String;)V
        //   527: ldc2_w          12108318113792
        //   530: ldc_w           90214
        //   533: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   536: return         
        //   537: iload_2        
        //   538: iconst_1       
        //   539: if_icmpeq       559
        //   542: iload_2        
        //   543: iconst_2       
        //   544: if_icmpeq       559
        //   547: iload_2        
        //   548: bipush          7
        //   550: if_icmpeq       559
        //   553: iload_2        
        //   554: bipush          8
        //   556: if_icmpne       622
        //   559: ldc_w           "MicroMsg.OAuthSession"
        //   562: new             Ljava/lang/StringBuilder;
        //   565: dup            
        //   566: ldc_w           "isNetworkAvailable false, errType = "
        //   569: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   572: iload_2        
        //   573: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   576: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   579: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //   582: iconst_0       
        //   583: istore_2       
        //   584: iload_2        
        //   585: ifne            652
        //   588: aload           13
        //   590: getfield        com/tencent/mm/plugin/webview/ui/tools/c.rIM:Lcom/tencent/mm/plugin/webview/ui/tools/c$a;
        //   593: astore_1       
        //   594: aconst_null    
        //   595: astore          10
        //   597: iconst_1       
        //   598: istore          7
        //   600: aload_1        
        //   601: aload           13
        //   603: aload           10
        //   605: iload           7
        //   607: invokeinterface com/tencent/mm/plugin/webview/ui/tools/c$a.a:(Lcom/tencent/mm/plugin/webview/ui/tools/c;Ljava/lang/String;Z)V
        //   612: ldc2_w          12108318113792
        //   615: ldc_w           90214
        //   618: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   621: return         
        //   622: aload           13
        //   624: getfield        com/tencent/mm/plugin/webview/ui/tools/c.rIN:Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;
        //   627: invokestatic    com/tencent/mm/sdk/platformtools/am.isConnected:(Landroid/content/Context;)Z
        //   630: ifne            647
        //   633: ldc_w           "MicroMsg.OAuthSession"
        //   636: ldc_w           "isNetworkAvailable false, not connected"
        //   639: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //   642: iconst_0       
        //   643: istore_2       
        //   644: goto            584
        //   647: iconst_1       
        //   648: istore_2       
        //   649: goto            584
        //   652: aload           13
        //   654: getfield        com/tencent/mm/plugin/webview/ui/tools/c.rIM:Lcom/tencent/mm/plugin/webview/ui/tools/c$a;
        //   657: astore_1       
        //   658: iload_3        
        //   659: iconst_m1      
        //   660: if_icmpne       669
        //   663: iconst_1       
        //   664: istore          7
        //   666: goto            600
        //   669: iconst_0       
        //   670: istore          7
        //   672: goto            600
        //   675: astore          12
        //   677: aload           8
        //   679: astore_1       
        //   680: aload           11
        //   682: astore          8
        //   684: aload           10
        //   686: astore          9
        //   688: aload           12
        //   690: astore          10
        //   692: goto            379
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  74     81     369    379    Ljava/lang/Exception;
        //  95     102    369    379    Ljava/lang/Exception;
        //  116    123    369    379    Ljava/lang/Exception;
        //  137    151    369    379    Ljava/lang/Exception;
        //  165    179    369    379    Ljava/lang/Exception;
        //  193    207    369    379    Ljava/lang/Exception;
        //  211    226    675    695    Ljava/lang/Exception;
        //  473    490    500    537    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0229:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.DecompilerLinkProvider.generateContent(DecompilerLinkProvider.java:97)
        //     at us.deathmarine.luyten.OpenFile.decompileWithNavigationLinks(OpenFile.java:469)
        //     at us.deathmarine.luyten.OpenFile.decompile(OpenFile.java:442)
        //     at us.deathmarine.luyten.Model.extractClassToTextPane(Model.java:420)
        //     at us.deathmarine.luyten.Model.openEntryByTreePath(Model.java:339)
        //     at us.deathmarine.luyten.Model$TreeListener$1.run(Model.java:266)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected final boolean bDD() {
        GMTrace.i(12107915460608L, 90211);
        GMTrace.o(12107915460608L, 90211);
        return true;
    }
    
    protected final int getLayoutId() {
        GMTrace.i(16335639674880L, 121710);
        final int chv = R$i.cHV;
        GMTrace.o(16335639674880L, 121710);
        return chv;
    }
    
    public void onCreate(final Bundle bundle) {
        GMTrace.i(12107110154240L, 90205);
        super.onCreate(bundle);
        if (this.rDV != null) {
            this.rDV.bCy().eVw = "weixin://mark/oauth";
        }
        GMTrace.o(12107110154240L, 90205);
    }
    
    protected void onDestroy() {
        GMTrace.i(12107512807424L, 90208);
        while (true) {
            try {
                this.rLl.bED();
                if (this.rIT != null) {
                    this.rIT.stopTimer();
                }
                super.onDestroy();
                GMTrace.o(12107512807424L, 90208);
            }
            catch (Exception ex) {
                w.w("MicroMsg.OAuthUI", "AC_REMOVE_SCENE_END, ex = " + ex.getMessage());
                continue;
            }
            break;
        }
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        GMTrace.i(12107647025152L, 90209);
        if (!this.rIQ && n == 4 && this.nXD.canGoBack()) {
            this.nXD.goBack();
            GMTrace.o(12107647025152L, 90209);
            return true;
        }
        if (n == 4 && keyEvent.getRepeatCount() == 0) {
            this.bDC();
            this.finish();
            GMTrace.o(12107647025152L, 90209);
            return true;
        }
        final boolean onKeyDown = super.onKeyDown(n, keyEvent);
        GMTrace.o(12107647025152L, 90209);
        return onKeyDown;
    }
    
    protected void onPause() {
        GMTrace.i(12106975936512L, 90204);
        super.onPause();
        WebView.disablePlatformNotifications();
        GMTrace.o(12106975936512L, 90204);
    }
    
    protected void onResume() {
        GMTrace.i(12106841718784L, 90203);
        super.onResume();
        WebView.enablePlatformNotifications();
        GMTrace.o(12106841718784L, 90203);
    }
    
    protected void onStop() {
        GMTrace.i(12107378589696L, 90207);
        this.nXD.stopLoading();
        super.onStop();
        GMTrace.o(12107378589696L, 90207);
    }
}
