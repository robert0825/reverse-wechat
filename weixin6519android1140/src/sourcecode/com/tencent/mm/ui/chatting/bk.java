package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.af.m;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.kv;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelappbrand.o;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.k.b.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.bih;
import com.tencent.mm.protocal.c.bvi;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class bk
  extends ah
{
  static int wwK;
  static int wwL;
  public String hyD;
  private View.OnClickListener kHK;
  public com.tencent.mm.ui.base.r vOg;
  public com.tencent.mm.ao.a.a.c vOp;
  public com.tencent.mm.sdk.b.c<kv> wrp;
  public En_5b8fbb1e.a wvE;
  private View.OnClickListener wwE;
  private View.OnClickListener wwF;
  private View.OnClickListener wwG;
  private View.OnClickListener wwH;
  private En_5b8fbb1e.b wwI;
  public String wwJ;
  
  static
  {
    GMTrace.i(2491081031680L, 18560);
    wwK = Color.parseColor("#888888");
    wwL = Color.parseColor("#888888");
    GMTrace.o(2491081031680L, 18560);
  }
  
  public bk()
  {
    super(40);
    GMTrace.i(2488128241664L, 18538);
    c.a locala = new c.a();
    locala.gKZ = true;
    locala.gKR = R.g.aUD;
    this.vOp = locala.Jn();
    this.wwF = new a();
    this.wwE = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(2218619043840L, 16530);
        final au localau = (au)paramAnonymousView.getTag(R.h.bQv);
        if (localau == null)
        {
          w.w("MicroMsg.ChattingItemDyeingTemplate", "on more view click, but msg is null.");
          GMTrace.o(2218619043840L, 16530);
          return;
        }
        Object localObject = bh.q(localau.field_content, "msg");
        if ((localObject == null) || (((Map)localObject).size() == 0))
        {
          GMTrace.o(2218619043840L, 16530);
          return;
        }
        final String str = bg.nl((String)((Map)localObject).get(".msg.fromusername"));
        WxaAttributes localWxaAttributes = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(str);
        final int i = bg.m(((Map)localObject).get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), -1);
        final int j = bg.m(((Map)localObject).get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_version"), -1);
        localObject = new com.tencent.mm.ui.widget.f(paramAnonymousView.getContext(), com.tencent.mm.ui.widget.f.xpQ, false);
        final boolean bool;
        if ((localWxaAttributes != null) && ((localWxaAttributes.field_appOpt & 0x1) > 0))
        {
          bool = true;
          if (!bool) {
            break label255;
          }
          ((com.tencent.mm.ui.widget.f)localObject).d(paramAnonymousView.getResources().getString(R.l.dNe), 3);
        }
        for (;;)
        {
          ((com.tencent.mm.ui.widget.f)localObject).qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(2142651809792L, 15964);
              if (bool) {
                paramAnonymous2n.a(1, paramAnonymousView.getResources().getColor(R.e.aNQ), paramAnonymousView.getResources().getString(R.l.dNd));
              }
              for (;;)
              {
                paramAnonymous2n.add(0, 2, 0, paramAnonymousView.getResources().getString(R.l.dMV));
                GMTrace.o(2142651809792L, 15964);
                return;
                paramAnonymous2n.a(0, paramAnonymousView.getResources().getColor(R.e.aOM), paramAnonymousView.getResources().getString(R.l.dMQ));
              }
            }
          };
          ((com.tencent.mm.ui.widget.f)localObject).qil = new p.d()
          {
            public final void c(final MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(2366258544640L, 17630);
              w.d("MicroMsg.ChattingItemDyeingTemplate", "on menu(id : %d, index : %d) item selected.", new Object[] { Integer.valueOf(paramAnonymous2MenuItem.getItemId()), Integer.valueOf(paramAnonymous2Int) });
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(2366258544640L, 17630);
                return;
                ((dy)paramAnonymousView.getTag(R.h.bQd)).wGa.setVisibility(0);
                paramAnonymous2MenuItem = new rz();
                paramAnonymous2MenuItem.eWN.eAr = str;
                paramAnonymous2MenuItem.eWN.action = 1;
                paramAnonymous2MenuItem.eWN.eWP = 1;
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2MenuItem);
                paramAnonymous2MenuItem = new LinkedList();
                Object localObject = new bih();
                ((bih)localObject).uTM = str;
                ((bih)localObject).uTL = 0;
                ((bih)localObject).jib = 1;
                paramAnonymous2MenuItem.add(localObject);
                bk.y(2, bk.this.hyD, bk.this.wwJ);
                at.wS().a(1176, new e()
                {
                  public final void a(int paramAnonymous3Int1, int paramAnonymous3Int2, String paramAnonymous3String, com.tencent.mm.ad.k paramAnonymous3k)
                  {
                    GMTrace.i(2161308073984L, 16103);
                    at.wS().b(1176, this);
                    w.d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramAnonymous3Int1), Integer.valueOf(paramAnonymous3Int2), paramAnonymous3String, Boolean.valueOf(true) });
                    if (bk.1.2.this.gmh != bk.1.2.this.iBC.getTag(R.h.bQv))
                    {
                      w.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", new Object[] { Long.valueOf(bk.1.2.this.gmh.field_msgId) });
                      GMTrace.o(2161308073984L, 16103);
                      return;
                    }
                    if ((paramAnonymous3Int1 != 0) || (paramAnonymous3Int2 != 0))
                    {
                      ((dy)bk.1.2.this.iBC.getTag(R.h.bQd)).wGa.setVisibility(8);
                      com.tencent.mm.ui.base.u.makeText(bk.1.2.this.iBC.getContext(), R.l.dNa, 0).show();
                      paramAnonymous3String = new rz();
                      paramAnonymous3String.eWN.eAr = bk.1.2.this.rTA;
                      paramAnonymous3String.eWN.action = 2;
                      paramAnonymous3String.eWN.eWP = 1;
                      com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous3String);
                      if (bk.this.wvE != null) {
                        bk.this.wvE.bZV();
                      }
                      GMTrace.o(2161308073984L, 16103);
                      return;
                    }
                    GMTrace.o(2161308073984L, 16103);
                  }
                });
                paramAnonymous2MenuItem = new com.tencent.mm.modelappbrand.k(paramAnonymous2MenuItem);
                at.wS().a(paramAnonymous2MenuItem, 0);
                if (bk.this.wvE != null)
                {
                  bk.this.wvE.bZV();
                  GMTrace.o(2366258544640L, 17630);
                  return;
                  ((dy)paramAnonymousView.getTag(R.h.bQd)).wGa.setVisibility(8);
                  paramAnonymous2MenuItem = new rz();
                  paramAnonymous2MenuItem.eWN.eAr = str;
                  paramAnonymous2MenuItem.eWN.action = 2;
                  paramAnonymous2MenuItem.eWN.eWP = 1;
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2MenuItem);
                  paramAnonymous2MenuItem = new LinkedList();
                  localObject = new bih();
                  ((bih)localObject).uTM = str;
                  ((bih)localObject).uTL = 1;
                  ((bih)localObject).jib = 1;
                  paramAnonymous2MenuItem.add(localObject);
                  bk.y(3, bk.this.hyD, bk.this.wwJ);
                  at.wS().a(1176, new e()
                  {
                    public final void a(int paramAnonymous3Int1, int paramAnonymous3Int2, String paramAnonymous3String, com.tencent.mm.ad.k paramAnonymous3k)
                    {
                      GMTrace.i(2158757937152L, 16084);
                      at.wS().b(1176, this);
                      w.d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramAnonymous3Int1), Integer.valueOf(paramAnonymous3Int2), paramAnonymous3String, Boolean.valueOf(false) });
                      if (bk.1.2.this.gmh != bk.1.2.this.iBC.getTag(R.h.bQv))
                      {
                        w.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", new Object[] { Long.valueOf(bk.1.2.this.gmh.field_msgId) });
                        GMTrace.o(2158757937152L, 16084);
                        return;
                      }
                      if ((paramAnonymous3Int1 != 0) || (paramAnonymous3Int2 != 0))
                      {
                        ((dy)bk.1.2.this.iBC.getTag(R.h.bQd)).wGa.setVisibility(0);
                        com.tencent.mm.ui.base.u.makeText(bk.1.2.this.iBC.getContext(), R.l.dNa, 0).show();
                        paramAnonymous3String = new rz();
                        paramAnonymous3String.eWN.eAr = bk.1.2.this.rTA;
                        paramAnonymous3String.eWN.action = 1;
                        paramAnonymous3String.eWN.eWP = 1;
                        com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous3String);
                        if (bk.this.wvE != null) {
                          bk.this.wvE.bZV();
                        }
                        GMTrace.o(2158757937152L, 16084);
                        return;
                      }
                      GMTrace.o(2158757937152L, 16084);
                    }
                  });
                  paramAnonymous2MenuItem = new com.tencent.mm.modelappbrand.k(paramAnonymous2MenuItem);
                  at.wS().a(paramAnonymous2MenuItem, 0);
                  if (bk.this.wvE != null)
                  {
                    bk.this.wvE.bZV();
                    GMTrace.o(2366258544640L, 17630);
                    return;
                    at.wS().a(1198, new e()
                    {
                      public final void a(int paramAnonymous3Int1, int paramAnonymous3Int2, final String paramAnonymous3String, com.tencent.mm.ad.k paramAnonymous3k)
                      {
                        GMTrace.i(2301565599744L, 17148);
                        at.wS().b(1198, this);
                        w.d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramAnonymous3Int1), Integer.valueOf(paramAnonymous3Int2), paramAnonymous3String, Boolean.valueOf(false) });
                        if (bk.this.vOg != null)
                        {
                          bk.this.vOg.dismiss();
                          bk.this.vOg = null;
                        }
                        if ((paramAnonymous3Int1 != 0) || (paramAnonymous3Int2 != 0))
                        {
                          com.tencent.mm.ui.base.u.makeText(bk.1.2.this.iBC.getContext(), R.l.dMW, 0).show();
                          GMTrace.o(2301565599744L, 17148);
                          return;
                        }
                        paramAnonymous3String = ((o)paramAnonymous3k).CP();
                        if (paramAnonymous3String == null)
                        {
                          com.tencent.mm.ui.base.u.makeText(bk.1.2.this.iBC.getContext(), R.l.dMW, 0).show();
                          GMTrace.o(2301565599744L, 17148);
                          return;
                        }
                        paramAnonymous3String = paramAnonymous3String.vdE;
                        w.i("MicroMsg.ChattingItemDyeingTemplate", "more view clicked, menu item COMPLAIN_APP_BRAND selected, sync attr username %s", new Object[] { bk.1.2.this.rTA });
                        ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).a(bk.1.2.this.rTA, new b.a()
                        {
                          public final void b(WxaAttributes paramAnonymous4WxaAttributes)
                          {
                            GMTrace.i(17919811518464L, 133513);
                            if (paramAnonymous4WxaAttributes == null)
                            {
                              com.tencent.mm.ui.base.u.makeText(bk.1.2.this.iBC.getContext(), R.l.dNa, 0).show();
                              GMTrace.o(17919811518464L, 133513);
                              return;
                            }
                            Object localObject = paramAnonymous4WxaAttributes.field_appId;
                            if ((TextUtils.isEmpty((CharSequence)localObject)) || (TextUtils.isEmpty(paramAnonymous3String)))
                            {
                              w.i("MicroMsg.ChattingItemDyeingTemplate", "appId(%s) or msgId(%s) is null or nil.", new Object[] { localObject, paramAnonymous3String });
                              com.tencent.mm.ui.base.u.makeText(bk.1.2.this.iBC.getContext(), R.l.dNa, 0).show();
                              GMTrace.o(17919811518464L, 133513);
                              return;
                            }
                            try
                            {
                              paramAnonymous4WxaAttributes = String.format("https://mp.weixin.qq.com/mp/wacomplain?action=show&appid=%s&msgid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect", new Object[] { URLEncoder.encode((String)localObject, "utf-8"), URLEncoder.encode(paramAnonymous3String, "utf-8"), Integer.valueOf(1), Integer.valueOf(bk.1.2.this.wwP), Integer.valueOf(bk.1.2.this.hSJ) });
                              w.d("MicroMsg.ChattingItemDyeingTemplate", "go to complain page(%s, %s), url:%s", new Object[] { paramAnonymous3String, localObject, paramAnonymous4WxaAttributes });
                              localObject = new Intent();
                              ((Intent)localObject).putExtra("rawUrl", paramAnonymous4WxaAttributes);
                              com.tencent.mm.bj.d.b(bk.this.wvE.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
                              GMTrace.o(17919811518464L, 133513);
                              return;
                            }
                            catch (UnsupportedEncodingException paramAnonymous4WxaAttributes)
                            {
                              w.e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
                              com.tencent.mm.ui.base.u.makeText(bk.1.2.this.iBC.getContext(), R.l.dNa, 0).show();
                              GMTrace.o(17919811518464L, 133513);
                            }
                          }
                        });
                        GMTrace.o(2301565599744L, 17148);
                      }
                    });
                    paramAnonymous2MenuItem = new o(localau.field_content);
                    localObject = bk.this;
                    Context localContext = paramAnonymousView.getContext();
                    paramAnonymousView.getResources().getString(R.l.cUG);
                    ((bk)localObject).vOg = com.tencent.mm.ui.base.h.a(localContext, paramAnonymousView.getResources().getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
                    {
                      public final void onCancel(DialogInterface paramAnonymous3DialogInterface)
                      {
                        GMTrace.i(2520608931840L, 18780);
                        at.wS().c(paramAnonymous2MenuItem);
                        GMTrace.o(2520608931840L, 18780);
                      }
                    });
                    at.wS().a(paramAnonymous2MenuItem, 0);
                    bk.y(4, bk.this.hyD, bk.this.wwJ);
                  }
                }
              }
            }
          };
          ((com.tencent.mm.ui.widget.f)localObject).bFk();
          GMTrace.o(2218619043840L, 16530);
          return;
          bool = false;
          break;
          label255:
          ((com.tencent.mm.ui.widget.f)localObject).d(paramAnonymousView.getResources().getString(R.l.dMR), 3);
        }
      }
    };
    this.wwG = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2279688110080L, 16985);
        Object localObject2 = (dr)paramAnonymousView.getTag();
        w.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) name click", new Object[] { ((dr)localObject2).userName });
        Object localObject1 = bh.q(((com.tencent.mm.pluginsdk.ui.chat.c)localObject2).eRz.field_content, "msg");
        if ((localObject1 != null) && (((Map)localObject1).size() != 0)) {
          bg.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), 0);
        }
        localObject1 = bk.this;
        paramAnonymousView.getContext();
        Object localObject3 = ((dr)localObject2).userName;
        paramAnonymousView = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn((String)localObject3);
        if (paramAnonymousView != null) {
          bk.y(1, paramAnonymousView.field_appId, ((bk)localObject1).wwJ);
        }
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("key_username", (String)localObject3);
        ((Intent)localObject2).putExtra("key_from_scene", 5);
        if (paramAnonymousView != null)
        {
          localObject3 = new WxaExposedParams.a();
          ((WxaExposedParams.a)localObject3).appId = paramAnonymousView.field_appId;
          ((WxaExposedParams.a)localObject3).eDj = 6;
          ((Intent)localObject2).putExtra("key_scene_exposed_params", ((WxaExposedParams.a)localObject3).UI());
        }
        com.tencent.mm.bj.d.b(((bk)localObject1).wvE.vKB.vKW, "appbrand", ".ui.AppBrandProfileUI", (Intent)localObject2);
        GMTrace.o(2279688110080L, 16985);
      }
    };
    this.wrp = new com.tencent.mm.sdk.b.c() {};
    this.wwI = new En_5b8fbb1e.b()
    {
      public final void cct()
      {
        GMTrace.i(17610439655424L, 131208);
        GMTrace.o(17610439655424L, 131208);
      }
      
      public final void ccu()
      {
        GMTrace.i(17610573873152L, 131209);
        GMTrace.o(17610573873152L, 131209);
      }
      
      public final void ccv()
      {
        GMTrace.i(2296331108352L, 17109);
        w.i("MicroMsg.ChattingItemDyeingTemplate", "onChattingExit, then remove AppBrandTmplMsgReceivingSwitchListener.");
        com.tencent.mm.sdk.b.a.vgX.c(bk.this.wrp);
        if (bk.this.wvE != null) {
          bk.this.wvE.b(this);
        }
        GMTrace.o(2296331108352L, 17109);
      }
    };
    this.wwH = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2308410703872L, 17199);
        dr localdr = (dr)paramAnonymousView.getTag();
        w.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) container click", new Object[] { localdr.userName });
        qi localqi = new qi();
        localqi.eUY.userName = localdr.userName;
        localqi.eUY.eVa = localdr.wFB;
        Map localMap = bh.q(localdr.eRz.field_content, "msg");
        String str = "";
        paramAnonymousView = str;
        if (localMap != null)
        {
          paramAnonymousView = str;
          if (localMap.size() > 0)
          {
            localqi.eUY.eVb = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), 0);
            paramAnonymousView = bg.nl((String)localMap.get(".msg.appmsg.template_id"));
          }
        }
        localqi.eUY.eVe = true;
        localqi.eUY.scene = 1014;
        localqi.eUY.eAv = (localdr.eRz.field_msgSvrId + ":" + localdr.userName + ":" + bk.this.wvE.cci() + ":" + paramAnonymousView);
        com.tencent.mm.sdk.b.a.vgX.m(localqi);
        bk.y(9, bk.this.hyD, bk.this.wwJ);
        com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { bk.this.wwJ, localdr.userName, Integer.valueOf(0) });
        GMTrace.o(2308410703872L, 17199);
      }
    };
    this.kHK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2308679139328L, 17201);
        dr localdr = (dr)paramAnonymousView.getTag();
        paramAnonymousView = bh.q(localdr.eRz.field_content, "msg");
        if (paramAnonymousView == null)
        {
          w.i("MicroMsg.ChattingItemDyeingTemplate", "values map is null.");
          GMTrace.o(2308679139328L, 17201);
          return;
        }
        String str1 = (String)paramAnonymousView.get(".msg.appmsg.mmreader.category.item.weapp_username");
        String str2 = (String)paramAnonymousView.get(".msg.appmsg.mmreader.category.item.weapp_path");
        int i = bg.getInt((String)paramAnonymousView.get(".msg.appmsg.mmreader.category.item.weapp_version"), 0);
        int j = bg.getInt((String)paramAnonymousView.get(".msg.appmsg.mmreader.category.item.weapp_state"), 0);
        paramAnonymousView = bg.nl((String)paramAnonymousView.get(".msg.appmsg.template_id"));
        w.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) container click", new Object[] { str1 });
        AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
        localAppBrandStatObject.eAv = (localdr.eRz.field_msgSvrId + ":" + localdr.userName + ":" + bk.this.wvE.cci() + ":" + paramAnonymousView);
        if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(localdr.userName))
        {
          localAppBrandStatObject.scene = 1014;
          ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(bk.this.wvE.vKB.vKW, str1, null, j, i, str2, localAppBrandStatObject);
          bk.y(9, bk.this.hyD, bk.this.wwJ);
          com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { bk.this.wwJ, localdr.userName, Integer.valueOf(0) });
          GMTrace.o(2308679139328L, 17201);
          return;
        }
        localAppBrandStatObject.scene = 1043;
        paramAnonymousView = com.tencent.mm.af.f.iK(localdr.userName);
        com.tencent.mm.plugin.appbrand.k.c localc = (com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class);
        ActionBarActivity localActionBarActivity = bk.this.wvE.vKB.vKW;
        if (paramAnonymousView == null) {}
        for (paramAnonymousView = null;; paramAnonymousView = paramAnonymousView.field_appId)
        {
          localc.a(localActionBarActivity, str1, null, j, i, str2, localAppBrandStatObject, paramAnonymousView);
          break;
        }
      }
    };
    GMTrace.o(2488128241664L, 18538);
  }
  
  private static int VW(String paramString)
  {
    int j = 0;
    GMTrace.i(2489738854400L, 18550);
    if (bg.nm(paramString))
    {
      GMTrace.o(2489738854400L, 18550);
      return 0;
    }
    int i = 0;
    if (j < paramString.length())
    {
      if (paramString.substring(j, j + 1).matches("[Α-￥]")) {
        i += 2;
      }
      for (;;)
      {
        j += 1;
        break;
        i += 1;
      }
    }
    GMTrace.o(2489738854400L, 18550);
    return i;
  }
  
  private void a(ImageView paramImageView, En_5b8fbb1e.a parama, String paramString1, au paramau, String paramString2)
  {
    GMTrace.i(2489201983488L, 18546);
    if (paramImageView == null)
    {
      GMTrace.o(2489201983488L, 18546);
      return;
    }
    if (s.gm(paramString1))
    {
      paramImageView.setVisibility(8);
      GMTrace.o(2489201983488L, 18546);
      return;
    }
    paramImageView.setVisibility(0);
    if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(paramString1))
    {
      com.tencent.mm.ao.n.Jd().a(paramString2, paramImageView, this.vOp);
      paramImageView.setTag(new dr(paramau, paramString1, 1));
      paramImageView.setOnClickListener(this.wwG);
      paramImageView.setOnLongClickListener(parama.wvd.wyY);
      paramImageView.setContentDescription(com.tencent.mm.y.r.fs(paramString1) + parama.vKB.vKW.getString(R.l.cVf));
      GMTrace.o(2489201983488L, 18546);
      return;
    }
    paramau = m.d(paramString1, null, 0);
    if (paramau != null)
    {
      paramImageView.setImageBitmap(paramau);
      label181:
      if (!parama.wvi) {
        break label233;
      }
    }
    label233:
    for (paramau = parama.cci();; paramau = null)
    {
      paramImageView.setTag(new dr(paramString1, 1, paramau));
      paramImageView.setOnClickListener(parama.wvd.wyW);
      break;
      paramImageView.setImageResource(R.g.aUD);
      break label181;
    }
  }
  
  private void a(dy paramdy, au paramau, Map<String, String> paramMap)
  {
    GMTrace.i(17917529817088L, 133496);
    LinearLayout localLinearLayout = paramdy.wGp;
    int j = localLinearLayout.getChildCount();
    int i = 0;
    if (i < 10)
    {
      if (i == 0) {}
      final String str1;
      for (paramdy = ".msg.appmsg.mmreader.template_detail.opitems.opitem";; paramdy = ".msg.appmsg.mmreader.template_detail.opitems.opitem" + i)
      {
        str1 = (String)paramMap.get(paramdy + ".word");
        if (!bg.nm(str1)) {
          break label179;
        }
        w.i("MicroMsg.ChattingItemDyeingTemplate", "fillingVerticalButtons: count=%d", new Object[] { Integer.valueOf(i) });
        j = localLinearLayout.getChildCount();
        if (j <= i) {
          break label804;
        }
        if (i != 0) {
          break;
        }
        localLinearLayout.removeAllViews();
        GMTrace.o(17917529817088L, 133496);
        return;
      }
      localLinearLayout.removeViews(i, j - i);
      GMTrace.o(17917529817088L, 133496);
      return;
      label179:
      Object localObject1;
      label198:
      final Object localObject2;
      final int k;
      label318:
      final String str2;
      if (i < j)
      {
        localObject1 = (LinearLayout)localLinearLayout.getChildAt(i);
        localObject1 = (u)((LinearLayout)localObject1).getTag();
        localObject2 = (String)paramMap.get(paramdy + ".icon");
        k = d(paramMap, paramdy + ".color", -16777216);
        ((u)localObject1).ikm.setTextColor(k);
        ((u)localObject1).ikm.setText(str1);
        if (!bg.nm((String)localObject2)) {
          break label731;
        }
        ((u)localObject1).iCr.setVisibility(8);
        ((u)localObject1).ikm.setPadding(0, 0, 0, 0);
        str2 = (String)paramMap.get(paramdy + ".url");
        str1 = bg.nl((String)paramMap.get(".msg.fromusername"));
        final int m = bg.getInt((String)paramMap.get(paramdy + ".op_type"), 0);
        localObject2 = (String)paramMap.get(paramdy + ".weapp_username");
        dr localdr = new dr(paramau, str1, str2);
        ((u)localObject1).wtv.setTag(localdr);
        k = i + 1;
        if ((m != 1) || (TextUtils.isEmpty((CharSequence)localObject2))) {
          break label779;
        }
        str2 = (String)paramMap.get(paramdy + ".weapp_path");
        m = bg.getInt((String)paramMap.get(paramdy + ".weapp_version"), 0);
        final int n = bg.getInt((String)paramMap.get(paramdy + ".weapp_state"), 0);
        paramdy = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17916053422080L, 133485);
            paramAnonymousView = (dr)paramAnonymousView.getTag();
            w.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) button1 click", new Object[] { localObject2 });
            AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
            localAppBrandStatObject.eAv = (paramAnonymousView.eRz.field_msgSvrId + ":" + paramAnonymousView.userName + ":" + bk.this.wvE.cci() + ":" + this.wvK);
            if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(paramAnonymousView.userName))
            {
              localAppBrandStatObject.scene = 1014;
              ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(bk.this.wvE.vKB.vKW, localObject2, null, n, m, str2, localAppBrandStatObject);
              bk.y(9, bk.this.hyD, bk.this.wwJ);
              com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { bk.this.wwJ, str1, Integer.valueOf(k) });
              GMTrace.o(17916053422080L, 133485);
              return;
            }
            localAppBrandStatObject.scene = 1043;
            paramAnonymousView = com.tencent.mm.af.f.iK(paramAnonymousView.userName);
            com.tencent.mm.plugin.appbrand.k.c localc = (com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class);
            ActionBarActivity localActionBarActivity = bk.this.wvE.vKB.vKW;
            String str1 = localObject2;
            int i = n;
            int j = m;
            String str2 = str2;
            if (paramAnonymousView == null) {}
            for (paramAnonymousView = null;; paramAnonymousView = paramAnonymousView.field_appId)
            {
              localc.a(localActionBarActivity, str1, null, i, j, str2, localAppBrandStatObject, paramAnonymousView);
              break;
            }
          }
        };
        ((u)localObject1).wtv.setOnClickListener(paramdy);
      }
      for (;;)
      {
        i += 1;
        break;
        localObject1 = (LinearLayout)LayoutInflater.from(this.wvE.vKB.vKW).inflate(R.i.crS, null, false);
        localObject2 = new u();
        ((u)localObject2).ikm = ((TextView)((LinearLayout)localObject1).findViewById(R.h.bQm));
        ((u)localObject2).iCr = ((ImageView)((LinearLayout)localObject1).findViewById(R.h.bQl));
        ((u)localObject2).wtv = ((LinearLayout)((LinearLayout)localObject1).findViewById(R.h.bQk));
        ((LinearLayout)localObject1).setTag(localObject2);
        localLinearLayout.addView((View)localObject1);
        break label198;
        label731:
        ((u)localObject1).iCr.setVisibility(0);
        g(((u)localObject1).iCr, (String)localObject2);
        ((u)localObject1).ikm.setPadding(0, 0, com.tencent.mm.br.a.fromDPToPix(this.wvE.vKB.vKW, 28), 0);
        break label318;
        label779:
        ((u)localObject1).wtv.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17901557907456L, 133377);
            if (!bg.nm(str2))
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("rawUrl", str2);
              com.tencent.mm.bj.d.b(bk.this.wvE.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
              com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { bk.this.wwJ, str1, Integer.valueOf(k) });
            }
            GMTrace.o(17901557907456L, 133377);
          }
        });
      }
    }
    label804:
    GMTrace.o(17917529817088L, 133496);
  }
  
  private void a(dy paramdy, String paramString1, String paramString2)
  {
    GMTrace.i(17917395599360L, 133495);
    paramdy.wFZ.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.wvE.vKB.vKW, paramString2, paramdy.wFZ.getTextSize()));
    com.tencent.mm.ao.n.Jd().a(paramString1, paramdy.wFY, this.vOp);
    paramdy.wFY.setTag(null);
    paramdy.wFY.setOnClickListener(null);
    paramdy.wFX.setTag(null);
    paramdy.wFX.setOnClickListener(null);
    paramdy.wFX.setVisibility(0);
    GMTrace.o(17917395599360L, 133495);
  }
  
  private static int d(Map<String, String> paramMap, String paramString, int paramInt)
  {
    GMTrace.i(2489604636672L, 18549);
    if ((paramMap == null) || (bg.nm(paramString)))
    {
      GMTrace.o(2489604636672L, 18549);
      return paramInt;
    }
    try
    {
      int i = Color.parseColor(bg.nl((String)paramMap.get(paramString)));
      paramInt = i;
    }
    catch (Exception paramMap)
    {
      for (;;) {}
    }
    GMTrace.o(2489604636672L, 18549);
    return paramInt;
  }
  
  private static void g(ImageView paramImageView, String paramString)
  {
    GMTrace.i(2489336201216L, 18547);
    if ((bg.nm(paramString)) || (paramImageView == null))
    {
      GMTrace.o(2489336201216L, 18547);
      return;
    }
    Object localObject = new c.a();
    at.AR();
    ((c.a)localObject).gKF = com.tencent.mm.y.c.yV();
    ((c.a)localObject).gKC = true;
    ((c.a)localObject).gKY = true;
    localObject = ((c.a)localObject).Jn();
    com.tencent.mm.ao.n.Jd().a(paramString, paramImageView, (com.tencent.mm.ao.a.a.c)localObject);
    GMTrace.o(2489336201216L, 18547);
  }
  
  public static void y(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(2489470418944L, 18548);
    w.d("MicroMsg.ChattingItemDyeingTemplate", "stev report(%s), eventId : %d, appId %s, templateId %s", new Object[] { Integer.valueOf(13796), Integer.valueOf(paramInt), paramString1, paramString2 });
    com.tencent.mm.plugin.report.service.g.ork.i(13796, new Object[] { Integer.valueOf(paramInt), paramString1, paramString2, Integer.valueOf(0), Long.valueOf(bg.Pu()) });
    GMTrace.o(2489470418944L, 18548);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2488262459392L, 18539);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csd);
      paramLayoutInflater = new dj(this.jHw);
      paramLayoutInflater.lCA = ((CheckBox)((View)localObject).findViewById(R.h.bnd));
      paramLayoutInflater.npf = ((View)localObject).findViewById(R.h.bnX);
      paramLayoutInflater.oGJ = ((TextView)((View)localObject).findViewById(R.h.boF));
      paramLayoutInflater.hqG = ((ImageView)((View)localObject).findViewById(R.h.bmT));
      paramLayoutInflater.jRw = ((TextView)((View)localObject).findViewById(R.h.boA));
      paramLayoutInflater.wtq = ((LinearLayout)((View)localObject).findViewById(R.h.bnk));
      paramLayoutInflater.wBV.odd = ((View)localObject).findViewById(R.h.bnK);
      paramLayoutInflater.wBV.wBX = ((View)localObject).findViewById(R.h.bFR);
      paramLayoutInflater.wBV.ikm = ((TextView)paramLayoutInflater.wBV.odd.findViewById(R.h.title));
      paramLayoutInflater.wBV.lWz = ((TextView)paramLayoutInflater.wBV.odd.findViewById(R.h.time));
      paramLayoutInflater.wBV.wCa = ((LinearLayout)paramLayoutInflater.wBV.odd.findViewById(R.h.buv));
      paramLayoutInflater.wBV.wtu = ((TextView)paramLayoutInflater.wtq.findViewById(R.h.btA));
      paramLayoutInflater.wBV.wCb = paramLayoutInflater.wtq.findViewById(R.h.ccm);
      paramLayoutInflater.wBV.wBY = ((View)localObject).findViewById(R.h.bOs);
      paramLayoutInflater.wBV.wBZ = ((View)localObject).findViewById(R.h.bOt);
      paramLayoutInflater.wBW.wFV = ((View)localObject).findViewById(R.h.bnJ);
      paramLayoutInflater.wBW.wFW = ((ImageView)((View)localObject).findViewById(R.h.bQt));
      paramLayoutInflater.wBW.wFX = ((View)localObject).findViewById(R.h.bQr);
      paramLayoutInflater.wBW.wFZ = ((TextView)((View)localObject).findViewById(R.h.bQH));
      paramLayoutInflater.wBW.wFY = ((ImageView)((View)localObject).findViewById(R.h.bQc));
      paramLayoutInflater.wBW.wGa = ((View)localObject).findViewById(R.h.bQd);
      paramLayoutInflater.wBW.wGb = ((View)localObject).findViewById(R.h.bQv);
      paramLayoutInflater.wBW.wGc = ((View)localObject).findViewById(R.h.bQw);
      paramLayoutInflater.wBW.wGd = ((TextView)((View)localObject).findViewById(R.h.bQB));
      paramLayoutInflater.wBW.wGe = ((TextView)((View)localObject).findViewById(R.h.bQA));
      paramLayoutInflater.wBW.wGf = ((TextView)((View)localObject).findViewById(R.h.bQq));
      paramLayoutInflater.wBW.wGg = ((View)localObject).findViewById(R.h.bQs);
      paramLayoutInflater.wBW.wGh = ((LinearLayout)((View)localObject).findViewById(R.h.bQC));
      paramLayoutInflater.wBW.wGi = ((TextView)((View)localObject).findViewById(R.h.bQE));
      paramLayoutInflater.wBW.wGk = ((TextView)((View)localObject).findViewById(R.h.bQF));
      paramLayoutInflater.wBW.wGj = ((TextView)((View)localObject).findViewById(R.h.bQG));
      paramLayoutInflater.wBW.wGl = ((View)localObject).findViewById(R.h.bQD);
      paramLayoutInflater.wBW.wGm = ((LinearLayout)((View)localObject).findViewById(R.h.bQu));
      paramLayoutInflater.wBW.wGq = ((View)localObject).findViewById(R.h.bQp);
      paramLayoutInflater.wBW.wGn = ((View)localObject).findViewById(R.h.biq);
      paramLayoutInflater.wBW.wGo = ((LinearLayout)((View)localObject).findViewById(R.h.bQn));
      paramLayoutInflater.wBW.wGp = ((LinearLayout)((View)localObject).findViewById(R.h.bvs));
      paramLayoutInflater.wBW.wGr = ((LinearLayout)((View)localObject).findViewById(R.h.bQe));
      paramLayoutInflater.wBW.wGu = ((TextView)((View)localObject).findViewById(R.h.bQg));
      paramLayoutInflater.wBW.wGw = ((ImageView)((View)localObject).findViewById(R.h.bQf));
      paramLayoutInflater.wBW.wGt = ((View)localObject).findViewById(R.h.bQo);
      paramLayoutInflater.wBW.wGs = ((LinearLayout)((View)localObject).findViewById(R.h.bQh));
      paramLayoutInflater.wBW.wGv = ((TextView)((View)localObject).findViewById(R.h.bQj));
      paramLayoutInflater.wBW.wGx = ((ImageView)((View)localObject).findViewById(R.h.bQi));
      paramLayoutInflater.wBW.wGy = ((ImageView)((View)localObject).findViewById(R.h.bQb));
      paramLayoutInflater.wss = ((ImageView)((View)localObject).findViewById(R.h.bnI));
      paramLayoutInflater.wBW.wGz = ((View)localObject).findViewById(R.h.bQx);
      paramLayoutInflater.wBW.wGA = ((ImageView)((View)localObject).findViewById(R.h.bQy));
      paramLayoutInflater.wBW.wGB = ((TextView)((View)localObject).findViewById(R.h.bQz));
      ((View)localObject).setTag(paramLayoutInflater);
    }
    GMTrace.o(2488262459392L, 18539);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, final En_5b8fbb1e.a parama1, au paramau, final String paramString)
  {
    GMTrace.i(2488530894848L, 18541);
    this.wvE = parama1;
    dj localdj = (dj)parama;
    Map localMap = bh.q(paramau.field_content, "msg");
    if ((localMap == null) || (localMap.size() == 0))
    {
      w.e("MicroMsg.ChattingItemDyeingTemplate", "filling fail, values is empty");
      localdj.wtq.setVisibility(8);
      GMTrace.o(2488530894848L, 18541);
      return;
    }
    localdj.wtq.setVisibility(0);
    final int i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
    this.wwJ = bg.nl((String)localMap.get(".msg.appmsg.template_id"));
    com.tencent.mm.sdk.b.a.vgX.c(this.wrp);
    parama1.b(this.wwI);
    final Object localObject1;
    label260:
    final int j;
    int k;
    label403:
    label450:
    label472:
    boolean bool;
    if (i != 0)
    {
      localdj.wBV.odd.setVisibility(8);
      localObject1 = localdj.wBW;
      if (bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.type"), 0) == 1)
      {
        a((dy)localObject1, bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url")), bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.app.display_name")));
        if (bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.hide_icon_and_display_name_line"), 0) == 0) {
          break label1576;
        }
        ((dy)localObject1).wFX.setBackgroundResource(R.g.aXW);
        j = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.hide_title_and_time"), 0);
        if (j != 0) {
          break label1626;
        }
        ((dy)localObject1).wGd.setVisibility(0);
        parama = bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_header.title"));
        k = d(localMap, ".msg.appmsg.mmreader.template_header.title_color", -16777216);
        ((dy)localObject1).wGd.setTextColor(k);
        ((dy)localObject1).wGd.setText(parama);
        long l = bg.getLong(bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_header.pub_time")), 0L);
        if (l <= 0L) {
          break label1613;
        }
        ((dy)localObject1).wGe.setText(com.tencent.mm.pluginsdk.i.n.ac(this.wvE.getString(R.l.dwB), l));
        ((dy)localObject1).wGe.setVisibility(0);
        parama = bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_header.first_data"));
        k = d(localMap, ".msg.appmsg.mmreader.template_header.first_color", wwL);
        if (!bg.nm(parama)) {
          break label1649;
        }
        ((dy)localObject1).wGf.setVisibility(8);
        if ((j == 0) || (!bg.nm(parama))) {
          break label1725;
        }
        ((dy)localObject1).wGg.setVisibility(8);
        bool = false;
        if (!"notifymessage".equals(paramau.field_talker)) {
          break label5605;
        }
        parama = bg.nl((String)localMap.get(".msg.fromusername"));
        bool = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(parama);
        if (!bool) {
          break label1785;
        }
        this.wvE.a(this.wwI);
        com.tencent.mm.sdk.b.a.vgX.b(this.wrp);
        parama1 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(parama);
        if (parama1 == null) {
          break label1743;
        }
        if ((parama1.field_appOpt & 0x1) <= 0) {
          break label1737;
        }
        i = 1;
        label582:
        this.hyD = parama1.field_appId;
      }
    }
    for (;;)
    {
      label590:
      parama = ((dy)localObject1).wGa;
      label604:
      label624:
      label907:
      label916:
      label946:
      final Object localObject2;
      if (i != 0)
      {
        i = 0;
        parama.setVisibility(i);
        parama = ((dy)localObject1).wGb;
        if (!bool) {
          break label1798;
        }
        i = 0;
        parama.setVisibility(i);
        ((dy)localObject1).wGb.setTag(R.h.bQv, paramau);
        ((dy)localObject1).wGb.setTag(R.h.bQd, localObject1);
        ((dy)localObject1).wGb.setOnClickListener(this.wwE);
        ((dy)localObject1).wFW.setVisibility(8);
        parama = bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_header.first_data"));
        ((dy)localObject1).wGf.setText(parama);
        parama = (String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.word");
        parama1 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.word");
        if (bg.nm(parama1)) {
          break label1838;
        }
        i = d(localMap, ".msg.appmsg.mmreader.template_detail.line_content.topline.key.color", -16777216);
        j = d(localMap, ".msg.appmsg.mmreader.template_detail.line_content.topline.value.color", -16777216);
        k = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.small_text_count"), 0);
        ((dy)localObject1).wGi.setTextColor(i);
        ((dy)localObject1).wGk.setTextColor(j);
        ((dy)localObject1).wGi.setText(parama);
        if ((k <= 0) || (k >= parama1.length())) {
          break label1805;
        }
        ((dy)localObject1).wGj.setVisibility(0);
        ((dy)localObject1).wGj.setText(parama1.substring(0, k));
        ((dy)localObject1).wGj.setTextColor(j);
        ((dy)localObject1).wGk.setTypeface(((com.tencent.mm.pluginsdk.wallet.b)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.wallet.b.class)).cQ(this.wvE.vKB.vKW));
        ((dy)localObject1).wGk.setText(parama1.substring(k));
        ((dy)localObject1).wGh.setVisibility(0);
        parama1 = new ArrayList();
        i = 0;
        j = 0;
        if (j < 100)
        {
          if (j != 0) {
            break label1851;
          }
          parama = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
          paramString = (String)localMap.get(parama + ".value.word");
          localObject2 = (String)localMap.get(parama + ".key.word");
          if ((!bg.nm(paramString)) || (!bg.nm((String)localObject2))) {
            break label1873;
          }
          w.i("MicroMsg.ChattingItemDyeingTemplate", "fillingLines: lines count=%d", new Object[] { Integer.valueOf(j) });
        }
        if (i <= 8) {
          break label2064;
        }
        i = 8;
        label1058:
        paramString = ((dy)localObject1).wGm;
        if (paramString.getChildCount() > parama1.size())
        {
          if (parama1.size() != 0) {
            break label2067;
          }
          paramString.removeAllViews();
        }
        label1093:
        k = paramString.getChildCount();
        j = 0;
        label1103:
        if (j >= parama1.size()) {
          break label2220;
        }
        localObject2 = (ds)parama1.get(j);
        if (j >= k) {
          break label2097;
        }
        parama = (LinearLayout)paramString.getChildAt(j);
        label1145:
        parama = (dt)parama.getTag();
        if (!((ds)localObject2).wFH) {
          break label2176;
        }
        parama.wFI.setVisibility(8);
      }
      label1336:
      label1459:
      label1497:
      label1576:
      label1613:
      label1626:
      label1649:
      label1725:
      label1737:
      label1743:
      label1785:
      label1798:
      label1805:
      label1838:
      label1851:
      label1873:
      final Object localObject3;
      for (;;)
      {
        parama.wFJ.setTextColor(((ds)localObject2).wFG);
        parama.wFJ.setText(((ds)localObject2).wFE);
        j += 1;
        break label1103;
        if (bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.show_icon_and_display_name"), 0) != 0)
        {
          a((dy)localObject1, bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_header.icon_url")), bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_header.display_name")));
          break;
        }
        if ("notifymessage".equals(paramau.field_talker))
        {
          parama1 = bg.nl((String)localMap.get(".msg.fromusername"));
          if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(parama1))
          {
            paramString = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(parama1);
            if (paramString == null)
            {
              parama = null;
              a(((dy)localObject1).wFY, this.wvE, parama1, paramau, parama);
              if (paramString != null) {
                break label1459;
              }
              parama = parama1;
            }
          }
          for (;;)
          {
            ((dy)localObject1).wFZ.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.wvE.vKB.vKW, parama, ((dy)localObject1).wFZ.getTextSize()));
            if (!((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(parama1)) {
              break label1497;
            }
            ((dy)localObject1).wFX.setTag(new dr(paramau, parama1, 0));
            ((dy)localObject1).wFX.setOnClickListener(this.wwG);
            ((dy)localObject1).wFX.setVisibility(0);
            break;
            parama = paramString.field_brandIconURL;
            break label1336;
            parama = paramString.field_nickname;
            continue;
            a(((dy)localObject1).wFY, this.wvE, parama1, paramau, null);
            parama = this.wvE.fs(parama1);
          }
          paramString = ((dy)localObject1).wFX;
          if (this.wvE.wvi) {}
          for (parama = this.wvE.cci();; parama = null)
          {
            paramString.setTag(new dr(parama1, 1, parama));
            ((dy)localObject1).wFX.setOnClickListener(this.wvE.wvd.wyW);
            break;
          }
        }
        ((dy)localObject1).wFX.setVisibility(8);
        break;
        j = ((dy)localObject1).wFX.getPaddingLeft();
        ((dy)localObject1).wFX.setBackgroundResource(R.g.aXC);
        ((dy)localObject1).wFX.setPadding(j, 0, 0, 0);
        break label260;
        ((dy)localObject1).wGe.setVisibility(8);
        break label403;
        ((dy)localObject1).wGd.setVisibility(8);
        ((dy)localObject1).wGe.setVisibility(8);
        break label403;
        ((dy)localObject1).wGf.setTextColor(k);
        ((dy)localObject1).wGf.setText(parama);
        ((dy)localObject1).wGf.setVisibility(0);
        if (i == 2)
        {
          ((dy)localObject1).wGf.setPadding(0, this.wvE.getResources().getDimensionPixelOffset(R.f.aQq), 0, 0);
          break label450;
        }
        ((dy)localObject1).wGf.setPadding(0, 0, 0, 0);
        break label450;
        ((dy)localObject1).wGg.setVisibility(0);
        break label472;
        i = 0;
        break label582;
        w.i("MicroMsg.ChattingItemDyeingTemplate", "try2HandleAppBrandLogic, sync attr username %s", new Object[] { parama });
        ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).a(parama, new b.a()
        {
          public final void b(WxaAttributes paramAnonymousWxaAttributes)
          {
            int j = 0;
            GMTrace.i(17911355801600L, 133450);
            if (paramAnonymousWxaAttributes == null)
            {
              GMTrace.o(17911355801600L, 133450);
              return;
            }
            bk.this.hyD = paramAnonymousWxaAttributes.field_appId;
            if ((paramAnonymousWxaAttributes.field_appOpt & 0x1) > 0)
            {
              i = 1;
              paramAnonymousWxaAttributes = localObject1.wGa;
              if (i == 0) {
                break label78;
              }
            }
            label78:
            for (int i = j;; i = 8)
            {
              paramAnonymousWxaAttributes.setVisibility(i);
              GMTrace.o(17911355801600L, 133450);
              return;
              i = 0;
              break;
            }
          }
        });
        i = 0;
        break label590;
        i = 8;
        break label604;
        i = 8;
        break label624;
        ((dy)localObject1).wGj.setVisibility(8);
        ((dy)localObject1).wGk.setTypeface(Typeface.DEFAULT);
        ((dy)localObject1).wGk.setText(parama1);
        break label907;
        ((dy)localObject1).wGh.setVisibility(8);
        break label916;
        parama = ".msg.appmsg.mmreader.template_detail.line_content.lines.line" + j;
        break label946;
        localObject3 = new ds();
        ((ds)localObject3).wFE = paramString;
        ((ds)localObject3).wFD = bg.nl((String)localObject2);
        ((ds)localObject3).wFF = d(localMap, parama + ".key.color", wwK);
        ((ds)localObject3).wFG = d(localMap, parama + ".value.color", -16777216);
        if (bg.getInt((String)localMap.get(parama + ".key.hide"), 0) != 0)
        {
          bool = true;
          label2005:
          ((ds)localObject3).wFH = bool;
          k = (VW(((ds)localObject3).wFD) + 1) / 2;
          if (k <= i) {
            break label2061;
          }
          i = k;
        }
        label2061:
        for (;;)
        {
          parama1.add(localObject3);
          j += 1;
          break;
          bool = false;
          break label2005;
        }
        label2064:
        break label1058;
        label2067:
        j = paramString.getChildCount();
        paramString.removeViews(parama1.size(), j - parama1.size());
        break label1093;
        label2097:
        parama = (LinearLayout)LayoutInflater.from(this.wvE.vKB.vKW).inflate(R.i.crT, null, false);
        localObject3 = new dt();
        ((dt)localObject3).wFI = ((TextView)parama.findViewById(R.h.bKd));
        ((dt)localObject3).wFJ = ((TextView)parama.findViewById(R.h.bKe));
        parama.setTag(localObject3);
        paramString.addView(parama);
        break label1145;
        label2176:
        parama.wFI.setVisibility(0);
        parama.wFI.setEms(i);
        parama.wFI.setTextColor(((ds)localObject2).wFF);
        parama.wFI.setText(((ds)localObject2).wFD);
      }
      label2220:
      label2314:
      final String str;
      Object localObject4;
      if (paramString.getChildCount() == 0)
      {
        ((dy)localObject1).wGl.setVisibility(8);
        paramString.setVisibility(8);
        if (bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.show_type"), 0) == 0) {
          break label2718;
        }
        ((dy)localObject1).wGz.setVisibility(8);
        ((dy)localObject1).wGo.setVisibility(8);
        ((dy)localObject1).wGq.setVisibility(8);
        ((dy)localObject1).wGp.setVisibility(0);
        a((dy)localObject1, paramau, localMap);
        paramString = bg.nl((String)localMap.get(".msg.fromusername"));
        parama = null;
        if (!bg.nm(paramString))
        {
          at.AR();
          parama = com.tencent.mm.y.c.yK().TE(paramString).vj();
        }
        localObject3 = (String)localMap.get(".msg.appmsg.mmreader.category.item.title");
        str = (String)localMap.get(".msg.appmsg.mmreader.category.item.url");
        localObject2 = (String)localMap.get(".msg.appmsg.mmreader.category.item.native_url");
        parama1 = (String)localMap.get(".msg.appmsg.template_id");
        i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
        localObject4 = (String)localMap.get(".msg.appmsg.mmreader.category.item.weapp_username");
        if ((i != 1) || (TextUtils.isEmpty((CharSequence)localObject4))) {
          break label4162;
        }
        paramString = new dr(paramau, paramString, str);
        paramString.position = paramInt;
        ((dy)localObject1).wFV.setTag(paramString);
        ((dy)localObject1).wFV.setOnClickListener(this.kHK);
        label2510:
        ((dy)localObject1).wFV.setOnLongClickListener(this.wvE.wvd.wyY);
        if (com.tencent.mm.k.g.uu().uh())
        {
          localdj.wss.setVisibility(0);
          c(this.wvE, localdj.wss, new ej(parama1, paramau, parama));
        }
        parama = bg.nl((String)localMap.get(".msg.fromusername"));
        if ((!((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(parama)) || (!"notifymessage".equals(paramau.field_talker))) {
          break label4346;
        }
        w.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew handled by app brand");
        ((dy)localObject1).wGc.setTag(null);
        ((dy)localObject1).wGc.setVisibility(8);
      }
      for (;;)
      {
        localdj.wBW.wFV.setVisibility(0);
        GMTrace.o(2488530894848L, 18541);
        return;
        if (bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.hide_dash_line"), 0) != 0) {
          ((dy)localObject1).wGl.setVisibility(8);
        }
        for (;;)
        {
          paramString.setVisibility(0);
          break;
          ((dy)localObject1).wGl.setVisibility(0);
        }
        label2718:
        ((dy)localObject1).wGp.setVisibility(8);
        parama1 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.word");
        parama = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.icon");
        if (!bg.nm(parama1))
        {
          i = d(localMap, ".msg.appmsg.mmreader.template_detail.opitems.opitem.color", -16777216);
          ((dy)localObject1).wGu.setTextColor(i);
          ((dy)localObject1).wGu.setText(parama1);
          if (bg.nm(parama))
          {
            ((dy)localObject1).wGw.setVisibility(8);
            ((dy)localObject1).wGu.setPadding(0, 0, 0, 0);
            label2824:
            localObject2 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.url");
            parama1 = bg.nl((String)localMap.get(".msg.fromusername"));
            i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type"), 0);
            paramString = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username");
            localObject3 = new dr(paramau, parama1, (String)localObject2);
            ((dy)localObject1).wGr.setTag(localObject3);
            ((dy)localObject1).wGz.setTag(localObject3);
            if ((i != 1) || (TextUtils.isEmpty(paramString))) {
              break label3716;
            }
            localObject2 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_path");
            i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_version"), 0);
            j = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_state"), 0);
            parama1 = new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(2116747788288L, 15771);
                paramAnonymousView = (dr)paramAnonymousView.getTag();
                w.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) button1 click", new Object[] { paramString });
                AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
                localAppBrandStatObject.eAv = (paramAnonymousView.eRz.field_msgSvrId + ":" + paramAnonymousView.userName + ":" + bk.this.wvE.cci() + ":" + this.wvK);
                if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(paramAnonymousView.userName))
                {
                  localAppBrandStatObject.scene = 1014;
                  ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(bk.this.wvE.vKB.vKW, paramString, null, j, i, localObject2, localAppBrandStatObject);
                  bk.y(9, bk.this.hyD, bk.this.wwJ);
                  com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { bk.this.wwJ, parama1, Integer.valueOf(1) });
                  GMTrace.o(2116747788288L, 15771);
                  return;
                }
                localAppBrandStatObject.scene = 1043;
                paramAnonymousView = com.tencent.mm.af.f.iK(paramAnonymousView.userName);
                com.tencent.mm.plugin.appbrand.k.c localc = (com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class);
                ActionBarActivity localActionBarActivity = bk.this.wvE.vKB.vKW;
                String str1 = paramString;
                int i = j;
                int j = i;
                String str2 = localObject2;
                if (paramAnonymousView == null) {}
                for (paramAnonymousView = null;; paramAnonymousView = paramAnonymousView.field_appId)
                {
                  localc.a(localActionBarActivity, str1, null, i, j, str2, localAppBrandStatObject, paramAnonymousView);
                  break;
                }
              }
            };
            ((dy)localObject1).wGr.setOnClickListener(parama1);
            ((dy)localObject1).wGz.setOnClickListener(parama1);
            label3043:
            ((dy)localObject1).wGr.setVisibility(0);
            label3052:
            paramString = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.word");
            parama1 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.icon");
            if (bg.nm(paramString)) {
              break label3830;
            }
            i = d(localMap, ".msg.appmsg.mmreader.template_detail.opitems.opitem1.color", -16777216);
            ((dy)localObject1).wGv.setTextColor(i);
            ((dy)localObject1).wGv.setText(paramString);
            if (!bg.nm(parama1)) {
              break label3760;
            }
            ((dy)localObject1).wGx.setVisibility(8);
            ((dy)localObject1).wGv.setPadding(0, 0, 0, 0);
            label3151:
            localObject3 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.url");
            paramString = bg.nl((String)localMap.get(".msg.fromusername"));
            i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.op_type"), 0);
            localObject2 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_username");
            ((dy)localObject1).wGs.setTag(new dr(paramau, paramString, (String)localObject3));
            if ((i != 1) || (TextUtils.isEmpty((CharSequence)localObject2))) {
              break label3807;
            }
            localObject3 = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_path");
            i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_version"), 0);
            j = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_state"), 0);
            str = bg.nl((String)localMap.get(".msg.appmsg.template_id"));
            ((dy)localObject1).wGs.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(2246133678080L, 16735);
                paramAnonymousView = (dr)paramAnonymousView.getTag();
                w.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) button1 click", new Object[] { localObject2 });
                AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
                localAppBrandStatObject.eAv = (paramAnonymousView.eRz.field_msgSvrId + ":" + paramAnonymousView.userName + ":" + bk.this.wvE.cci() + ":" + str);
                if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(paramAnonymousView.userName))
                {
                  localAppBrandStatObject.scene = 1014;
                  ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(bk.this.wvE.vKB.vKW, localObject2, null, j, i, localObject3, localAppBrandStatObject);
                  bk.y(9, bk.this.hyD, bk.this.wwJ);
                  com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { bk.this.wwJ, paramString, Integer.valueOf(2) });
                  GMTrace.o(2246133678080L, 16735);
                  return;
                }
                localAppBrandStatObject.scene = 1043;
                paramAnonymousView = com.tencent.mm.af.f.iK(paramAnonymousView.userName);
                com.tencent.mm.plugin.appbrand.k.c localc = (com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class);
                ActionBarActivity localActionBarActivity = bk.this.wvE.vKB.vKW;
                String str1 = localObject2;
                int i = j;
                int j = i;
                String str2 = localObject3;
                if (paramAnonymousView == null) {}
                for (paramAnonymousView = null;; paramAnonymousView = paramAnonymousView.field_appId)
                {
                  localc.a(localActionBarActivity, str1, null, i, j, str2, localAppBrandStatObject, paramAnonymousView);
                  break;
                }
              }
            });
            label3352:
            ((dy)localObject1).wGs.setVisibility(0);
            label3361:
            ((dy)localObject1).wGy.setVisibility(8);
            if ((((dy)localObject1).wGr.getVisibility() != 8) || (((dy)localObject1).wGs.getVisibility() != 8)) {
              break label3843;
            }
            ((dy)localObject1).wGo.setVisibility(8);
            ((dy)localObject1).wGn.setVisibility(8);
            ((dy)localObject1).wGq.setVisibility(8);
            if ((((dy)localObject1).wGr.getVisibility() != 0) || (((dy)localObject1).wGs.getVisibility() != 0)) {
              break label4118;
            }
            ((dy)localObject1).wGt.setVisibility(0);
            label3458:
            parama = bg.nl((String)localMap.get(".msg.fromusername"));
            i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type"), 0);
            paramString = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username");
            if ((x.eU(parama)) || (((dy)localObject1).wGr.getVisibility() == 8) || (((dy)localObject1).wGs.getVisibility() != 8) || (i != 1) || (!x.eU(paramString))) {
              break label4149;
            }
            localObject2 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(paramString);
            if (localObject2 != null) {
              break label4131;
            }
            parama = null;
            label3581:
            if (localObject2 != null) {
              break label4140;
            }
          }
        }
        label3716:
        label3760:
        label3807:
        label3830:
        label3843:
        label4118:
        label4131:
        label4140:
        for (parama1 = paramString;; parama1 = ((WxaAttributes)localObject2).field_nickname)
        {
          com.tencent.mm.ao.n.Jd().a(parama, ((dy)localObject1).wGA, this.vOp);
          ((dy)localObject1).wGB.setText(parama1);
          if (localObject2 == null) {
            ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).a(paramString, new b.a()
            {
              public final void b(WxaAttributes paramAnonymousWxaAttributes)
              {
                GMTrace.i(17916456075264L, 133488);
                if (paramAnonymousWxaAttributes == null)
                {
                  GMTrace.o(17916456075264L, 133488);
                  return;
                }
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(16793456345088L, 125121);
                    com.tencent.mm.ao.n.Jd().a(this.iAu, bk.4.this.wwX.wGA, bk.this.vOp);
                    if (TextUtils.isEmpty(this.wwY)) {}
                    for (String str = bk.4.this.wwT;; str = this.wwY)
                    {
                      bk.4.this.wwX.wGB.setText(str);
                      GMTrace.o(16793456345088L, 125121);
                      return;
                    }
                  }
                });
                GMTrace.o(17916456075264L, 133488);
              }
            });
          }
          ((dy)localObject1).wGz.setVisibility(0);
          ((dy)localObject1).wGo.setVisibility(8);
          break;
          ((dy)localObject1).wGw.setVisibility(0);
          g(((dy)localObject1).wGw, parama);
          ((dy)localObject1).wGu.setPadding(0, 0, com.tencent.mm.br.a.fromDPToPix(this.wvE.vKB.vKW, 16), 0);
          break label2824;
          ((dy)localObject1).wGr.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(2239691227136L, 16687);
              if (!bg.nm(localObject2))
              {
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("rawUrl", localObject2);
                com.tencent.mm.bj.d.b(bk.this.wvE.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
                com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { bk.this.wwJ, parama1, Integer.valueOf(1) });
              }
              GMTrace.o(2239691227136L, 16687);
            }
          });
          ((dy)localObject1).wGz.setOnClickListener(null);
          break label3043;
          ((dy)localObject1).wGr.setVisibility(8);
          break label3052;
          ((dy)localObject1).wGx.setVisibility(0);
          g(((dy)localObject1).wGx, parama1);
          ((dy)localObject1).wGv.setPadding(0, 0, com.tencent.mm.br.a.fromDPToPix(this.wvE.vKB.vKW, 16), 0);
          break label3151;
          ((dy)localObject1).wGs.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(2118492618752L, 15784);
              if (!bg.nm(localObject3))
              {
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("rawUrl", localObject3);
                com.tencent.mm.bj.d.b(bk.this.wvE.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
                com.tencent.mm.plugin.report.service.g.ork.i(11608, new Object[] { bk.this.wwJ, paramString, Integer.valueOf(2) });
              }
              GMTrace.o(2118492618752L, 15784);
            }
          });
          break label3352;
          ((dy)localObject1).wGs.setVisibility(8);
          break label3361;
          ((dy)localObject1).wGq.setVisibility(0);
          i = this.wvE.getResources().getDimensionPixelOffset(R.f.aQq);
          if ((((dy)localObject1).wGr.getVisibility() == 0) && (((dy)localObject1).wGs.getVisibility() == 0))
          {
            ((dy)localObject1).wGr.setGravity(17);
            ((dy)localObject1).wGs.setGravity(17);
            ((dy)localObject1).wGr.setPadding(i, 0, i, 0);
            ((dy)localObject1).wGs.setPadding(i, 0, i, 0);
          }
          for (;;)
          {
            ((dy)localObject1).wGo.setVisibility(0);
            ((dy)localObject1).wGn.setVisibility(0);
            break;
            if (((dy)localObject1).wGr.getVisibility() == 0)
            {
              if (bg.nm(parama))
              {
                ((dy)localObject1).wGr.setGravity(19);
                ((dy)localObject1).wGr.setPadding(i, 0, 0, 0);
                ((dy)localObject1).wGy.setVisibility(0);
              }
              else
              {
                ((dy)localObject1).wGr.setGravity(17);
                ((dy)localObject1).wGr.setPadding(i, 0, i, 0);
              }
            }
            else if (bg.nm(parama1))
            {
              ((dy)localObject1).wGs.setGravity(19);
              ((dy)localObject1).wGs.setPadding(this.wvE.getResources().getDimensionPixelOffset(R.f.aQq), 0, 0, 0);
              ((dy)localObject1).wGy.setVisibility(0);
            }
            else
            {
              ((dy)localObject1).wGs.setGravity(17);
              ((dy)localObject1).wGs.setPadding(i, 0, i, 0);
            }
          }
          ((dy)localObject1).wGt.setVisibility(8);
          break label3458;
          parama = ((WxaAttributes)localObject2).field_brandIconURL;
          break label3581;
        }
        label4149:
        ((dy)localObject1).wGz.setVisibility(8);
        break label2314;
        label4162:
        if ((i == -1) && (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(paramString)))
        {
          str = (String)localMap.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.url");
          localObject4 = ((dy)localObject1).wFV;
          paramString = new dr(paramau, false, paramInt, paramString, 6, false, this.wvE.cel(), paramString, parama, (String)localObject3);
          paramString.eYm = ((String)localObject2);
          paramString.wFB = str;
          ((View)localObject4).setTag(paramString);
          ((dy)localObject1).wFV.setOnClickListener(this.wwH);
          break label2510;
        }
        localObject4 = ((dy)localObject1).wFV;
        paramString = new dr(paramau, false, paramInt, str, 6, false, this.wvE.cel(), paramString, parama, (String)localObject3);
        paramString.eYm = ((String)localObject2);
        ((View)localObject4).setTag(paramString);
        ((dy)localObject1).wFV.setOnClickListener(this.wvE.wvd.wyW);
        break label2510;
        label4346:
        if (bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.show_complaint_button"), 0) == 1)
        {
          paramInt = 1;
          label4369:
          if (paramInt != 0) {
            break label4428;
          }
          w.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew showMoreV false");
        }
        label4428:
        do
        {
          ((dy)localObject1).wGb.setTag(null);
          ((dy)localObject1).wGc.setTag(null);
          ((dy)localObject1).wGb.setVisibility(8);
          ((dy)localObject1).wGc.setVisibility(8);
          break;
          paramInt = 0;
          break label4369;
          if (((dy)localObject1).wFX.getVisibility() == 0)
          {
            ((dy)localObject1).wGb.setTag(paramau);
            ((dy)localObject1).wGb.setOnClickListener(this.wwF);
            ((dy)localObject1).wGb.setVisibility(0);
            ((dy)localObject1).wGc.setVisibility(8);
            break;
          }
        } while (((dy)localObject1).wGg.getVisibility() != 0);
        ((dy)localObject1).wGc.setTag(paramau);
        ((dy)localObject1).wGc.setOnClickListener(this.wwF);
        ((dy)localObject1).wGc.setVisibility(0);
        ((dy)localObject1).wGb.setVisibility(8);
      }
      localdj.wBW.wFV.setVisibility(8);
      parama1 = bg.nl((String)localMap.get(".msg.fromusername"));
      i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.type"), 0);
      w.i("MicroMsg.ChattingItemDyeingTemplate", "fillingOld extType=%d", new Object[] { Integer.valueOf(i) });
      if (i == 1)
      {
        parama = bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url"));
        paramString = bg.nl((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_ext.app.display_name"));
        a(localdj, com.tencent.mm.pluginsdk.ui.d.h.b(this.wvE.vKB.vKW, paramString, localdj.oGJ.getTextSize()));
        localdj.hqG.setTag(null);
        localdj.hqG.setOnClickListener(null);
        com.tencent.mm.ao.n.Jd().a(parama, localdj.hqG, this.vOp);
        w.d("MicroMsg.ChattingItemDyeingTemplate", "dyeing template talker(%s).", new Object[] { paramau.field_talker });
        if ((!"notifymessage".equals(paramau.field_talker)) && (i != 1)) {
          break label5354;
        }
        localdj.wBV.wBX.setVisibility(0);
        localdj.wBV.ikm.setTextSize(0, com.tencent.mm.br.a.V(localdj.wBV.ikm.getContext(), R.f.aQF));
        label4794:
        localdj.wBV.odd.setVisibility(0);
        paramString = di.al(localMap);
        if (!bg.nm(paramString.url)) {
          break label5400;
        }
        localdj.wBV.wCb.setVisibility(8);
        localdj.wBV.wtu.setVisibility(8);
        label4850:
        localdj.wBV.ikm.setText(paramString.title);
        localdj.wBV.lWz.setText(com.tencent.mm.pluginsdk.i.n.ac(this.wvE.getString(R.l.dwA), paramString.time));
        bl.a(localdj.wBV.wCa, localMap);
        parama = null;
        if (!bg.nm(parama1))
        {
          at.AR();
          parama = com.tencent.mm.y.c.yK().TE(parama1).vj();
        }
        i = bg.getInt((String)localMap.get(".msg.appmsg.mmreader.category.item.template_op_type"), 0);
        localObject1 = (String)localMap.get(".msg.appmsg.mmreader.category.item.weapp_username");
        if ((i != 1) || (TextUtils.isEmpty((CharSequence)localObject1))) {
          break label5427;
        }
        parama1 = new dr(paramau, parama1, paramString.url);
        parama1.position = paramInt;
        localdj.wBV.odd.setTag(parama1);
        localdj.wBV.odd.setOnClickListener(this.kHK);
        label5031:
        localdj.wBV.odd.setOnLongClickListener(this.wvE.wvd.wyY);
        if (com.tencent.mm.k.g.uu().uh())
        {
          localdj.wss.setVisibility(0);
          c(this.wvE, localdj.wss, new ej(paramString.gjw, paramau, parama));
        }
        parama = localdj.wBV;
        if (bg.getInt((String)localMap.get(".msg.appmsg.mmreader.template_header.show_complaint_button"), 0) != 1) {
          break label5510;
        }
        paramInt = 1;
        label5126:
        if (paramInt != 0) {
          break label5515;
        }
        w.i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew showMoreV false");
        parama.wBY.setTag(null);
        parama.wBZ.setTag(null);
        parama.wBY.setVisibility(8);
        parama.wBZ.setVisibility(8);
      }
      for (;;)
      {
        localdj.wBV.odd.setVisibility(0);
        GMTrace.o(2488530894848L, 18541);
        return;
        a(localdj, this.wvE, paramau, parama1);
        a(localdj.hqG, this.wvE, parama1, paramau, null);
        if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(parama1))
        {
          localdj.wBV.wBX.setTag(new dr(paramau, parama1, 1));
          localdj.wBV.wBX.setOnClickListener(this.wwG);
          break;
        }
        paramString = localdj.wBV.wBX;
        if (this.wvE.wvi) {}
        for (parama = this.wvE.cci();; parama = null)
        {
          paramString.setTag(new dr(parama1, 1, parama));
          localdj.wBV.wBX.setOnClickListener(this.wvE.wvd.wyW);
          break;
        }
        label5354:
        localdj.wBV.wBX.setVisibility(8);
        localdj.wBV.ikm.setTextSize(0, com.tencent.mm.br.a.V(localdj.wBV.ikm.getContext(), R.f.aPt));
        break label4794;
        label5400:
        localdj.wBV.wCb.setVisibility(0);
        localdj.wBV.wtu.setVisibility(0);
        break label4850;
        label5427:
        localObject1 = localdj.wBV.odd;
        parama1 = new dr(paramau, false, paramInt, paramString.url, 6, false, this.wvE.cel(), parama1, parama, paramString.title);
        parama1.eYm = paramString.eYm;
        ((View)localObject1).setTag(parama1);
        localdj.wBV.odd.setOnClickListener(this.wvE.wvd.wyW);
        break label5031;
        label5510:
        paramInt = 0;
        break label5126;
        label5515:
        if (parama.wBX.getVisibility() == 0)
        {
          parama.wBY.setTag(paramau);
          parama.wBY.setOnClickListener(this.wwF);
          parama.wBY.setVisibility(0);
          parama.wBZ.setVisibility(8);
        }
        else
        {
          parama.wBZ.setTag(paramau);
          parama.wBZ.setOnClickListener(this.wwF);
          parama.wBZ.setVisibility(0);
          parama.wBY.setVisibility(8);
        }
      }
      label5605:
      i = 0;
    }
  }
  
  protected final void a(ah.a parama, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2489067765760L, 18545);
    if ((paramString == null) || (parama.oGJ == null))
    {
      GMTrace.o(2489067765760L, 18545);
      return;
    }
    a(parama, com.tencent.mm.pluginsdk.ui.d.h.b(parama1.vKB.vKW, parama1.fs(paramString), parama.oGJ.getTextSize()));
    GMTrace.o(2489067765760L, 18545);
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2488665112576L, 18542);
    paramau = (dr)paramView.getTag();
    if (paramau == null)
    {
      GMTrace.o(2488665112576L, 18542);
      return false;
    }
    int i = paramau.position;
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
    }
    GMTrace.o(2488665112576L, 18542);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2488933548032L, 18544);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      GMTrace.o(2488933548032L, 18544);
      return false;
      paramMenuItem = bh.q(paramau.field_content, "msg");
      if ((paramMenuItem == null) || (paramMenuItem.size() == 0))
      {
        GMTrace.o(2488933548032L, 18544);
        return false;
      }
      paramMenuItem = bg.nl((String)paramMenuItem.get(".msg.fromusername"));
      if (((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).eU(paramMenuItem)) {
        y(7, this.hyD, this.wwJ);
      }
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2488799330304L, 18543);
    GMTrace.o(2488799330304L, 18543);
    return false;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2488396677120L, 18540);
    GMTrace.o(2488396677120L, 18540);
    return false;
  }
  
  private final class a
    implements View.OnClickListener
  {
    public a()
    {
      GMTrace.i(20397068124160L, 151970);
      GMTrace.o(20397068124160L, 151970);
    }
    
    public final void onClick(final View paramView)
    {
      GMTrace.i(20397202341888L, 151971);
      if (!(paramView.getTag() instanceof au))
      {
        w.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, tag not msg.");
        GMTrace.o(20397202341888L, 151971);
        return;
      }
      final au localau = (au)paramView.getTag();
      if (localau == null)
      {
        w.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, msg null.");
        GMTrace.o(20397202341888L, 151971);
        return;
      }
      final Object localObject = bh.q(localau.field_content, "msg");
      if ((localObject == null) || (((Map)localObject).size() == 0))
      {
        w.w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, values null.");
        GMTrace.o(20397202341888L, 151971);
        return;
      }
      localObject = bg.nl((String)((Map)localObject).get(".msg.fromusername"));
      com.tencent.mm.ui.widget.f localf = new com.tencent.mm.ui.widget.f(paramView.getContext(), com.tencent.mm.ui.widget.f.xpQ, false);
      localf.qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(20396531253248L, 151966);
          paramAnonymousn.add(0, 1, 0, paramView.getResources().getString(R.l.dMV));
          GMTrace.o(20396531253248L, 151966);
        }
      };
      localf.qil = new p.d()
      {
        public final void c(final MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(20399752478720L, 151990);
          w.d("MicroMsg.ChattingItemDyeingTemplate", "on menu(id : %d, index : %d) item selected.", new Object[] { Integer.valueOf(paramAnonymousMenuItem.getItemId()), Integer.valueOf(paramAnonymousInt) });
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(20399752478720L, 151990);
            return;
            at.wS().a(1198, new e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
              {
                GMTrace.i(20395457511424L, 151958);
                at.wS().b(1198, this);
                w.d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String, Boolean.valueOf(false) });
                if (bk.this.vOg != null)
                {
                  bk.this.vOg.dismiss();
                  bk.this.vOg = null;
                }
                if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
                {
                  com.tencent.mm.ui.base.u.makeText(bk.a.2.this.iBC.getContext(), R.l.dMW, 0).show();
                  GMTrace.o(20395457511424L, 151958);
                  return;
                }
                if (bk.a.2.this.gmh != bk.a.2.this.iBC.getTag())
                {
                  w.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", new Object[] { Long.valueOf(bk.a.2.this.gmh.field_msgId) });
                  GMTrace.o(20395457511424L, 151958);
                  return;
                }
                paramAnonymous2String = ((o)paramAnonymous2k).CP();
                if (paramAnonymous2String == null)
                {
                  com.tencent.mm.ui.base.u.makeText(bk.a.2.this.iBC.getContext(), R.l.dMW, 0).show();
                  GMTrace.o(20395457511424L, 151958);
                  return;
                }
                paramAnonymous2k = paramAnonymous2String.vdE;
                w.d("MicroMsg.ChattingItemDyeingTemplate", "more view clicked, menu item COMPLAIN_APP_BRAND selected, sync attr username %s", new Object[] { bk.a.2.this.rTA });
                try
                {
                  paramAnonymous2String = String.format("https://mp.weixin.qq.com/mp/infringement?from=8&username=%s&template_id=%s&template_msg_id=%s1#wechat_redirect", new Object[] { bk.a.2.this.rTA, URLEncoder.encode(bk.this.wwJ, "utf-8"), URLEncoder.encode(paramAnonymous2k, "utf-8") });
                  w.i("MicroMsg.ChattingItemDyeingTemplate", "go to complain page(%s, %s), url:%s", new Object[] { paramAnonymous2k, bk.this.wwJ, paramAnonymous2String });
                  paramAnonymous2k = new Intent();
                  paramAnonymous2k.putExtra("rawUrl", paramAnonymous2String);
                  com.tencent.mm.bj.d.b(bk.this.wvE.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymous2k);
                  GMTrace.o(20395457511424L, 151958);
                  return;
                }
                catch (UnsupportedEncodingException paramAnonymous2String)
                {
                  w.e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
                  com.tencent.mm.ui.base.u.makeText(bk.a.2.this.iBC.getContext(), R.l.dNa, 0).show();
                  GMTrace.o(20395457511424L, 151958);
                }
              }
            });
            paramAnonymousMenuItem = new o(localau.field_content);
            bk localbk = bk.this;
            Context localContext = paramView.getContext();
            paramView.getResources().getString(R.l.cUG);
            localbk.vOg = com.tencent.mm.ui.base.h.a(localContext, paramView.getResources().getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(20394652205056L, 151952);
                at.wS().c(paramAnonymousMenuItem);
                GMTrace.o(20394652205056L, 151952);
              }
            });
            at.wS().a(paramAnonymousMenuItem, 0);
          }
        }
      };
      localf.bFk();
      GMTrace.o(20397202341888L, 151971);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */