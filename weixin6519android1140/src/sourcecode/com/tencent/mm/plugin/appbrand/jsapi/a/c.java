package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.o.b;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.ui.AppBrandRedirectUI;
import com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.ajs;
import com.tencent.mm.protocal.c.ajt;
import com.tencent.mm.protocal.c.baa;
import com.tencent.mm.protocal.c.bbz;
import com.tencent.mm.protocal.c.bca;
import com.tencent.mm.protocal.c.ms;
import com.tencent.mm.protocal.c.mt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 209;
  public static final String NAME = "getPhoneNumber";
  String eMW;
  public int hYL;
  public AppBrandPageView ibO;
  private String ibP;
  private boolean ibQ;
  String ibR;
  public String ibS;
  public String ibT;
  String ibU;
  public boolean ibV;
  public View ibW;
  public EditVerifyCodeView ibX;
  public TextView ibY;
  a ibZ;
  public com.tencent.mm.plugin.ae.a ica;
  private i icb;
  public int icc;
  public int icd;
  public int ice;
  com.tencent.mm.plugin.ae.a.a icf;
  String signature;
  
  public c()
  {
    GMTrace.i(19765305278464L, 147263);
    this.eMW = "";
    this.ibU = "";
    this.ibV = false;
    this.ica = null;
    this.icc = 0;
    this.icd = 0;
    this.ice = 0;
    this.icf = new com.tencent.mm.plugin.ae.a.a()
    {
      public final void qo(String paramAnonymousString)
      {
        GMTrace.i(20707647946752L, 154284);
        w.i("MicroMsg.JsApiGetPhoneNumber", "smsListener onchange");
        w.d("MicroMsg.JsApiGetPhoneNumber", "smsVerifyCode:%s", new Object[] { paramAnonymousString });
        c.this.ibX.setText(paramAnonymousString);
        GMTrace.o(20707647946752L, 154284);
      }
    };
    GMTrace.o(19765305278464L, 147263);
  }
  
  public final void Wi()
  {
    GMTrace.i(19765573713920L, 147265);
    w.i("MicroMsg.JsApiGetPhoneNumber", "requestBindPhoneNumber");
    JSONStringer localJSONStringer = new JSONStringer();
    try
    {
      localJSONStringer.object();
      localJSONStringer.key("api_name");
      localJSONStringer.value(this.ibP);
      localJSONStringer.key("with_credentials");
      localJSONStringer.value(this.ibQ);
      localJSONStringer.endObject();
      w.i("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber appId:%s, api_name:%s, with_credentials:%b", new Object[] { this.ibO.hyD, this.ibP, Boolean.valueOf(this.ibQ) });
      Object localObject = new com.tencent.mm.ad.b.a();
      ((com.tencent.mm.ad.b.a)localObject).gtF = new ajs();
      ((com.tencent.mm.ad.b.a)localObject).gtG = new ajt();
      ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-getuserwxphone";
      ((com.tencent.mm.ad.b.a)localObject).gtE = 1141;
      ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
      ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
      localObject = ((com.tencent.mm.ad.b.a)localObject).DA();
      ajs localajs = (ajs)((com.tencent.mm.ad.b)localObject).gtC.gtK;
      localajs.lQa = this.ibO.hyD;
      localajs.jgP = new com.tencent.mm.bm.b(localJSONStringer.toString().getBytes());
      com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ad.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
        {
          GMTrace.i(19760339222528L, 147226);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
          {
            w.e("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber JsOperateWxData cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.gtD.gtK });
            c.this.ibO.v(c.this.hYL, c.this.d("fail:JsOperateWxData cgi fail", null));
            GMTrace.o(19760339222528L, 147226);
            return;
          }
          w.i("MicroMsg.JsApiGetPhoneNumber", "JsOperateWxData success");
          paramAnonymousString = (ajt)paramAnonymousb.gtD.gtK;
          c.this.ibO.iuf.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19767184326656L, 147277);
              c localc = c.this;
              Object localObject1 = paramAnonymousString;
              w.i("MicroMsg.JsApiGetPhoneNumber", "handleOperateWxData");
              Object localObject2 = "";
              if (((ajt)localObject1).jgP != null) {
                localObject2 = ((ajt)localObject1).jgP.bNS();
              }
              w.i("MicroMsg.JsApiGetPhoneNumber", "resp data:%s", new Object[] { localObject2 });
              if (TextUtils.isEmpty((CharSequence)localObject2))
              {
                w.e("MicroMsg.JsApiGetPhoneNumber", "resp data is empty");
                localc.ibO.v(localc.hYL, localc.d("fail:resp data is empty", null));
                GMTrace.o(19767184326656L, 147277);
                return;
              }
              String str2 = ((ajt)localObject1).tOY;
              String str3 = ((ajt)localObject1).lRT;
              String str1;
              if (((ajt)localObject1).uyC != null)
              {
                str1 = ((ajt)localObject1).uyC.lPj;
                localc.ibU = ((ajt)localObject1).uyC.ibU;
                localObject1 = ((ajt)localObject1).uyC.uxX;
              }
              for (;;)
              {
                w.i("MicroMsg.JsApiGetPhoneNumber", "appName:%s, desc:%s, IconUrl:%s, ext_desc:%s", new Object[] { str3, str1, str2, localc.ibU });
                Object localObject4 = null;
                Object localObject3;
                Object localObject6;
                try
                {
                  localObject2 = new JSONObject((String)localObject2);
                  if (localObject2 == null)
                  {
                    w.e("MicroMsg.JsApiGetPhoneNumber", "jsonObj is null");
                    localc.ibO.v(localc.hYL, localc.d("fail:jsonObj is null", null));
                    GMTrace.o(19767184326656L, 147277);
                    return;
                  }
                }
                catch (JSONException localJSONException1)
                {
                  for (;;)
                  {
                    w.e("MicroMsg.JsApiGetPhoneNumber", "new data json exception:%s", new Object[] { localJSONException1.getMessage() });
                    localObject3 = localObject4;
                  }
                  localc.ibR = ((JSONObject)localObject3).optString("data");
                  localObject6 = ((JSONObject)localObject3).optJSONObject("data");
                  localObject4 = localObject6;
                  if (localObject6 == null)
                  {
                    localObject4 = localObject6;
                    if (TextUtils.isEmpty(localc.ibR)) {}
                  }
                }
                for (;;)
                {
                  try
                  {
                    localObject4 = new JSONObject(localc.ibR);
                    if (localObject4 != null)
                    {
                      localc.eMW = ((JSONObject)localObject4).optString("mobile");
                      bool = ((JSONObject)localObject4).optBoolean("need_auth", false);
                      localc.ibV = ((JSONObject)localObject4).optBoolean("allow_send_sms", false);
                      localc.signature = ((JSONObject)localObject3).optString("signature");
                      localc.ibS = ((JSONObject)localObject3).optString("encryptedData");
                      localc.ibT = ((JSONObject)localObject3).optString("iv");
                      w.i("MicroMsg.JsApiGetPhoneNumber", "mobile:%s, need_auth:%b, allow_send_sms:%b", new Object[] { localc.eMW, Boolean.valueOf(bool), Boolean.valueOf(localc.ibV) });
                      if (localc.icc == 0)
                      {
                        if (TextUtils.isEmpty(localc.eMW)) {
                          continue;
                        }
                        if (bool) {
                          localc.icc = 2;
                        }
                      }
                      else
                      {
                        if (TextUtils.isEmpty(localc.eMW)) {
                          continue;
                        }
                        w.i("MicroMsg.JsApiGetPhoneNumber", "show the confirm login dialog");
                        localObject3 = (LayoutInflater)localc.ibO.mContext.getSystemService("layout_inflater");
                        localObject4 = ((LayoutInflater)localObject3).inflate(o.g.hCR, null);
                        localObject6 = (ImageView)((View)localObject4).findViewById(o.f.hAR);
                        localTextView1 = (TextView)((View)localObject4).findViewById(o.f.hAO);
                        ImageView localImageView = (ImageView)((View)localObject4).findViewById(o.f.hAT);
                        TextView localTextView2 = (TextView)((View)localObject4).findViewById(o.f.hAP);
                        localTextView3 = (TextView)((View)localObject4).findViewById(o.f.hAS);
                        View localView = ((LayoutInflater)localObject3).inflate(o.g.hCQ, null);
                        TextView localTextView4 = (TextView)localView.findViewById(o.f.hAQ);
                        localObject3 = localObject1;
                        if (bg.nm((String)localObject1)) {
                          localObject3 = localc.ibO.iuf.getResources().getString(o.i.hEK);
                        }
                        localObject1 = localc.ibO.iuf.getResources().getString(o.i.hEL);
                        Object localObject7 = new WxaExposedParams.a();
                        ((WxaExposedParams.a)localObject7).appId = localc.ibO.hyD;
                        ((WxaExposedParams.a)localObject7).ePf = localc.ibO.ivj.iwc;
                        ((WxaExposedParams.a)localObject7).eDj = 8;
                        localObject7 = new a(l.a(((WxaExposedParams.a)localObject7).UI()));
                        SpannableString localSpannableString = new SpannableString((String)localObject3 + (String)localObject1);
                        localSpannableString.setSpan(localObject7, ((String)localObject3).length(), ((String)localObject3).length() + ((String)localObject1).length(), 18);
                        localTextView4.setMovementMethod(LinkMovementMethod.getInstance());
                        localTextView4.setText(localSpannableString);
                        if (TextUtils.isEmpty(str3)) {
                          continue;
                        }
                        localTextView1.setText(str3);
                        localTextView1.setVisibility(0);
                        localTextView2.setText(str1);
                        if (TextUtils.isEmpty(localc.ibU)) {
                          continue;
                        }
                        localTextView3.setText(localc.ibU);
                        localTextView3.setVisibility(0);
                        if (TextUtils.isEmpty(str2)) {
                          continue;
                        }
                        com.tencent.mm.modelappbrand.a.b.CT().a((ImageView)localObject6, str2, com.tencent.mm.modelappbrand.a.a.CS(), e.grO);
                        localImageView.setOnClickListener(new c.12(localc, localView));
                        h.a(localc.ibO.mContext, false, localc.ibO.iuf.getResources().getString(o.i.hEP), (View)localObject4, localc.ibO.iuf.getResources().getString(o.i.hEO), localc.ibO.iuf.getResources().getString(o.i.cSk), new c.13(localc, bool), new c.14(localc));
                        GMTrace.o(19767184326656L, 147277);
                        return;
                      }
                    }
                  }
                  catch (JSONException localJSONException2)
                  {
                    TextView localTextView1;
                    TextView localTextView3;
                    w.e("MicroMsg.JsApiGetPhoneNumber", "new dataJson exist exception, e:%s", new Object[] { localJSONException2.getMessage() });
                    Object localObject5 = localObject6;
                    continue;
                    localc.icc = 1;
                    continue;
                    localc.icc = 3;
                    continue;
                    localTextView1.setVisibility(8);
                    continue;
                    localTextView3.setVisibility(8);
                    continue;
                    ((ImageView)localObject6).setImageDrawable(com.tencent.mm.modelappbrand.a.a.CS());
                    continue;
                    w.i("MicroMsg.JsApiGetPhoneNumber", "show the confirm bind phone dialog");
                    h.a(localc.ibO.mContext, localc.ibO.iuf.getResources().getString(o.i.hEQ), localc.ibO.iuf.getResources().getString(o.i.hER), localc.ibO.iuf.getResources().getString(o.i.hEX), localc.ibO.iuf.getResources().getString(o.i.cSk), false, new c.15(localc), new c.16(localc));
                    GMTrace.o(19767184326656L, 147277);
                    return;
                  }
                  boolean bool = false;
                }
                localObject1 = "";
                str1 = "";
              }
            }
          });
          GMTrace.o(19760339222528L, 147226);
        }
      });
      GMTrace.o(19765573713920L, 147265);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiGetPhoneNumber", "JSONException:%s", new Object[] { localJSONException.getMessage() });
      }
    }
  }
  
  public final void Wj()
  {
    GMTrace.i(19765707931648L, 147266);
    w.i("MicroMsg.JsApiGetPhoneNumber", "doSuccCallback");
    HashMap localHashMap = new HashMap(5);
    localHashMap.put("encryptedData", this.ibS);
    localHashMap.put("iv", this.ibT);
    this.ibO.v(this.hYL, d("ok", localHashMap));
    GMTrace.o(19765707931648L, 147266);
  }
  
  public final void Wk()
  {
    GMTrace.i(19765842149376L, 147267);
    w.i("MicroMsg.JsApiGetPhoneNumber", "doSendVerifyCode");
    Object localObject = new com.tencent.mm.ad.b.a();
    ((com.tencent.mm.ad.b.a)localObject).gtF = new bbz();
    ((com.tencent.mm.ad.b.a)localObject).gtG = new bca();
    ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/sendverifycode";
    ((com.tencent.mm.ad.b.a)localObject).gtE = 1024;
    ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
    ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
    localObject = ((com.tencent.mm.ad.b.a)localObject).DA();
    bbz localbbz = (bbz)((com.tencent.mm.ad.b)localObject).gtC.gtK;
    localbbz.eSd = this.ibO.hyD;
    localbbz.eMW = this.eMW;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ad.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
      {
        GMTrace.i(20707916382208L, 154286);
        this.ici.dismiss();
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
        {
          w.e("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber SendVerifyCode cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.gtD.gtK });
          c.this.ibO.v(c.this.hYL, c.this.d("fail:SendVerifyCode cgi fail", null));
          g.ork.i(14249, new Object[] { c.this.ibO.hyD, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(c.this.icd), Integer.valueOf(c.this.ice), Integer.valueOf(c.this.icc) });
          GMTrace.o(20707916382208L, 154286);
          return;
        }
        paramAnonymousString = (bca)paramAnonymousb.gtD.gtK;
        w.i("MicroMsg.JsApiGetPhoneNumber", "SendVerifyCode cgi success");
        c.this.ibO.iuf.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19759533916160L, 147220);
            c localc = c.this;
            int i = paramAnonymousString.status;
            w.i("MicroMsg.JsApiGetPhoneNumber", "handleSendVerifyCodeStatus:%d", new Object[] { Integer.valueOf(i) });
            if (i == 0)
            {
              w.i("MicroMsg.JsApiGetPhoneNumber", "startSmsListener");
              if (localc.ibZ != null)
              {
                localc.ibZ.cancel();
                localc.ibZ.start();
                if (localc.ica == null) {
                  localc.ica = new com.tencent.mm.plugin.ae.a(localc.ibO.mContext);
                }
                localc.ica.oWG = localc.ibO.iuf.getResources().getStringArray(o.b.hzZ);
                localc.ica.oWE = localc.icf;
                com.tencent.mm.plugin.appbrand.a.a(localc.ibO.hyD, new c.9(localc));
                boolean bool = com.tencent.mm.pluginsdk.h.a.a((Activity)localc.ibO.mContext, "android.permission.READ_SMS", 128, "", "");
                if (bool) {
                  com.tencent.mm.plugin.appbrand.a.nJ(localc.ibO.hyD);
                }
                if (!bool) {
                  break label231;
                }
                w.i("MicroMsg.JsApiGetPhoneNumber", "request sms permission success");
              }
              for (;;)
              {
                localc.ica.start();
                GMTrace.o(19759533916160L, 147220);
                return;
                localc.ibZ = new c.a(localc);
                break;
                label231:
                w.e("MicroMsg.JsApiGetPhoneNumber", "request sms permission fail");
              }
            }
            if ((i != 1) && (i == 2))
            {
              localc.qn(localc.ibO.iuf.getResources().getString(o.i.hEW));
              g.ork.i(14249, new Object[] { localc.ibO.hyD, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(localc.icd), Integer.valueOf(localc.ice), Integer.valueOf(localc.icc) });
              GMTrace.o(19759533916160L, 147220);
              return;
            }
            localc.qn(localc.ibO.iuf.getResources().getString(o.i.hEV));
            g.ork.i(14249, new Object[] { localc.ibO.hyD, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(localc.icd), Integer.valueOf(localc.ice), Integer.valueOf(localc.icc) });
            GMTrace.o(19759533916160L, 147220);
          }
        });
        GMTrace.o(20707916382208L, 154286);
      }
    });
    GMTrace.o(19765842149376L, 147267);
  }
  
  public final void Wl()
  {
    GMTrace.i(19765976367104L, 147268);
    w.i("MicroMsg.JsApiGetPhoneNumber", "showVerifyMobileDialog");
    Object localObject = (LayoutInflater)this.ibO.mContext.getSystemService("layout_inflater");
    if (this.ibW == null)
    {
      this.ibW = ((LayoutInflater)localObject).inflate(o.g.hDn, null);
      this.ibX = ((EditVerifyCodeView)this.ibW.findViewById(o.f.hBp));
      this.ibY = ((TextView)this.ibW.findViewById(o.f.hBn));
    }
    if (this.ibW.getParent() != null) {
      ((ViewGroup)this.ibW.getParent()).removeAllViews();
    }
    localObject = (TextView)this.ibW.findViewById(o.f.hBq);
    if (this.ibU == null) {
      this.ibU = "";
    }
    ((TextView)localObject).setText(this.ibO.iuf.getResources().getString(o.i.hFc, new Object[] { this.ibU }));
    this.ibX.setText("");
    Wm();
    localObject = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19764365754368L, 147256);
        w.i("MicroMsg.JsApiGetPhoneNumber", "to verify sms");
        if ((!TextUtils.isEmpty(c.this.ibX.mBuilder.toString())) && (c.this.ibX.mBuilder.toString().length() == 6))
        {
          w.e("MicroMsg.JsApiGetPhoneNumber", "code is length is 6");
          paramAnonymousDialogInterface.dismiss();
          c.this.Wn();
          c.this.ibW.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19761681399808L, 147236);
              ((MMActivity)c.this.ibO.mContext).aLo();
              GMTrace.o(19761681399808L, 147236);
            }
          });
          paramAnonymousDialogInterface = c.this;
          String str = c.this.ibX.mBuilder.toString().toString();
          w.i("MicroMsg.JsApiGetPhoneNumber", "doVerifyCode");
          Object localObject = new com.tencent.mm.ad.b.a();
          ((com.tencent.mm.ad.b.a)localObject).gtF = new ms();
          ((com.tencent.mm.ad.b.a)localObject).gtG = new mt();
          ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/checkverifycode";
          ((com.tencent.mm.ad.b.a)localObject).gtE = 1010;
          ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
          ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
          localObject = ((com.tencent.mm.ad.b.a)localObject).DA();
          ms localms = (ms)((com.tencent.mm.ad.b)localObject).gtC.gtK;
          localms.eSd = paramAnonymousDialogInterface.ibO.hyD;
          localms.eMW = paramAnonymousDialogInterface.eMW;
          localms.riG = str;
          com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ad.b)localObject, new c.5(paramAnonymousDialogInterface, h.a(paramAnonymousDialogInterface.ibO.mContext, "", false, null)));
          GMTrace.o(19764365754368L, 147256);
          return;
        }
        if ((!TextUtils.isEmpty(c.this.ibX.mBuilder.toString())) && (c.this.ibX.mBuilder.toString().length() < 6))
        {
          h.bm(c.this.ibO.mContext, c.this.ibO.iuf.getResources().getString(o.i.hFa));
          w.e("MicroMsg.JsApiGetPhoneNumber", "code is length is < 6");
          GMTrace.o(19764365754368L, 147256);
          return;
        }
        w.e("MicroMsg.JsApiGetPhoneNumber", "code is empty");
        h.bm(c.this.ibO.mContext, c.this.ibO.iuf.getResources().getString(o.i.hEZ));
        GMTrace.o(19764365754368L, 147256);
      }
    };
    this.icb = h.a(this.ibO.mContext, false, this.ibO.iuf.getResources().getString(o.i.hFd), this.ibW, this.ibO.iuf.getResources().getString(o.i.cTM), this.ibO.iuf.getResources().getString(o.i.cSk), (DialogInterface.OnClickListener)localObject, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20708050599936L, 154287);
        w.i("MicroMsg.JsApiGetPhoneNumber", "cancel to verify sms");
        paramAnonymousDialogInterface.dismiss();
        c.this.ibO.v(c.this.hYL, c.this.d("fail:cancel to verify sms", null));
        c.this.Wn();
        c.this.ibW.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20706574204928L, 154276);
            ((MMActivity)c.this.ibO.mContext).aLo();
            GMTrace.o(20706574204928L, 154276);
          }
        });
        g.ork.i(14249, new Object[] { c.this.ibO.hyD, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(c.this.icd), Integer.valueOf(c.this.ice), Integer.valueOf(c.this.icc) });
        GMTrace.o(20708050599936L, 154287);
      }
    });
    this.icb.a(this.ibO.iuf.getResources().getString(o.i.cTM), false, (DialogInterface.OnClickListener)localObject);
    this.ibW.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20706037334016L, 154272);
        ((MMActivity)c.this.ibO.mContext).aLs();
        GMTrace.o(20706037334016L, 154272);
      }
    });
    GMTrace.o(19765976367104L, 147268);
  }
  
  public final void Wm()
  {
    GMTrace.i(19766110584832L, 147269);
    w.i("MicroMsg.JsApiGetPhoneNumber", "updateSendText()");
    String str1 = this.ibO.iuf.getResources().getString(o.i.hES);
    String str2 = this.ibO.iuf.getResources().getString(o.i.hEU);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    localSpannableStringBuilder.append(str1);
    localSpannableStringBuilder.append(str2);
    int i = str1.length();
    int j = str2.length();
    localSpannableStringBuilder.setSpan(new ClickableSpan()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20705232027648L, 154266);
        w.i("MicroMsg.JsApiGetPhoneNumber", "click the resend spanBuilder, do resend sms");
        if (c.this.ibV)
        {
          c.this.Wk();
          GMTrace.o(20705232027648L, 154266);
          return;
        }
        w.e("MicroMsg.JsApiGetPhoneNumber", "allow_send_sms is false, show send_verify_code_frequent error");
        c.this.qn(c.this.ibO.iuf.getResources().getString(o.i.hEW));
        GMTrace.o(20705232027648L, 154266);
      }
    }, i, i + j, 17);
    localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.ibO.mContext.getResources().getColor(o.c.aOm)), i, j + i, 17);
    this.ibY.setText(localSpannableStringBuilder);
    this.ibY.setMovementMethod(LinkMovementMethod.getInstance());
    GMTrace.o(19766110584832L, 147269);
  }
  
  public final void Wn()
  {
    GMTrace.i(19766379020288L, 147271);
    w.i("MicroMsg.JsApiGetPhoneNumber", "stopSmsListener");
    if (this.ibZ != null) {
      this.ibZ.cancel();
    }
    if (this.ica != null)
    {
      this.ica.stop();
      this.ica.oWE = null;
    }
    GMTrace.o(19766379020288L, 147271);
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19765439496192L, 147264);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber data is null");
      paramAppBrandPageView.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19765439496192L, 147264);
      return;
    }
    this.ibO = paramAppBrandPageView;
    this.hYL = paramInt;
    w.i("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber data:%s", new Object[] { paramJSONObject.toString() });
    String str = paramJSONObject.optString("api_name", "webapi_getuserwxphone");
    boolean bool = paramJSONObject.optBoolean("with_credentials", true);
    if (TextUtils.isEmpty(str))
    {
      w.e("MicroMsg.JsApiGetPhoneNumber", "getPhoneNumber api_name is null");
      paramAppBrandPageView.v(paramInt, d("fail:api_name is null", null));
      GMTrace.o(19765439496192L, 147264);
      return;
    }
    com.tencent.mm.plugin.appbrand.c.a(paramAppBrandPageView.hyD, new c.b()
    {
      public final void onDestroy()
      {
        GMTrace.i(19761144528896L, 147232);
        w.i("MicroMsg.JsApiGetPhoneNumber", "AppBrandLifeCycle onDestroy");
        com.tencent.mm.plugin.appbrand.c.b(paramAppBrandPageView.hyD, this);
        c.this.Wn();
        GMTrace.o(19761144528896L, 147232);
      }
    });
    this.ibP = str;
    this.ibQ = bool;
    Wi();
    GMTrace.o(19765439496192L, 147264);
  }
  
  public final void qn(String paramString)
  {
    GMTrace.i(19766244802560L, 147270);
    Wn();
    h.a(this.ibO.mContext, paramString, "", false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20708721688576L, 154292);
        paramAnonymousDialogInterface.dismiss();
        c.this.ibO.v(c.this.hYL, c.this.d("fail", null));
        GMTrace.o(20708721688576L, 154292);
      }
    });
    GMTrace.o(19766244802560L, 147270);
  }
  
  final class a
    extends CountDownTimer
  {
    public a()
    {
      super(1000L);
      GMTrace.i(19757117997056L, 147202);
      GMTrace.o(19757117997056L, 147202);
    }
    
    public final void onFinish()
    {
      GMTrace.i(19757386432512L, 147204);
      c.this.Wm();
      GMTrace.o(19757386432512L, 147204);
    }
    
    public final void onTick(long paramLong)
    {
      GMTrace.i(19757252214784L, 147203);
      c.this.ibY.setText(c.this.ibO.iuf.getResources().getString(o.i.hET, new Object[] { paramLong / 1000L }));
      GMTrace.o(19757252214784L, 147203);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */