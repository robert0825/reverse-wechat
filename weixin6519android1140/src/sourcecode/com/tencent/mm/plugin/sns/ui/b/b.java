package com.tencent.mm.plugin.sns.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bx.a.e;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.mz;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ac;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.model.au;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.storage.a.b;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI;
import com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.ag;
import com.tencent.mm.plugin.sns.ui.ak;
import com.tencent.mm.plugin.sns.ui.av.a;
import com.tencent.mm.plugin.sns.ui.ax;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.aul;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfd;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfp;
import com.tencent.mm.protocal.c.bfw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.tools.MaskImageButton;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class b
{
  public Activity activity;
  private ClipboardManager liU;
  public ad pPx;
  public View.OnClickListener pTd;
  public View.OnClickListener qmA;
  public View.OnClickListener qmB;
  public View.OnClickListener qmC;
  public View.OnClickListener qmD;
  public View.OnClickListener qmE;
  public View.OnClickListener qmF;
  public View.OnClickListener qmG;
  public View.OnClickListener qmH;
  public c qmI;
  public c qmJ;
  public c qmK;
  public c qmL;
  public c qmM;
  public c qmN;
  public c qmO;
  public View.OnTouchListener qmP;
  public View.OnClickListener qmQ;
  public View.OnClickListener qmR;
  public View.OnClickListener qmS;
  public View.OnClickListener qmT;
  public View.OnClickListener qmU;
  public View.OnClickListener qmV;
  public View.OnClickListener qmW;
  public AdapterView.OnItemClickListener qmX;
  public View.OnClickListener qmY;
  public View.OnClickListener qmZ;
  public b.e qmm;
  public a qmv;
  public View.OnClickListener qmw;
  public View.OnLongClickListener qmx;
  public c qmy;
  public View.OnClickListener qmz;
  public View.OnClickListener qna;
  public av.a qnb;
  public int qnc;
  public View.OnClickListener qnd;
  public int scene;
  
  public b(int paramInt, Activity paramActivity, ad paramad)
  {
    GMTrace.i(8652748488704L, 64468);
    this.scene = 0;
    this.qmY = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        boolean bool = false;
        GMTrace.i(8656909238272L, 64499);
        if (paramAnonymousView.getTag() == null)
        {
          GMTrace.o(8656909238272L, 64499);
          return;
        }
        com.tencent.mm.plugin.sns.storage.m localm = b.cF(paramAnonymousView);
        if ((localm == null) || (!localm.uX(32)))
        {
          GMTrace.o(8656909238272L, 64499);
          return;
        }
        int j;
        int i;
        Object localObject;
        label130:
        int k;
        if (localm.bmj().blz().bkg())
        {
          j = u.dP(localm.bmj().blz().bkc(), localm.bmi());
          if (j > 0)
          {
            i = 1;
            localObject = localm.bmj().blz().bkc();
            String str1 = localm.bmi();
            com.tencent.mm.kernel.h.xw();
            String str2 = com.tencent.mm.kernel.a.wx();
            if (i == 0) {
              break label225;
            }
            if (i == 0) {
              break label230;
            }
            k = 0;
            label137:
            u.e((String)localObject, str1, str2, j, k);
            if (i != 0) {}
          }
        }
        for (bool = true;; bool = false)
        {
          localObject = localm.blD();
          if ((((biz)localObject).uUc.ueV == 15) && (((biz)localObject).uUj != 1))
          {
            b.this.b(paramAnonymousView, localm, 1001, localm.bmj().blz().bkh(), bool);
            GMTrace.o(8656909238272L, 64499);
            return;
            i = 0;
            break;
            label225:
            j = 1;
            break label130;
            label230:
            k = 1;
            break label137;
          }
          if (((((biz)localObject).uUc.ueV == 1) && (((biz)localObject).uUc.ueW.size() == 1)) || (((biz)localObject).uUc.ueV == 7)) {
            b.this.a(paramAnonymousView, localm, 1001, localm.bmj().blz().bkh(), bool);
          }
          GMTrace.o(8656909238272L, 64499);
          return;
        }
      }
    };
    this.qmZ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        boolean bool = false;
        GMTrace.i(8650601005056L, 64452);
        if (paramAnonymousView.getTag() == null)
        {
          GMTrace.o(8650601005056L, 64452);
          return;
        }
        com.tencent.mm.plugin.sns.storage.m localm = b.cF(paramAnonymousView);
        if ((localm == null) || (!localm.uX(32)))
        {
          GMTrace.o(8650601005056L, 64452);
          return;
        }
        int j;
        int i;
        Object localObject;
        label130:
        int k;
        if (localm.bmj().blz().bkg())
        {
          j = u.dP(localm.bmj().blz().bkc(), localm.bmi());
          if (j > 0)
          {
            i = 1;
            localObject = localm.bmj().blz().bkc();
            String str1 = localm.bmi();
            com.tencent.mm.kernel.h.xw();
            String str2 = com.tencent.mm.kernel.a.wx();
            if (i == 0) {
              break label225;
            }
            if (i == 0) {
              break label230;
            }
            k = 0;
            label137:
            u.e((String)localObject, str1, str2, j, k);
            if (i != 0) {}
          }
        }
        for (bool = true;; bool = false)
        {
          localObject = localm.blD();
          if ((((biz)localObject).uUc.ueV == 15) && (((biz)localObject).uUj != 1))
          {
            b.this.b(paramAnonymousView, localm, 1002, localm.bmj().blz().bki(), bool);
            GMTrace.o(8650601005056L, 64452);
            return;
            i = 0;
            break;
            label225:
            j = 2;
            break label130;
            label230:
            k = 1;
            break label137;
          }
          if (((((biz)localObject).uUc.ueV == 1) && (((biz)localObject).uUc.ueW.size() == 1)) || (((biz)localObject).uUc.ueV == 7)) {
            b.this.a(paramAnonymousView, localm, 1002, localm.bmj().blz().bki(), bool);
          }
          GMTrace.o(8650601005056L, 64452);
          return;
        }
      }
    };
    this.qnd = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20054141829120L, 149415);
        Object localObject1 = paramAnonymousView.getTag();
        Object localObject2;
        Object localObject3;
        if ((localObject1 instanceof a.c))
        {
          localObject2 = (a.c)paramAnonymousView.getTag();
          localObject1 = com.tencent.mm.plugin.sns.storage.h.Ir(((a.c)localObject2).eUg);
          localObject3 = ((a.c)localObject2).qli;
          localObject2 = null;
        }
        for (;;)
        {
          Object localObject4;
          Object localObject5;
          int i;
          label183:
          label332:
          label548:
          label553:
          boolean bool;
          if (localObject1 != null)
          {
            localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj();
            ((com.tencent.mm.plugin.sns.storage.e)localObject4).getSource();
            if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)))
            {
              localObject5 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blB();
              if ((((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCp) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml)))
              {
                localObject5 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject1);
                if (!bg.nm((String)localObject5)) {
                  ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_adxml = ((String)localObject5);
                }
                localObject4 = new int[2];
                paramAnonymousView.getLocationInWindow((int[])localObject4);
                i = paramAnonymousView.getWidth();
                int j = paramAnonymousView.getHeight();
                if (localObject3 != null)
                {
                  ((TagImageView)localObject3).getLocationInWindow((int[])localObject4);
                  i = ((TagImageView)localObject3).getWidth();
                  j = ((TagImageView)localObject3).getHeight();
                  paramAnonymousView = new Intent();
                  paramAnonymousView.putExtra("img_gallery_left", localObject4[0]);
                  paramAnonymousView.putExtra("img_gallery_top", localObject4[1]);
                  paramAnonymousView.putExtra("img_gallery_width", i);
                  paramAnonymousView.putExtra("img_gallery_height", j);
                  paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
                  paramAnonymousView.putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi());
                  localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
                  if (localObject2 != null)
                  {
                    localObject2 = ((biz)localObject2).uUc.ueW;
                    if (((List)localObject2).size() > 0) {
                      paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject2).get(0)).uCO);
                    }
                  }
                  paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                  if (b.this.scene != 0) {
                    break label548;
                  }
                  i = 1;
                  paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
                  paramAnonymousView.putExtra("sns_landing_pages_xml", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml);
                  paramAnonymousView.putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bml());
                  paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
                  paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                  paramAnonymousView.putExtra("sns_landing_is_native_sight_ad", true);
                  b.this.activity.startActivity(paramAnonymousView);
                  b.this.activity.overridePendingTransition(0, 0);
                  paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
                  if (b.this.scene != 0) {
                    break label553;
                  }
                }
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 23, i, "", 3, 21, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
                  GMTrace.o(20054141829120L, 149415);
                  return;
                  if (!(localObject1 instanceof com.tencent.mm.plugin.sns.storage.m)) {
                    break label1301;
                  }
                  localObject1 = (com.tencent.mm.plugin.sns.storage.m)localObject1;
                  localObject2 = (MMImageView)paramAnonymousView.getTag(i.f.pbk);
                  localObject3 = null;
                  break;
                  if (localObject2 == null) {
                    break label183;
                  }
                  ((MMImageView)localObject2).getLocationInWindow((int[])localObject4);
                  i = ((MMImageView)localObject2).getWidth();
                  j = ((MMImageView)localObject2).getHeight();
                  break label183;
                  i = 2;
                  break label332;
                }
              }
              if ((localObject5 != null) && (((com.tencent.mm.plugin.sns.storage.a)localObject5).pCc == 1))
              {
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("key_card_id", ((com.tencent.mm.plugin.sns.storage.a)localObject5).pCe);
                paramAnonymousView.putExtra("key_card_ext", ((com.tencent.mm.plugin.sns.storage.a)localObject5).pCf);
                paramAnonymousView.putExtra("key_from_scene", 21);
                paramAnonymousView.putExtra("key_stastic_scene", 15);
                com.tencent.mm.bj.d.b(b.this.activity, "card", ".ui.CardDetailUI", paramAnonymousView);
                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
                if (b.this.scene == 0) {}
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 23, i, "", 3, 11, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
                  GMTrace.o(20054141829120L, 149415);
                  return;
                }
              }
              if (b.this.a((com.tencent.mm.plugin.sns.storage.a)localObject5, (com.tencent.mm.plugin.sns.storage.m)localObject1))
              {
                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
                if (b.this.scene == 0) {}
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 23, i, "", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmm(), 31, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
                  GMTrace.o(20054141829120L, 149415);
                  return;
                }
              }
            }
            paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
            if (b.this.scene != 0) {
              break label1282;
            }
            i = 1;
            paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 23, i, "", 3, 0, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
            localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmg();
            paramAnonymousView = (View)localObject2;
            if (bg.nm((String)localObject2)) {
              paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmf();
            }
            w.i("MicroMsg.TimelineClickListener", "adlink url " + paramAnonymousView + " " + ((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCH);
            localObject2 = new Intent();
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCH != 0) {
              break label1287;
            }
            bool = true;
            label967:
            if (!com.tencent.mm.platformtools.r.hks) {
              break label1298;
            }
            bool = false;
          }
          label1282:
          label1287:
          label1298:
          for (;;)
          {
            localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
            if (b.this.scene == 0) {}
            for (i = 1;; i = 2)
            {
              localObject3 = new SnsAdClick((String)localObject3, i, ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi(), 3, (byte)0);
              if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)))
              {
                localObject5 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blB();
                if (localObject5 != null) {
                  ((Intent)localObject2).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject5).hTy);
                }
              }
              ((Intent)localObject2).putExtra("KRightBtn", bool);
              localObject5 = new Bundle();
              ((Bundle)localObject5).putParcelable("KSnsAdTag", (Parcelable)localObject3);
              ((Bundle)localObject5).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.sns.storage.e)localObject4).blD().pTh);
              ((Intent)localObject2).putExtra("jsapiargs", (Bundle)localObject5);
              ((Intent)localObject2).putExtra("rawUrl", paramAnonymousView);
              ((Intent)localObject2).putExtra("useJs", true);
              ((Intent)localObject2).putExtra("srcUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject2).putExtra("stastic_scene", 15);
              ((Intent)localObject2).putExtra("KPublisherId", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject2).putExtra("pre_username", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject2).putExtra("prePublishId", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject2).putExtra("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject2, b.this.activity);
              GMTrace.o(20054141829120L, 149415);
              return;
              i = 2;
              break;
              bool = false;
              break label967;
            }
          }
          label1301:
          localObject1 = null;
          localObject3 = null;
          localObject2 = null;
        }
      }
    };
    this.scene = paramInt;
    this.activity = paramActivity;
    this.pPx = paramad;
    this.qnc = bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsPOICommentFeedNewUrlSwitch"), 0);
    w.i("MicroMsg.TimelineClickListener", "init POIComment_FeedNewUrl_Switch:%d", new Object[] { Integer.valueOf(this.qnc) });
    this.liU = ((ClipboardManager)this.activity.getSystemService("clipboard"));
    this.qmv = new a(this.activity, this.scene, this.pPx);
    this.qmF = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8650064134144L, 64448);
        if ((paramAnonymousView.getTag() == null) || (!(paramAnonymousView.getTag() instanceof Long)))
        {
          GMTrace.o(8650064134144L, 64448);
          return;
        }
        long l = ((Long)paramAnonymousView.getTag()).longValue();
        com.tencent.mm.plugin.sns.storage.e locale = com.tencent.mm.plugin.sns.model.ae.bjg().dN(l);
        com.tencent.mm.plugin.sns.storage.m localm = locale.blF();
        com.tencent.mm.plugin.sns.a.b.j.a(j.b.pok, j.a.poi, locale.blF());
        locale.getSource();
        paramAnonymousView = localm.bmg();
        if (bg.nm(paramAnonymousView)) {
          paramAnonymousView = localm.bmf();
        }
        for (;;)
        {
          Object localObject1;
          int i;
          Object localObject2;
          if (localm.uX(32))
          {
            localObject1 = localm.blB();
            i = -1;
            localObject2 = com.tencent.mm.y.c.c.Cu().Te("Sns_CanvasAd_DetailLink_JumpWay");
            if (((com.tencent.mm.storage.a)localObject2).isValid()) {
              i = bg.getInt(((com.tencent.mm.storage.a)localObject2).field_value, -1);
            }
            if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.a)localObject1).pCc == 1))
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("key_card_id", ((com.tencent.mm.plugin.sns.storage.a)localObject1).pCe);
              paramAnonymousView.putExtra("key_card_ext", ((com.tencent.mm.plugin.sns.storage.a)localObject1).pCf);
              paramAnonymousView.putExtra("key_from_scene", 21);
              paramAnonymousView.putExtra("key_stastic_scene", 15);
              com.tencent.mm.bj.d.b(b.this.activity, "card", ".ui.CardDetailUI", paramAnonymousView);
              paramAnonymousView = localm.bmh();
              if (b.this.scene == 0) {}
              for (i = 1;; i = 2)
              {
                paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 3, i, "", localm.bmm(), 11, localm.blD().pTh, localm.blE());
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
                GMTrace.o(8650064134144L, 64448);
                return;
              }
            }
            if ((localObject1 != null) && (i == 1))
            {
              if ((localm.blz().pCp) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(localm.bmj().field_adxml)))
              {
                paramAnonymousView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(localm);
                if (!bg.nm(paramAnonymousView)) {
                  locale.field_adxml = paramAnonymousView;
                }
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", localm.blE());
                paramAnonymousView.putExtra("sns_landing_pages_ux_info", localm.bmi());
                paramAnonymousView.putExtra("sns_landing_pages_aid", localm.bmd());
                paramAnonymousView.putExtra("sns_landing_pages_traceid", localm.bme());
                localObject1 = localm.blD();
                if (localObject1 != null)
                {
                  localObject1 = ((biz)localObject1).uUc.ueW;
                  if (((List)localObject1).size() > 0) {
                    paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject1).get(0)).uCO);
                  }
                }
                paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                if (b.this.scene == 0)
                {
                  i = 9;
                  paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
                  paramAnonymousView.putExtra("sns_landing_pages_xml", localm.bmj().field_adxml);
                  paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
                  paramAnonymousView.putExtra("sns_landing_pages_rec_src", localm.bml());
                  paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
                  b.this.activity.startActivity(paramAnonymousView);
                  b.this.activity.overridePendingTransition(0, 0);
                  paramAnonymousView = localm.bmh();
                  if (b.this.scene != 0) {
                    break label666;
                  }
                }
                label666:
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 3, i, "", localm.bmm(), 21, localm.blD().pTh, localm.blE());
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
                  GMTrace.o(8650064134144L, 64448);
                  return;
                  i = 10;
                  break;
                }
              }
            }
            else if ((localObject1 != null) && (i == 0))
            {
              if ((!localm.blz().pCp) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(localm.bmj().field_adxml))) {
                break label1757;
              }
              localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(localm);
              if (!bg.nm((String)localObject1)) {
                locale.field_adxml = ((String)localObject1);
              }
              localObject1 = com.tencent.mm.c.f.q(localm.bmj().field_adxml, "adxml");
              if (localObject1 != null)
              {
                localObject1 = bg.aq((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareWebUrl"), "");
                if (!bg.nm((String)localObject1)) {
                  paramAnonymousView = (View)localObject1;
                }
              }
            }
          }
          label798:
          label912:
          label1641:
          label1746:
          label1752:
          label1757:
          for (;;)
          {
            localObject1 = localm.bmh();
            boolean bool;
            if (b.this.scene == 0)
            {
              i = 1;
              localObject1 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject1, 3, i, "", localm.bmm(), 0, localm.blD().pTh, localm.blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
              w.i("MicroMsg.TimelineClickListener", "adlink url " + paramAnonymousView + " " + localm.blz().pCH);
              localObject1 = new Intent();
              if (localm.blz().pCH != 0) {
                break label1746;
              }
              bool = true;
              if (com.tencent.mm.platformtools.r.hks) {
                bool = false;
              }
              localObject2 = localm.bmh();
              if (b.this.scene != 0) {
                break label1752;
              }
            }
            for (i = 1;; i = 2)
            {
              localObject2 = new SnsAdClick((String)localObject2, i, localm.field_snsId, localm.bmi(), localm.bmm(), (byte)0);
              if (localm.uX(32))
              {
                localObject3 = localm.blB();
                if (localObject3 != null) {
                  ((Intent)localObject1).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject3).hTy);
                }
              }
              ((Intent)localObject1).putExtra("KRightBtn", bool);
              Object localObject3 = new Bundle();
              ((Bundle)localObject3).putParcelable("KSnsAdTag", (Parcelable)localObject2);
              ((Bundle)localObject3).putString("key_snsad_statextstr", locale.blD().pTh);
              ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject3);
              ((Intent)localObject1).putExtra("rawUrl", paramAnonymousView);
              ((Intent)localObject1).putExtra("useJs", true);
              ((Intent)localObject1).putExtra("srcUsername", localm.field_userName);
              ((Intent)localObject1).putExtra("sns_local_id", localm.blY());
              ((Intent)localObject1).putExtra("stastic_scene", 15);
              ((Intent)localObject1).putExtra("KPublisherId", "sns_" + i.dt(localm.field_snsId));
              ((Intent)localObject1).putExtra("pre_username", localm.field_userName);
              ((Intent)localObject1).putExtra("prePublishId", "sns_" + i.dt(localm.field_snsId));
              ((Intent)localObject1).putExtra("preUsername", localm.field_userName);
              com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject1, b.this.activity);
              GMTrace.o(8650064134144L, 64448);
              return;
              w.e("MicroMsg.TimelineClickListener", "parse landingpagexml is error,landingpagexml is " + localm.bmj().field_adxml);
              break;
              if ((localObject1 != null) && (i == -1) && (((com.tencent.mm.plugin.sns.storage.a)localObject1).pCc == 3))
              {
                if ((!localm.blz().pCp) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(localm.bmj().field_adxml))) {
                  break label1757;
                }
                paramAnonymousView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(localm);
                if (!bg.nm(paramAnonymousView)) {
                  locale.field_adxml = paramAnonymousView;
                }
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", localm.blE());
                paramAnonymousView.putExtra("sns_landing_pages_ux_info", localm.bmi());
                paramAnonymousView.putExtra("sns_landing_pages_aid", localm.bmd());
                paramAnonymousView.putExtra("sns_landing_pages_traceid", localm.bme());
                localObject1 = localm.blD();
                if (localObject1 != null)
                {
                  localObject1 = ((biz)localObject1).uUc.ueW;
                  if (((List)localObject1).size() > 0) {
                    paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject1).get(0)).uCO);
                  }
                }
                paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                if (b.this.scene == 0)
                {
                  i = 9;
                  paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
                  paramAnonymousView.putExtra("sns_landing_pages_xml", localm.bmj().field_adxml);
                  paramAnonymousView.putExtra("sns_landing_pages_rec_src", localm.bml());
                  paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
                  paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
                  b.this.activity.startActivity(paramAnonymousView);
                  b.this.activity.overridePendingTransition(0, 0);
                  paramAnonymousView = localm.bmh();
                  if (b.this.scene != 0) {
                    break label1641;
                  }
                }
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 3, i, "", localm.bmm(), 21, localm.blD().pTh, localm.blE());
                  com.tencent.mm.kernel.h.xz();
                  com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
                  GMTrace.o(8650064134144L, 64448);
                  return;
                  i = 10;
                  break;
                }
              }
              if (!b.this.a((com.tencent.mm.plugin.sns.storage.a)localObject1, localm)) {
                break label1757;
              }
              paramAnonymousView = localm.bmh();
              if (b.this.scene == 0) {}
              for (i = 1;; i = 2)
              {
                paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 3, i, "", localm.bmm(), 31, localm.blD().pTh, localm.blE());
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
                GMTrace.o(8650064134144L, 64448);
                return;
              }
              i = 2;
              break label798;
              bool = false;
              break label912;
            }
          }
        }
      }
    };
    this.qmR = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8657177673728L, 64501);
        if (!(paramAnonymousView.getTag() instanceof String))
        {
          GMTrace.o(8657177673728L, 64501);
          return;
        }
        paramAnonymousView = (String)paramAnonymousView.getTag();
        com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousView);
        if (localm == null)
        {
          GMTrace.o(8657177673728L, 64501);
          return;
        }
        if (localm.uX(32))
        {
          w.i("MicroMsg.TimelineClickListener", "click the ad poi button");
          paramAnonymousView = localm.bmh();
          if (b.this.scene == 0) {}
          for (int i = 1;; i = 2)
          {
            paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 19, i, "", localm.bmm(), localm.blE());
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
            localObject1 = localm.blB();
            if (localObject1 != null) {
              break;
            }
            w.e("MicroMsg.TimelineClickListener", "the adInfo is null");
            GMTrace.o(8657177673728L, 64501);
            return;
          }
          if (bg.nm(((com.tencent.mm.plugin.sns.storage.a)localObject1).pCk))
          {
            w.e("MicroMsg.TimelineClickListener", "the adActionPOILink is null");
            GMTrace.o(8657177673728L, 64501);
            return;
          }
          label341:
          long l;
          if (b.this.scene == 0)
          {
            paramAnonymousView = com.tencent.mm.modelsns.b.ha(724);
            paramAnonymousView.lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32)).lu(localm.bmi()).lu("").lu("").lu("").lu("").lu(((com.tencent.mm.plugin.sns.storage.a)localObject1).pCj).lu("").lu("");
            paramAnonymousView.LR();
            w.i("MicroMsg.TimelineClickListener", "open webview url : " + ((com.tencent.mm.plugin.sns.storage.a)localObject1).pCk);
            paramAnonymousView = new Intent();
            localObject2 = localm.bmh();
            if (b.this.scene != 0) {
              break label588;
            }
            i = 1;
            l = localm.field_snsId;
            localObject3 = localm.bmi();
            if (localm.field_type != 1) {
              break label593;
            }
          }
          label588:
          label593:
          for (int j = 1;; j = 2)
          {
            localObject2 = new SnsAdClick((String)localObject2, i, l, (String)localObject3, j);
            if ((localm != null) && (localm.uX(32)))
            {
              localObject3 = localm.blB();
              if (localObject3 != null) {
                paramAnonymousView.putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject3).hTy);
              }
            }
            localObject3 = new Bundle();
            ((Bundle)localObject3).putParcelable("KSnsAdTag", (Parcelable)localObject2);
            paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject3);
            paramAnonymousView.putExtra("useJs", true);
            paramAnonymousView.putExtra("KPublisherId", "sns_" + i.dt(localm.field_snsId));
            paramAnonymousView.putExtra("pre_username", localm.field_userName);
            paramAnonymousView.putExtra("prePublishId", "sns_" + i.dt(localm.field_snsId));
            paramAnonymousView.putExtra("preUsername", localm.field_userName);
            paramAnonymousView.putExtra("rawUrl", ((com.tencent.mm.plugin.sns.storage.a)localObject1).pCk);
            com.tencent.mm.plugin.sns.c.a.hnH.j(paramAnonymousView, b.this.activity);
            GMTrace.o(8657177673728L, 64501);
            return;
            paramAnonymousView = com.tencent.mm.modelsns.b.hb(724);
            break;
            i = 2;
            break label341;
          }
        }
        Object localObject2 = localm.blD();
        Object localObject3 = ((biz)localObject2).uUa;
        Object localObject1 = new Intent();
        if (b.this.scene == 0) {}
        for (paramAnonymousView = com.tencent.mm.modelsns.b.ha(724);; paramAnonymousView = com.tencent.mm.modelsns.b.hb(724))
        {
          paramAnonymousView.lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32)).lu(localm.bmi()).lu(((amc)localObject3).uAX).hd(((amc)localObject3).pTM).lu(((amc)localObject3).tYz).lu(((amc)localObject3).tYy).lu(((amc)localObject3).mzo).lu(((amc)localObject3).pTK).lu(((amc)localObject3).gCz);
          paramAnonymousView.LR();
          if (!bg.nm(((amc)localObject3).uAX)) {
            break;
          }
          ((Intent)localObject1).putExtra("map_view_type", 7);
          ((Intent)localObject1).putExtra("kwebmap_slat", ((amc)localObject3).tYz);
          ((Intent)localObject1).putExtra("kwebmap_lng", ((amc)localObject3).tYy);
          ((Intent)localObject1).putExtra("kPoiName", ((amc)localObject3).mzo);
          ((Intent)localObject1).putExtra("Kwebmap_locaion", ((amc)localObject3).pTK);
          com.tencent.mm.bj.d.b(b.this.activity, "location", ".ui.RedirectUI", (Intent)localObject1);
          GMTrace.o(8657177673728L, 64501);
          return;
        }
        if (b.this.qnc == 0) {}
        for (paramAnonymousView = String.format("http://mp.weixin.qq.com/mp/lifedetail?bid=%s&action=list#wechat_redirect", new Object[] { ((amc)localObject3).uAX });; paramAnonymousView = String.format("http://mp.weixin.qq.com/mp/lifedetail?bid=%s&tid=%s&action=list#wechat_redirect", new Object[] { ((amc)localObject3).uAX, ((biz)localObject2).mmR }))
        {
          ((Intent)localObject1).putExtra("rawUrl", paramAnonymousView);
          com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject1, b.this.activity);
          GMTrace.o(8657177673728L, 64501);
          return;
        }
      }
    };
    this.qmV = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8655298625536L, 64487);
        if (!(paramAnonymousView.getTag() instanceof String))
        {
          GMTrace.o(8655298625536L, 64487);
          return;
        }
        paramAnonymousView = (String)paramAnonymousView.getTag();
        paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousView);
        if (paramAnonymousView == null)
        {
          GMTrace.o(8655298625536L, 64487);
          return;
        }
        if (paramAnonymousView.uX(32))
        {
          w.i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
          paramAnonymousView = paramAnonymousView.blB();
          if (paramAnonymousView == null)
          {
            w.e("MicroMsg.TimelineClickListener", "the adInfo is null");
            GMTrace.o(8655298625536L, 64487);
            return;
          }
          if (bg.nm(paramAnonymousView.pCn))
          {
            w.e("MicroMsg.TimelineClickListener", "the adActionExtTailLink is null");
            GMTrace.o(8655298625536L, 64487);
            return;
          }
          w.i("MicroMsg.TimelineClickListener", "open webview url : " + paramAnonymousView.pCn);
          Intent localIntent = new Intent();
          localIntent.putExtra("jsapiargs", new Bundle());
          localIntent.putExtra("useJs", true);
          localIntent.putExtra("rawUrl", paramAnonymousView.pCn);
          com.tencent.mm.plugin.sns.c.a.hnH.j(localIntent, b.this.activity);
          GMTrace.o(8655298625536L, 64487);
          return;
        }
        GMTrace.o(8655298625536L, 64487);
      }
    };
    this.qmW = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18568485797888L, 138346);
        Object localObject;
        if ((paramAnonymousView.getTag() instanceof a.c))
        {
          localObject = ((a.c)paramAnonymousView.getTag()).eEM;
          localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject);
          if (localObject == null)
          {
            GMTrace.o(18568485797888L, 138346);
            return;
          }
          if (((com.tencent.mm.plugin.sns.storage.m)localObject).uX(32))
          {
            w.i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
            if (b.this.scene != 0) {
              break label136;
            }
          }
        }
        label136:
        for (int i = 1;; i = 2)
        {
          localObject = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject).bmh(), 24, i, "", ((com.tencent.mm.plugin.sns.storage.m)localObject).bmm(), ((com.tencent.mm.plugin.sns.storage.m)localObject).blE());
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
          b.this.cy(paramAnonymousView);
          GMTrace.o(18568485797888L, 138346);
          return;
        }
      }
    };
    this.qmw = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18567277838336L, 138337);
        Object localObject3 = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.TimelineClickListener", "onCommentClick:" + (String)localObject3);
        Intent localIntent = new Intent();
        int i;
        Object localObject2;
        Object localObject1;
        if (((paramAnonymousView instanceof MaskImageButton)) && (((MaskImageButton)paramAnonymousView).xih != null))
        {
          paramAnonymousView = (String)((MaskImageButton)paramAnonymousView).xih;
          paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousView);
          if (paramAnonymousView.uX(32))
          {
            i = 1;
            localObject2 = paramAnonymousView.bmh();
            localObject1 = paramAnonymousView.blz();
            if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject1).pCR == 1) && (!bg.nm(((com.tencent.mm.plugin.sns.storage.b)localObject1).pCS)))
            {
              paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.b)localObject1).pCS;
              w.i("MicroMsg.TimelineClickListener", "headClickParam url " + paramAnonymousView + " " + ((com.tencent.mm.plugin.sns.storage.b)localObject1).pCT);
              localObject3 = new Intent();
              if (((com.tencent.mm.plugin.sns.storage.b)localObject1).pCT == 0) {}
              for (boolean bool = true;; bool = false)
              {
                ((Intent)localObject3).putExtra("KsnsViewId", (String)localObject2);
                ((Intent)localObject3).putExtra("KRightBtn", bool);
                ((Intent)localObject3).putExtra("jsapiargs", new Bundle());
                ((Intent)localObject3).putExtra("rawUrl", paramAnonymousView);
                ((Intent)localObject3).putExtra("useJs", true);
                com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject3, b.this.activity);
                GMTrace.o(18567277838336L, 138337);
                return;
              }
            }
            localObject1 = paramAnonymousView;
            paramAnonymousView = (View)localObject2;
          }
        }
        for (;;)
        {
          int j;
          if (localObject1 != null)
          {
            if (b.this.scene != 0) {
              break label513;
            }
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32))
            {
              j = 722;
              localObject2 = com.tencent.mm.modelsns.b.ha(j);
              ((com.tencent.mm.modelsns.b)localObject2).lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject1)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type).bC(((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)).lu(((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi()).lu((String)localObject3);
              ((com.tencent.mm.modelsns.b)localObject2).LR();
            }
          }
          else
          {
            if (i == 0) {
              break label553;
            }
            if (b.this.scene != 0) {
              break label543;
            }
            i = 1;
            label382:
            localObject2 = new SnsAdClick(paramAnonymousView, i, ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmm(), (byte)0);
            localIntent.putExtra("Contact_User", (String)localObject3);
            localIntent.putExtra("KSnsAdTag", (Parcelable)localObject2);
            com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, b.this.activity);
            if (b.this.scene != 0) {
              break label548;
            }
          }
          label513:
          label543:
          label548:
          for (i = 1;; i = 2)
          {
            paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 1, i, "", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmm(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
            GMTrace.o(18567277838336L, 138337);
            return;
            j = 721;
            break;
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)) {}
            for (j = 722;; j = 721)
            {
              localObject2 = com.tencent.mm.modelsns.b.hb(j);
              break;
            }
            i = 2;
            break label382;
          }
          label553:
          b.this.pPx.biI().a((com.tencent.mm.plugin.sns.storage.m)localObject1, true);
          if (b.this.scene == 0) {}
          for (paramAnonymousView = com.tencent.mm.modelsns.b.ha(746);; paramAnonymousView = com.tencent.mm.modelsns.b.hb(746))
          {
            localObject1 = com.tencent.mm.y.q.zE();
            paramAnonymousView.lu((String)localObject3).bC(((String)localObject3).endsWith((String)localObject1));
            paramAnonymousView.b(localIntent, "intent_key_StatisticsOplog");
            localIntent.putExtra("Contact_User", (String)localObject3);
            com.tencent.mm.plugin.sns.c.a.hnH.d(localIntent, b.this.activity);
            GMTrace.o(18567277838336L, 138337);
            return;
          }
          localObject1 = paramAnonymousView;
          paramAnonymousView = "";
          i = 0;
          continue;
          localObject1 = null;
          paramAnonymousView = "";
          i = 0;
        }
      }
    };
    this.qmx = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(18568888451072L, 138349);
        final String str = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.TimelineClickListener", "onCommentLongClick:" + str);
        if (bg.nm(str))
        {
          GMTrace.o(18568888451072L, 138349);
          return true;
        }
        if (str.equals(com.tencent.mm.plugin.sns.model.ae.biJ()))
        {
          GMTrace.o(18568888451072L, 138349);
          return true;
        }
        final Object localObject;
        final com.tencent.mm.plugin.sns.storage.m localm;
        if ((((MaskImageButton)paramAnonymousView).xih != null) && ((((MaskImageButton)paramAnonymousView).xih instanceof String)))
        {
          localObject = (String)((MaskImageButton)paramAnonymousView).xih;
          new Intent();
          localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject);
          if ((localm == null) || (!localm.uX(32))) {
            break label267;
          }
        }
        label267:
        for (int i = 1;; i = 0)
        {
          if (i != 0)
          {
            GMTrace.o(18568888451072L, 138349);
            return false;
            localObject = "";
            break;
          }
          com.tencent.mm.ui.widget.h localh = new com.tencent.mm.ui.widget.h(b.this.activity, paramAnonymousView);
          localh.xqG = new View.OnCreateContextMenuListener()
          {
            public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
            {
              GMTrace.i(18571438587904L, 138368);
              paramAnonymous2ContextMenu.add(0, 0, 0, b.this.activity.getString(i.j.dkg));
              paramAnonymous2ContextMenu.add(1, 1, 0, b.this.activity.getString(i.j.pkS));
              GMTrace.o(18571438587904L, 138368);
            }
          };
          localh.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              long l = 0L;
              GMTrace.i(18569291104256L, 138352);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              default: 
                GMTrace.o(18569291104256L, 138352);
                return;
              case 0: 
                paramAnonymous2MenuItem = new Intent();
                if (localm == null) {}
                for (;;)
                {
                  paramAnonymous2MenuItem.putExtra("sns_permission_snsinfo_svr_id", l);
                  paramAnonymous2MenuItem.putExtra("sns_permission_userName", str);
                  paramAnonymous2MenuItem.putExtra("sns_permission_anim", true);
                  paramAnonymous2MenuItem.putExtra("sns_permission_block_scene", 5);
                  paramAnonymous2MenuItem.setClass(b.this.activity, SnsPermissionUI.class);
                  b.this.activity.startActivityForResult(paramAnonymous2MenuItem, 11);
                  GMTrace.o(18569291104256L, 138352);
                  return;
                  l = localm.field_snsId;
                }
              }
              Intent localIntent = new Intent();
              paramAnonymous2MenuItem = com.tencent.mm.plugin.sns.model.ae.bjd().Is(localObject);
              if (paramAnonymous2MenuItem == null)
              {
                w.i("MicroMsg.TimelineClickListener", "error get snsinfo by id " + localObject);
                GMTrace.o(18569291104256L, 138352);
                return;
              }
              w.i("MicroMsg.TimelineClickListener", "expose id " + paramAnonymous2MenuItem.blE() + " " + paramAnonymous2MenuItem.field_userName);
              if (paramAnonymous2MenuItem == null)
              {
                label249:
                localIntent.putExtra("k_expose_msg_id", l);
                if (paramAnonymous2MenuItem != null) {
                  break label338;
                }
              }
              label338:
              for (paramAnonymous2MenuItem = "";; paramAnonymous2MenuItem = paramAnonymous2MenuItem.field_userName)
              {
                localIntent.putExtra("k_username", paramAnonymous2MenuItem);
                localIntent.putExtra("showShare", false);
                localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
                com.tencent.mm.bj.d.b(b.this.activity, "webview", ".ui.tools.WebViewUI", localIntent);
                break;
                l = paramAnonymous2MenuItem.field_snsId;
                break label249;
              }
            }
          };
          localObject = new int[2];
          if ((paramAnonymousView.getTag(a.e.cie) instanceof int[])) {
            localObject = (int[])paramAnonymousView.getTag(a.e.cie);
          }
          localh.bz(localObject[0], localObject[1]);
          GMTrace.o(18568888451072L, 138349);
          return false;
        }
      }
    };
    this.qmy = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(8651406311424L, 64458);
        paramAnonymousView = (com.tencent.mm.plugin.sns.ui.as)paramAnonymousView.getTag();
        paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ae.bjd().Ir(paramAnonymousView.eUg);
        if (paramAnonymousContextMenuInfo == null)
        {
          GMTrace.o(8651406311424L, 64458);
          return;
        }
        paramAnonymousContextMenu.add(0, 0, 0, b.this.activity.getString(i.j.cSp));
        if (com.tencent.mm.bj.d.LL("favorite")) {
          paramAnonymousContextMenu.add(0, 1, 0, b.this.activity.getString(i.j.dNH));
        }
        biz localbiz = paramAnonymousContextMenuInfo.blD();
        if ((paramAnonymousView.qdP) || ((localbiz != null) && (localbiz.uUe != 1) && (!paramAnonymousView.qdQ)))
        {
          if (paramAnonymousView.bpn()) {
            break label154;
          }
          ao.a(paramAnonymousContextMenu, true);
        }
        for (;;)
        {
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, paramAnonymousContextMenuInfo);
          GMTrace.o(8651406311424L, 64458);
          return;
          label154:
          ao.b(paramAnonymousContextMenu, true);
        }
      }
      
      public final boolean cG(View paramAnonymousView)
      {
        GMTrace.i(8651272093696L, 64457);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.as))
        {
          Object localObject = (com.tencent.mm.plugin.sns.ui.as)paramAnonymousView.getTag();
          localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Ir(((com.tencent.mm.plugin.sns.ui.as)localObject).eUg);
          if (localObject == null)
          {
            GMTrace.o(8651272093696L, 64457);
            return false;
          }
          String str = ((com.tencent.mm.plugin.sns.storage.m)localObject).blY();
          b.this.qmv.a(paramAnonymousView, str, ((com.tencent.mm.plugin.sns.storage.m)localObject).blD());
          GMTrace.o(8651272093696L, 64457);
          return true;
        }
        GMTrace.o(8651272093696L, 64457);
        return false;
      }
    };
    this.qmM = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(8650869440512L, 64454);
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        if (((paramAnonymousContextMenuInfo instanceof a.c)) || ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.storage.m)) || ((paramAnonymousContextMenuInfo instanceof ak)) || ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.ui.ap))) {
          if ((paramAnonymousContextMenuInfo instanceof a.c)) {
            paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.storage.h.Ir(((a.c)paramAnonymousContextMenuInfo).eUg);
          }
        }
        for (;;)
        {
          if (!paramAnonymousContextMenuInfo.uX(32))
          {
            GMTrace.o(8650869440512L, 64454);
            return;
            if ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.storage.m))
            {
              paramAnonymousContextMenuInfo = (com.tencent.mm.plugin.sns.storage.m)paramAnonymousContextMenuInfo;
              continue;
            }
            if ((paramAnonymousContextMenuInfo instanceof ak))
            {
              paramAnonymousContextMenuInfo = (ak)paramAnonymousContextMenuInfo;
              paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousContextMenuInfo.eEM);
              continue;
            }
            if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
            {
              paramAnonymousContextMenuInfo = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).eHy;
              paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousContextMenuInfo);
            }
          }
          else
          {
            if ((paramAnonymousContextMenuInfo.blz() == null) || (paramAnonymousContextMenuInfo.blz().pDs != 1))
            {
              GMTrace.o(8650869440512L, 64454);
              return;
            }
            if (com.tencent.mm.bj.d.LL("favorite"))
            {
              Object localObject = paramAnonymousContextMenuInfo.blz();
              paramAnonymousContextMenuInfo.blB();
              if (((com.tencent.mm.plugin.sns.storage.b)localObject).bke()) {
                paramAnonymousContextMenu.add(0, 20, 0, paramAnonymousView.getContext().getString(i.j.dNH));
              }
              localObject = new dh();
              ((dh)localObject).eEV.eEM = paramAnonymousContextMenuInfo.blY();
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
              if (((dh)localObject).eEW.eEu) {
                paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.phO));
              }
            }
            if (paramAnonymousContextMenuInfo != null) {
              com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, paramAnonymousContextMenuInfo);
            }
            GMTrace.o(8650869440512L, 64454);
            return;
          }
          paramAnonymousContextMenuInfo = null;
        }
      }
      
      public final boolean cG(View paramAnonymousView)
      {
        GMTrace.i(8651003658240L, 64455);
        Object localObject;
        if (((paramAnonymousView.getTag() instanceof a.c)) || ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.storage.m)) || ((paramAnonymousView.getTag() instanceof ak)) || ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)))
        {
          localObject = paramAnonymousView.getTag();
          if ((localObject instanceof a.c)) {
            localObject = com.tencent.mm.plugin.sns.storage.h.Ir(((a.c)paramAnonymousView.getTag()).eUg);
          }
        }
        for (;;)
        {
          if (localObject != null)
          {
            if (!((com.tencent.mm.plugin.sns.storage.m)localObject).uX(32))
            {
              GMTrace.o(8651003658240L, 64455);
              return false;
              if ((localObject instanceof com.tencent.mm.plugin.sns.storage.m))
              {
                localObject = (com.tencent.mm.plugin.sns.storage.m)localObject;
                continue;
              }
              if ((localObject instanceof ak))
              {
                localObject = (ak)localObject;
                localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is(((ak)localObject).eEM);
                continue;
              }
              if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
              {
                localObject = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).eHy;
                localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject);
              }
            }
            else
            {
              if ((((com.tencent.mm.plugin.sns.storage.m)localObject).blz() == null) || (((com.tencent.mm.plugin.sns.storage.m)localObject).blz().pDs != 1))
              {
                GMTrace.o(8651003658240L, 64455);
                return false;
              }
              b.this.qmv.a(paramAnonymousView, ((com.tencent.mm.plugin.sns.storage.m)localObject).blY(), ((com.tencent.mm.plugin.sns.storage.m)localObject).blD());
            }
          }
          else
          {
            GMTrace.o(8651003658240L, 64455);
            return true;
            GMTrace.o(8651003658240L, 64455);
            return false;
          }
          localObject = null;
        }
      }
    };
    this.qmN = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(8647379779584L, 64428);
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        if (((paramAnonymousContextMenuInfo instanceof a.c)) || ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.storage.m)))
        {
          if (!(paramAnonymousContextMenuInfo instanceof a.c)) {
            break label181;
          }
          paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.storage.h.Ir(((a.c)paramAnonymousContextMenuInfo).eUg);
        }
        for (;;)
        {
          Object localObject;
          com.tencent.mm.plugin.sns.storage.a locala;
          if (com.tencent.mm.bj.d.LL("favorite"))
          {
            localObject = paramAnonymousContextMenuInfo.blz();
            locala = paramAnonymousContextMenuInfo.blB();
            if (((com.tencent.mm.plugin.sns.storage.b)localObject).bkd())
            {
              if (!((com.tencent.mm.plugin.sns.storage.b)localObject).pCp) {
                break label196;
              }
              paramAnonymousContextMenu.add(0, 2, 0, paramAnonymousView.getContext().getString(i.j.dNH));
            }
          }
          for (;;)
          {
            localObject = new dh();
            ((dh)localObject).eEV.eEM = paramAnonymousContextMenuInfo.blY();
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            if (((dh)localObject).eEW.eEu) {
              paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.phO));
            }
            if (paramAnonymousContextMenuInfo != null) {
              com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, paramAnonymousContextMenuInfo);
            }
            GMTrace.o(8647379779584L, 64428);
            return;
            label181:
            if (!(paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.storage.m)) {
              break label227;
            }
            paramAnonymousContextMenuInfo = (com.tencent.mm.plugin.sns.storage.m)paramAnonymousContextMenuInfo;
            break;
            label196:
            if (locala.pCc == 0) {
              paramAnonymousContextMenu.add(0, 3, 0, paramAnonymousView.getContext().getString(i.j.dNH));
            }
          }
          label227:
          paramAnonymousContextMenuInfo = null;
        }
      }
      
      public final boolean cG(View paramAnonymousView)
      {
        GMTrace.i(8647513997312L, 64429);
        Object localObject;
        if (((paramAnonymousView.getTag() instanceof a.c)) || ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.storage.m)))
        {
          localObject = paramAnonymousView.getTag();
          if ((localObject instanceof a.c)) {
            localObject = com.tencent.mm.plugin.sns.storage.h.Ir(((a.c)paramAnonymousView.getTag()).eUg);
          }
        }
        for (;;)
        {
          if (localObject != null) {
            b.this.qmv.a(paramAnonymousView, ((com.tencent.mm.plugin.sns.storage.m)localObject).blY(), ((com.tencent.mm.plugin.sns.storage.m)localObject).blD());
          }
          GMTrace.o(8647513997312L, 64429);
          return true;
          if ((localObject instanceof com.tencent.mm.plugin.sns.storage.m))
          {
            localObject = (com.tencent.mm.plugin.sns.storage.m)localObject;
            continue;
            GMTrace.o(8647513997312L, 64429);
            return false;
          }
          else
          {
            localObject = null;
          }
        }
      }
    };
    this.qmK = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(18567412056064L, 138338);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.r)) {
          b.this.qmO.onCreateContextMenu(paramAnonymousContextMenu, paramAnonymousView, paramAnonymousContextMenuInfo);
        }
        GMTrace.o(18567412056064L, 138338);
      }
      
      public final boolean cG(View paramAnonymousView)
      {
        GMTrace.i(18567546273792L, 138339);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.r))
        {
          String str = ((com.tencent.mm.plugin.sns.ui.r)paramAnonymousView.getTag()).eEM;
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(str);
          b.this.qmv.a(paramAnonymousView, str, localm.blD());
          GMTrace.o(18567546273792L, 138339);
          return true;
        }
        GMTrace.o(18567546273792L, 138339);
        return false;
      }
    };
    this.qmJ = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(18571707023360L, 138370);
        int j;
        int i;
        if ((paramAnonymousView != null) && ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)))
        {
          paramAnonymousContextMenuInfo = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).eHy;
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousContextMenuInfo);
          if (com.tencent.mm.bj.d.LL("favorite"))
          {
            paramAnonymousContextMenu.add(0, 2, 0, b.this.activity.getString(i.j.dNH));
            dh localdh = new dh();
            localdh.eEV.eEM = paramAnonymousContextMenuInfo;
            com.tencent.mm.sdk.b.a.vgX.m(localdh);
            if (localdh.eEW.eEu) {
              paramAnonymousContextMenu.add(0, 18, 0, b.this.activity.getString(i.j.phO));
            }
          }
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, localm);
          if (com.tencent.mm.bj.d.LL("photoedit"))
          {
            paramAnonymousContextMenu = paramAnonymousContextMenu.add(0, 21, 0, b.this.activity.getString(i.j.piV));
            paramAnonymousContextMenuInfo = new int[2];
            if (paramAnonymousView == null) {
              break label255;
            }
            j = paramAnonymousView.getWidth();
            i = paramAnonymousView.getHeight();
            paramAnonymousView.getLocationInWindow(paramAnonymousContextMenuInfo);
          }
        }
        for (;;)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", paramAnonymousContextMenuInfo[0]).putExtra("img_gallery_top", paramAnonymousContextMenuInfo[1]);
          paramAnonymousContextMenu.setIntent(paramAnonymousView);
          GMTrace.o(18571707023360L, 138370);
          return;
          label255:
          i = 0;
          j = 0;
        }
      }
      
      public final boolean cG(View paramAnonymousView)
      {
        GMTrace.i(18571841241088L, 138371);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
        {
          String str = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).eHy;
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(str);
          b.this.qmv.a(paramAnonymousView, str, localm.blD());
          GMTrace.o(18571841241088L, 138371);
          return true;
        }
        GMTrace.o(18571841241088L, 138371);
        return false;
      }
    };
    this.pTd = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8646306037760L, 64420);
        Object localObject2;
        Object localObject1;
        int i;
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
        {
          localObject2 = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).eHy;
          localObject1 = com.tencent.mm.plugin.sns.storage.h.Is((String)localObject2);
          if (localObject1 == null)
          {
            w.e("MicroMsg.TimelineClickListener", "photo click without snsinfo ,localId " + (String)localObject2);
            GMTrace.o(8646306037760L, 64420);
            return;
          }
          if ((((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).blz() != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pDs == 1))
          {
            b.this.qna.onClick(paramAnonymousView);
            GMTrace.o(8646306037760L, 64420);
            return;
          }
          if (((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().uUc.ueV == 21)
          {
            if (com.tencent.mm.y.q.zE().equals(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName))
            {
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().mmR;
              com.tencent.mm.plugin.sns.lucky.a.m.j((com.tencent.mm.plugin.sns.storage.m)localObject1);
              com.tencent.mm.plugin.sns.lucky.a.m.i((com.tencent.mm.plugin.sns.storage.m)localObject1);
              System.currentTimeMillis();
              com.tencent.mm.plugin.sns.lucky.a.b.nU(25);
            }
            if (!com.tencent.mm.y.q.zE().equals(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName))
            {
              com.tencent.mm.plugin.sns.lucky.b.a.a(2, (com.tencent.mm.plugin.sns.storage.m)localObject1);
              com.tencent.mm.plugin.sns.lucky.a.b.nU(30);
            }
          }
          if (!((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)) {
            break label858;
          }
          ((com.tencent.mm.plugin.sns.storage.m)localObject1).blB();
          if ((!((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCp) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml))) {
            break label847;
          }
          localObject2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject1);
          if (!bg.nm((String)localObject2)) {
            ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml = ((String)localObject2);
          }
          localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
          if (b.this.scene != 0) {
            break label837;
          }
          i = 1;
          localObject2 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject2, 21, i, "", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmm(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a((k)localObject2, 0);
          Object localObject3 = new int[2];
          if (paramAnonymousView != null) {
            paramAnonymousView.getLocationInWindow((int[])localObject3);
          }
          i = paramAnonymousView.getWidth();
          int j = paramAnonymousView.getHeight();
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("img_gallery_left", localObject3[0]);
          ((Intent)localObject2).putExtra("img_gallery_top", localObject3[1]);
          ((Intent)localObject2).putExtra("img_gallery_width", i);
          ((Intent)localObject2).putExtra("img_gallery_height", j);
          ((Intent)localObject2).putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
          ((Intent)localObject2).putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi());
          ((Intent)localObject2).putExtra("sns_landing_pages_aid", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmd());
          ((Intent)localObject2).putExtra("sns_landing_pages_traceid", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bme());
          localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
          if (localObject3 != null)
          {
            localObject3 = ((biz)localObject3).uUc.ueW;
            if (((List)localObject3).size() > 0)
            {
              ((Intent)localObject2).putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject3).get(0)).uCO);
              ((Intent)localObject2).putExtra("sns_landing_pages_from_outer_index", ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).index);
            }
          }
          ((Intent)localObject2).setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
          if (b.this.scene != 0) {
            break label842;
          }
          i = 1;
          label573:
          ((Intent)localObject2).putExtra("sns_landig_pages_from_source", i);
          ((Intent)localObject2).putExtra("sns_landing_pages_xml", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml);
          ((Intent)localObject2).putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bml());
          ((Intent)localObject2).putExtra("sns_landing_pages_xml_prefix", "adxml");
          ((Intent)localObject2).putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
          b.this.activity.startActivity((Intent)localObject2);
          b.this.activity.overridePendingTransition(0, 0);
          if (b.this.pPx != null) {
            b.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject1);
          }
          label687:
          ((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32);
          paramAnonymousView = (com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag();
          if ((paramAnonymousView.pYh) && (localObject1 != null))
          {
            ax.b((com.tencent.mm.plugin.sns.storage.m)localObject1, paramAnonymousView.index);
            ax.c((com.tencent.mm.plugin.sns.storage.m)localObject1, paramAnonymousView.index);
            au.HG(((com.tencent.mm.plugin.sns.storage.m)localObject1).blY());
          }
          if (localObject1 != null)
          {
            localObject1 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
            if (localObject1 != null) {
              if (((biz)localObject1).uUb != null) {
                break label869;
              }
            }
          }
        }
        label837:
        label842:
        label847:
        label858:
        label869:
        for (paramAnonymousView = null;; paramAnonymousView = ((biz)localObject1).uUb.mmR)
        {
          if ((!bg.nm(paramAnonymousView)) && (com.tencent.mm.plugin.sns.c.a.hnI.bJ(paramAnonymousView)))
          {
            localObject2 = com.tencent.mm.plugin.sns.c.a.hnI.bH(paramAnonymousView);
            com.tencent.mm.plugin.sns.c.a.hnI.a(null, paramAnonymousView, (String)localObject2, ((biz)localObject1).jhi, 2, 4, 4, ((biz)localObject1).uUg, ((biz)localObject1).mmR);
          }
          GMTrace.o(8646306037760L, 64420);
          return;
          i = 2;
          break;
          i = 2;
          break label573;
          b.this.bs(paramAnonymousView);
          break label687;
          b.this.bs(paramAnonymousView);
          break label687;
        }
      }
    };
    this.qmz = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(8654493319168L, 64481);
        com.tencent.mm.ui.base.h.a(b.this.activity, i.j.pkT, i.j.cUG, i.j.cSt, i.j.cSk, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(18570499063808L, 138361);
            if (!(paramAnonymousView.getTag() instanceof String))
            {
              GMTrace.o(18570499063808L, 138361);
              return;
            }
            paramAnonymous2DialogInterface = (String)paramAnonymousView.getTag();
            w.d("MicroMsg.TimelineClickListener", "onItemDelClick:" + paramAnonymous2DialogInterface);
            com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymous2DialogInterface);
            if (localm == null)
            {
              w.d("MicroMsg.TimelineClickListener", "can not get snsinfo by localid %s then return it", new Object[] { paramAnonymous2DialogInterface });
              GMTrace.o(18570499063808L, 138361);
              return;
            }
            Object localObject2;
            if (localm.bma())
            {
              w.i("MicroMsg.TimelineClickListener", "dead item");
              com.tencent.mm.plugin.sns.model.ae.bjd().vb(localm.pMe);
              if (b.this.qnb != null) {
                b.this.qnb.bnj();
              }
              if (b.this.scene == 0)
              {
                localObject1 = com.tencent.mm.modelsns.b.ha(739);
                localObject2 = ((com.tencent.mm.modelsns.b)localObject1).lu(i.g(localm)).hd(localm.field_type);
                if (!localm.bma()) {
                  break label253;
                }
                paramAnonymous2DialogInterface = "2";
              }
              for (;;)
              {
                ((com.tencent.mm.modelsns.b)localObject2).lu(paramAnonymous2DialogInterface);
                ((com.tencent.mm.modelsns.b)localObject1).LR();
                if (localm.field_type == 21) {
                  com.tencent.mm.plugin.sns.lucky.a.g.bhW().bhY();
                }
                GMTrace.o(18570499063808L, 138361);
                return;
                localObject1 = com.tencent.mm.modelsns.b.hb(739);
                break;
                label253:
                if (localm.field_snsId == 0L) {
                  paramAnonymous2DialogInterface = "1";
                } else {
                  paramAnonymous2DialogInterface = "0";
                }
              }
            }
            if (localm.biM())
            {
              w.i("MicroMsg.TimelineClickListener", "cancel item " + localm.blY());
              com.tencent.mm.plugin.sns.model.ae.biZ().r(localm);
              b.this.bmP();
              GMTrace.o(18570499063808L, 138361);
              return;
            }
            w.i("MicroMsg.TimelineClickListener", "delete by server");
            paramAnonymous2DialogInterface = localm.blE();
            com.tencent.mm.plugin.sns.model.ae.bjc().dG(u.IM(paramAnonymous2DialogInterface));
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.sns.model.q(u.IM(paramAnonymous2DialogInterface), 1), 0);
            com.tencent.mm.plugin.sns.model.ae.bjd().delete(u.IM(paramAnonymous2DialogInterface));
            com.tencent.mm.plugin.sns.model.ae.bji().dP(u.IM(paramAnonymous2DialogInterface));
            b.this.bmP();
            Object localObject1 = localm.blD();
            if (localObject1 != null)
            {
              if (((biz)localObject1).uUb != null) {
                break label598;
              }
              paramAnonymous2DialogInterface = null;
              if ((!bg.nm(paramAnonymous2DialogInterface)) && (com.tencent.mm.plugin.sns.c.a.hnI.bJ(paramAnonymous2DialogInterface)))
              {
                localObject2 = com.tencent.mm.plugin.sns.c.a.hnI.bH(paramAnonymous2DialogInterface);
                mz localmz = new mz();
                localmz.eRX.appId = paramAnonymous2DialogInterface;
                localmz.eRX.eRY = ((biz)localObject1).jhi;
                localmz.eRX.esM = ((String)localObject2);
                localmz.eRX.mediaTagName = ((biz)localObject1).uUg;
                com.tencent.mm.sdk.b.a.vgX.m(localmz);
              }
            }
            if (b.this.scene == 0)
            {
              localObject1 = com.tencent.mm.modelsns.b.ha(739);
              label547:
              localObject2 = ((com.tencent.mm.modelsns.b)localObject1).lu(i.g(localm)).hd(localm.field_type);
              if (!localm.bma()) {
                break label619;
              }
              paramAnonymous2DialogInterface = "2";
            }
            for (;;)
            {
              ((com.tencent.mm.modelsns.b)localObject2).lu(paramAnonymous2DialogInterface);
              ((com.tencent.mm.modelsns.b)localObject1).LR();
              GMTrace.o(18570499063808L, 138361);
              return;
              label598:
              paramAnonymous2DialogInterface = ((biz)localObject1).uUb.mmR;
              break;
              localObject1 = com.tencent.mm.modelsns.b.hb(739);
              break label547;
              label619:
              if (localm.field_snsId == 0L) {
                paramAnonymous2DialogInterface = "1";
              } else {
                paramAnonymous2DialogInterface = "0";
              }
            }
          }
        }, null);
        GMTrace.o(8654493319168L, 64481);
      }
    };
    this.qmA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8647111344128L, 64426);
        paramAnonymousView = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.TimelineClickListener", "onItemDelClick:" + paramAnonymousView);
        paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousView).blD();
        com.tencent.mm.protocal.c.as localas = paramAnonymousView.pwN;
        if (localas.tOK == null)
        {
          GMTrace.o(8647111344128L, 64426);
          return;
        }
        String str = com.tencent.mm.plugin.sns.c.a.hnI.bH(localas.tOK.lQa);
        int i = 0;
        if (paramAnonymousView.uUc.ueV == 1) {
          i = 2;
        }
        while (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(paramAnonymousView, b.this.activity))
        {
          com.tencent.mm.plugin.sns.c.a.hnI.a(b.this.activity, localas.tOK.lQa, str, paramAnonymousView.jhi, i, 11, 9, localas.tOK.tOD, paramAnonymousView.mmR);
          GMTrace.o(8647111344128L, 64426);
          return;
          if (paramAnonymousView.uUc.ueV == 3) {
            i = 5;
          } else if (paramAnonymousView.uUc.ueV == 15) {
            i = 38;
          }
        }
        switch (localas.jib)
        {
        }
        for (;;)
        {
          GMTrace.o(8647111344128L, 64426);
          return;
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", localas.lPM);
          com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject, b.this.activity);
          com.tencent.mm.plugin.sns.c.a.hnI.a(b.this.activity, localas.tOK.lQa, str, paramAnonymousView.jhi, i, 11, 1, localas.tOK.tOD, paramAnonymousView.mmR);
          GMTrace.o(8647111344128L, 64426);
          return;
          if (localas.tOG == 1)
          {
            localObject = new gk();
            ((gk)localObject).eJy.actionCode = 2;
            ((gk)localObject).eJy.scene = 3;
            ((gk)localObject).eJy.appId = localas.tOK.lQa;
            ((gk)localObject).eJy.context = b.this.activity;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            com.tencent.mm.plugin.sns.c.a.hnI.a(b.this.activity, localas.tOK.lQa, str, paramAnonymousView.jhi, i, 11, 6, localas.tOK.tOD, paramAnonymousView.mmR);
            GMTrace.o(8647111344128L, 64426);
            return;
            int j = ag.a(b.this.activity, localas);
            if (j == 1)
            {
              localObject = new gk();
              ((gk)localObject).eJy.context = b.this.activity;
              ((gk)localObject).eJy.actionCode = 2;
              ((gk)localObject).eJy.appId = localas.tOK.lQa;
              ((gk)localObject).eJy.messageAction = localas.tOK.tOF;
              ((gk)localObject).eJy.messageExt = localas.tOK.tOE;
              ((gk)localObject).eJy.scene = 3;
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
              com.tencent.mm.plugin.sns.c.a.hnI.a(b.this.activity, localas.tOK.lQa, str, paramAnonymousView.jhi, i, 11, 6, localas.tOK.tOD, paramAnonymousView.mmR);
              GMTrace.o(8647111344128L, 64426);
              return;
            }
            if (j == 2)
            {
              localObject = new gk();
              ((gk)localObject).eJy.context = b.this.activity;
              ((gk)localObject).eJy.actionCode = 1;
              ((gk)localObject).eJy.appId = localas.tOK.lQa;
              ((gk)localObject).eJy.messageAction = localas.tOK.tOF;
              ((gk)localObject).eJy.messageExt = localas.tOK.tOE;
              ((gk)localObject).eJy.scene = 3;
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
              com.tencent.mm.plugin.sns.c.a.hnI.a(b.this.activity, localas.tOK.lQa, str, paramAnonymousView.jhi, i, 11, 3, localas.tOK.tOD, paramAnonymousView.mmR);
            }
          }
        }
      }
    };
    this.qmH = new View.OnClickListener()
    {
      private static void Js(String paramAnonymousString)
      {
        GMTrace.i(18567814709248L, 138341);
        long l = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousString).field_snsId;
        Object localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().dU(l);
        if (localObject1 != null)
        {
          Object localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
          if (localObject2 != null)
          {
            localObject2 = ((biz)localObject2).uUc.ueW;
            if (((List)localObject2).size() > 0) {
              ((List)localObject2).get(0);
            }
          }
          localObject2 = ai.n((com.tencent.mm.plugin.sns.storage.m)localObject1);
          localObject1 = new ArrayList();
          localObject2 = ((bfh)localObject2).uRe.uRH;
          if (localObject2 != null)
          {
            int i = 0;
            while (i < ((List)localObject2).size())
            {
              bfd localbfd = (bfd)((List)localObject2).get(i);
              com.tencent.mm.plugin.q.a.a locala = new com.tencent.mm.plugin.q.a.a();
              locala.iAx = localbfd.tRz;
              locala.mEY = localbfd.nFd;
              locala.mEZ = localbfd.uQq;
              ((List)localObject1).add(locala);
              i += 1;
            }
          }
          com.tencent.mm.plugin.q.a.i(paramAnonymousString, (List)localObject1);
        }
        GMTrace.o(18567814709248L, 138341);
      }
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8652614270976L, 64467);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.storage.m))
        {
          paramAnonymousView = (com.tencent.mm.plugin.sns.storage.m)paramAnonymousView.getTag();
          if ((paramAnonymousView.field_type == 21) && (com.tencent.mm.y.q.zE().equals(paramAnonymousView.field_userName)))
          {
            localObject = paramAnonymousView.blD().mmR;
            com.tencent.mm.plugin.sns.lucky.a.m.j(paramAnonymousView);
            com.tencent.mm.plugin.sns.lucky.a.m.i(paramAnonymousView);
            System.currentTimeMillis();
            com.tencent.mm.plugin.sns.lucky.a.b.nU(24);
          }
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("key_sendid", paramAnonymousView.blE());
          ((Intent)localObject).putExtra("key_feedid", paramAnonymousView.blY());
          ((Intent)localObject).setClassName(b.this.activity, "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI");
          b.this.activity.startActivity((Intent)localObject);
          localObject = paramAnonymousView.blY();
          paramAnonymousView.blE();
          Js((String)localObject);
        }
        GMTrace.o(8652614270976L, 64467);
      }
    };
    this.qmB = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8648990392320L, 64440);
        b.this.cx(paramAnonymousView);
        GMTrace.o(8648990392320L, 64440);
      }
    };
    this.qmC = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8646574473216L, 64422);
        b.this.cA(paramAnonymousView);
        GMTrace.o(8646574473216L, 64422);
      }
    };
    this.qmD = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18571572805632L, 138369);
        if ((paramAnonymousView.getTag() instanceof String))
        {
          paramAnonymousView = (String)paramAnonymousView.getTag();
          w.d("MicroMsg.TimelineClickListener", "localId " + paramAnonymousView);
          ai.ux(u.IN(paramAnonymousView));
          ai.uv(u.IN(paramAnonymousView));
          com.tencent.mm.plugin.sns.model.ae.biZ().bhR();
          b.this.bmP();
          if (b.this.qnb != null) {
            b.this.qnb.bnj();
          }
        }
        GMTrace.o(18571572805632L, 138369);
      }
    };
    this.qmE = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18569827975168L, 138356);
        try
        {
          int i = u.IN((String)paramAnonymousView.getTag());
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("sns_label_sns_info", i);
          com.tencent.mm.plugin.sns.c.a.hnH.x(paramAnonymousView, b.this.activity);
          GMTrace.o(18569827975168L, 138356);
          return;
        }
        catch (Exception paramAnonymousView)
        {
          GMTrace.o(18569827975168L, 138356);
        }
      }
    };
    this.qmI = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(18569962192896L, 138357);
        long l;
        int i;
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.m))
        {
          paramAnonymousView = (com.tencent.mm.plugin.sns.ui.m)paramAnonymousView.getTag();
          paramAnonymousContextMenu.add(0, 11, 0, b.this.activity.getString(i.j.cSp));
          if ((paramAnonymousView.jhi != null) && (paramAnonymousView.jhi.equals(com.tencent.mm.y.q.zE()))) {
            paramAnonymousContextMenu.add(0, 7, 0, b.this.activity.getString(i.j.cSt));
          }
          paramAnonymousContextMenuInfo = paramAnonymousView.pPG;
          StringBuilder localStringBuilder = new StringBuilder();
          if (paramAnonymousView.pso.uQm != 0)
          {
            l = paramAnonymousView.pso.uQm;
            paramAnonymousContextMenuInfo = ao.dF(paramAnonymousContextMenuInfo, l);
            if (paramAnonymousView.scene != 1) {
              break label221;
            }
            i = 2;
          }
        }
        for (;;)
        {
          label154:
          paramAnonymousView = ao.HA(paramAnonymousContextMenuInfo);
          if ((paramAnonymousView != null) && (paramAnonymousView.gpJ) && (!paramAnonymousView.gsF) && ((i & paramAnonymousView.fje) != 0)) {}
          for (i = 1;; i = 0)
          {
            if (i != 0) {
              break label241;
            }
            ao.a(paramAnonymousContextMenu, false);
            GMTrace.o(18569962192896L, 138357);
            return;
            l = paramAnonymousView.pso.uQp;
            break;
            label221:
            if (paramAnonymousView.scene != 2) {
              break label255;
            }
            i = 4;
            break label154;
          }
          label241:
          ao.b(paramAnonymousContextMenu, false);
          GMTrace.o(18569962192896L, 138357);
          return;
          label255:
          i = -1;
        }
      }
      
      public final boolean cG(View paramAnonymousView)
      {
        GMTrace.i(18570096410624L, 138358);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.m))
        {
          Object localObject = (com.tencent.mm.plugin.sns.ui.m)paramAnonymousView.getTag();
          localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Ir(((com.tencent.mm.plugin.sns.ui.m)localObject).pPG);
          b.this.qmv.a(paramAnonymousView, ((com.tencent.mm.plugin.sns.storage.m)localObject).blY(), ((com.tencent.mm.plugin.sns.storage.m)localObject).blD());
          GMTrace.o(18570096410624L, 138358);
          return true;
        }
        GMTrace.o(18570096410624L, 138358);
        return false;
      }
    };
    this.qmP = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(18569693757440L, 138355);
        w.d("MicroMsg.TimelineClickListener", "v " + paramAnonymousView.getId() + "  ");
        b.this.cz(paramAnonymousView);
        GMTrace.o(18569693757440L, 138355);
        return false;
      }
    };
    this.qmQ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8655969714176L, 64492);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.as))
        {
          paramAnonymousView = (com.tencent.mm.plugin.sns.ui.as)paramAnonymousView.getTag();
          paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bjd().Ir(paramAnonymousView.eUg);
          if (paramAnonymousView == null)
          {
            GMTrace.o(8655969714176L, 64492);
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("sns_text_show", paramAnonymousView.blD().uTZ);
          localIntent.putExtra("sns_local_id", paramAnonymousView.blY());
          localIntent.setClass(b.this.activity, SnsSingleTextViewUI.class);
          b.this.activity.startActivity(localIntent);
        }
        GMTrace.o(8655969714176L, 64492);
      }
    };
    this.qmT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18569022668800L, 138350);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.r))
        {
          com.tencent.mm.plugin.sns.ui.r localr = (com.tencent.mm.plugin.sns.ui.r)paramAnonymousView.getTag();
          Object localObject = (anu)localr.pRY.uUc.ueW.get(0);
          String str1 = localr.eEM;
          com.tencent.mm.plugin.sns.model.ae.bjd().Ir(str1);
          str1 = "";
          String str3 = com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), ((anu)localObject).mmR);
          String str2 = "";
          String str4 = i.j((anu)localObject);
          if (FileOp.aZ(str3 + str4))
          {
            str1 = str3 + str4;
            str2 = str3 + i.e((anu)localObject);
          }
          if (FileOp.aZ(str3 + i.p((anu)localObject)))
          {
            str1 = str3 + i.p((anu)localObject);
            str2 = str3 + i.n((anu)localObject);
          }
          localObject = new int[2];
          paramAnonymousView.getLocationInWindow((int[])localObject);
          int i = paramAnonymousView.getWidth();
          int j = paramAnonymousView.getHeight();
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(b.this.activity, SnsOnlineVideoActivity.class);
          paramAnonymousView.putExtra("intent_videopath", str1);
          paramAnonymousView.putExtra("intent_thumbpath", str2);
          paramAnonymousView.putExtra("intent_localid", localr.eEM);
          paramAnonymousView.putExtra("intent_isad", false);
          paramAnonymousView.putExtra("intent_from_scene", b.this.scene);
          paramAnonymousView.putExtra("img_gallery_left", localObject[0]);
          paramAnonymousView.putExtra("img_gallery_top", localObject[1]);
          paramAnonymousView.putExtra("img_gallery_width", i);
          paramAnonymousView.putExtra("img_gallery_height", j);
          b.this.activity.startActivity(paramAnonymousView);
          b.this.activity.overridePendingTransition(0, 0);
          b.this.h(localr.pRY);
        }
        GMTrace.o(18569022668800L, 138350);
      }
    };
    this.qmS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8654761754624L, 64483);
        w.i("MicroMsg.TimelineClickListener", "onsight click");
        if (!(paramAnonymousView.getTag() instanceof ak))
        {
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        final ak localak = (ak)paramAnonymousView.getTag();
        final com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(localak.eEM);
        if (localm == null)
        {
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        if (b.this.pPx != null) {
          b.this.pPx.biI().v(localm);
        }
        final boolean bool = localm.uX(32);
        if ((bool) && (localm.blz() != null) && (localm.blz().pDs == 1))
        {
          b.this.qna.onClick(paramAnonymousView);
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        final biz localbiz = localak.pWB;
        if ((localbiz.uUc.ueW == null) || (localbiz.uUc.ueW.size() == 0))
        {
          w.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        final anu localanu = (anu)localbiz.uUc.ueW.get(0);
        Object localObject1;
        if (bool)
        {
          com.tencent.mm.plugin.sns.model.ae.bja();
          if (!com.tencent.mm.plugin.sns.model.g.t(localanu))
          {
            localak.pIr.setVisibility(8);
            localak.pWE.setVisibility(0);
            localak.pWE.cjf();
            com.tencent.mm.plugin.sns.model.ae.bja().y(localanu);
            paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.biY();
            localObject1 = an.bTq();
            ((an)localObject1).time = localbiz.nFd;
            paramAnonymousView.a(localanu, 4, null, (an)localObject1);
            if (bool) {
              com.tencent.mm.plugin.sns.a.b.j.a(j.b.pok, j.a.pob, localm);
            }
            GMTrace.o(8654761754624L, 64483);
            return;
          }
        }
        if ((localm.uX(32)) && (localm.blz().pCp) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(localm.bmj().field_adxml))) {}
        Object localObject2;
        for (int i = 1; (i == 0) && (bool) && (com.tencent.mm.plugin.sns.model.ae.bja().u(localanu)); i = 0)
        {
          com.tencent.mm.plugin.sns.model.ae.bja().y(localanu);
          localak.pIr.setVisibility(8);
          localak.pWE.setVisibility(8);
          paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bja();
          localObject1 = localak.oUt;
          i = b.this.activity.hashCode();
          j = localak.position;
          localObject2 = an.bTq();
          ((an)localObject2).time = localbiz.nFd;
          paramAnonymousView.a(localm, localanu, (com.tencent.mm.plugin.sight.decode.a.a)localObject1, i, j, (an)localObject2, bool);
          if (bool) {
            com.tencent.mm.plugin.sns.a.b.j.a(j.b.pok, j.a.pob, localm);
          }
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        com.tencent.mm.modelsns.b localb;
        if (b.this.scene == 0)
        {
          localObject1 = com.tencent.mm.modelsns.b.ha(717);
          ((com.tencent.mm.modelsns.b)localObject1).lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32)).lu(localm.bmi()).lu(localanu.mmR);
          ((com.tencent.mm.modelsns.b)localObject1).LR();
          if (b.this.scene != 0) {
            break label1166;
          }
          localb = com.tencent.mm.modelsns.b.ha(745);
          label587:
          localb.lu(i.g(localm)).hd(localm.field_type).bC(localm.uX(32));
          if (bool)
          {
            if (b.this.scene != 0) {
              break label1177;
            }
            i = 1;
            label633:
            localObject1 = localm.bmh();
            if ((!localm.uX(32)) || (!localm.blz().pCp)) {
              break label1182;
            }
          }
        }
        Object localObject3;
        label1166:
        label1177:
        label1182:
        for (int j = 21;; j = 17)
        {
          localObject1 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject1, j, i, "", localm.bmm(), localm.blE());
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a((k)localObject1, 0);
          if ((!localm.blz().pCp) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(localm.bmj().field_adxml))) {
            com.tencent.mm.plugin.sns.a.b.j.a(j.b.pok, j.a.poc, localm);
          }
          localObject2 = "";
          localObject3 = com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), localanu.mmR);
          localObject1 = "";
          String str = i.j(localanu);
          if (FileOp.aZ((String)localObject3 + str))
          {
            localObject2 = (String)localObject3 + str;
            localObject1 = (String)localObject3 + i.e(localanu);
          }
          if (FileOp.aZ((String)localObject3 + i.p(localanu)))
          {
            localObject2 = (String)localObject3 + i.p(localanu);
            localObject1 = (String)localObject3 + i.n(localanu);
          }
          localObject3 = new int[2];
          paramAnonymousView.getLocationInWindow((int[])localObject3);
          i = paramAnonymousView.getWidth();
          j = paramAnonymousView.getHeight();
          com.tencent.mm.plugin.report.service.g.ork.i(11444, new Object[] { Integer.valueOf(3) });
          if (bool) {
            break label1188;
          }
          w.i("MicroMsg.TimelineClickListener", "it not ad video, use online video activity to play.");
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(b.this.activity, SnsOnlineVideoActivity.class);
          paramAnonymousView.putExtra("intent_videopath", (String)localObject2);
          paramAnonymousView.putExtra("intent_thumbpath", (String)localObject1);
          paramAnonymousView.putExtra("intent_localid", localak.eEM);
          paramAnonymousView.putExtra("intent_isad", bool);
          paramAnonymousView.putExtra("intent_from_scene", b.this.scene);
          paramAnonymousView.putExtra("img_gallery_left", localObject3[0]);
          paramAnonymousView.putExtra("img_gallery_top", localObject3[1]);
          paramAnonymousView.putExtra("img_gallery_width", i);
          paramAnonymousView.putExtra("img_gallery_height", j);
          localb.b(paramAnonymousView, "intent_key_StatisticsOplog");
          b.this.activity.startActivity(paramAnonymousView);
          b.this.activity.overridePendingTransition(0, 0);
          b.this.h(localm.blD());
          GMTrace.o(8654761754624L, 64483);
          return;
          localObject1 = com.tencent.mm.modelsns.b.hb(717);
          break;
          localb = com.tencent.mm.modelsns.b.hb(745);
          break label587;
          i = 2;
          break label633;
        }
        label1188:
        if ((localm.uX(32)) && (localm.blz().pCp) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(localm.bmj().field_adxml)))
        {
          paramAnonymousView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(localm);
          if (!bg.nm(paramAnonymousView)) {
            localm.bmj().field_adxml = paramAnonymousView;
          }
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("img_gallery_left", localObject3[0]);
          paramAnonymousView.putExtra("img_gallery_top", localObject3[1]);
          paramAnonymousView.putExtra("img_gallery_width", i);
          paramAnonymousView.putExtra("img_gallery_height", j);
          paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", localm.blE());
          paramAnonymousView.putExtra("sns_landing_pages_ux_info", localm.bmi());
          localObject1 = localm.blD();
          if (localObject1 != null)
          {
            localObject1 = ((biz)localObject1).uUc.ueW;
            if (((List)localObject1).size() > 0) {
              paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject1).get(0)).uCO);
            }
          }
          paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
          if (b.this.scene == 0) {}
          for (i = 1;; i = 2)
          {
            paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
            paramAnonymousView.putExtra("sns_landing_pages_xml", localm.bmj().field_adxml);
            paramAnonymousView.putExtra("sns_landing_pages_rec_src", localm.bml());
            paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
            paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            paramAnonymousView.putExtra("sns_landing_is_native_sight_ad", true);
            b.this.activity.startActivity(paramAnonymousView);
            b.this.activity.overridePendingTransition(0, 0);
            GMTrace.o(8654761754624L, 64483);
            return;
          }
        }
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(b.this.activity, SnsSightPlayerUI.class);
        paramAnonymousView.putExtra("intent_videopath", (String)localObject2);
        paramAnonymousView.putExtra("intent_thumbpath", (String)localObject1);
        paramAnonymousView.putExtra("intent_localid", localak.eEM);
        paramAnonymousView.putExtra("intent_isad", bool);
        paramAnonymousView.putExtra("intent_from_scene", b.this.scene);
        paramAnonymousView.putExtra("img_gallery_left", localObject3[0]);
        paramAnonymousView.putExtra("img_gallery_top", localObject3[1]);
        paramAnonymousView.putExtra("img_gallery_width", i);
        paramAnonymousView.putExtra("img_gallery_height", j);
        localb.b(paramAnonymousView, "intent_key_StatisticsOplog");
        b.this.activity.startActivity(paramAnonymousView);
        b.this.activity.overridePendingTransition(0, 0);
        new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18568083144704L, 138343);
            if (com.tencent.mm.plugin.sns.model.ae.bja().u(localanu))
            {
              localak.oUt.ar(null, false);
              com.tencent.mm.plugin.sns.model.g localg = com.tencent.mm.plugin.sns.model.ae.bja();
              com.tencent.mm.plugin.sns.storage.m localm = localm;
              anu localanu = localanu;
              com.tencent.mm.plugin.sight.decode.a.a locala = localak.oUt;
              int i = b.this.activity.hashCode();
              int j = localak.position;
              an localan = an.bTq();
              localan.time = localbiz.nFd;
              localg.a(localm, localanu, locala, i, j, localan, bool);
              localak.pIr.setVisibility(0);
              localak.pWE.setVisibility(8);
              localak.pIr.setImageDrawable(com.tencent.mm.br.a.b(b.this.activity, i.i.cOK));
            }
            GMTrace.o(18568083144704L, 138343);
          }
        }, 500L);
        paramAnonymousView = new int[3];
        if ((!bool) && (com.tencent.mm.plugin.sns.model.ae.bja().a(localm, paramAnonymousView) > 5))
        {
          com.tencent.mm.plugin.sns.model.ae.bja().x(localanu);
          i = 1;
        }
        label2338:
        for (;;)
        {
          int n = paramAnonymousView[0];
          int i1 = paramAnonymousView[1];
          if (i == 2) {}
          for (int m = 1;; m = 0)
          {
            int i2 = paramAnonymousView[2];
            paramAnonymousView = localm.blD();
            localObject1 = new com.tencent.mm.modelsns.d();
            ((com.tencent.mm.modelsns.d)localObject1).q("20FeedId", paramAnonymousView.mmR + ",");
            ((com.tencent.mm.modelsns.d)localObject1).q("21AdUxInfo", localm.bmi() + ",");
            for (;;)
            {
              try
              {
                paramAnonymousView = (bfh)new bfh().aD(localm.field_attrBuf);
                if (paramAnonymousView.uRd == null) {
                  continue;
                }
                paramAnonymousView = (bfp)new bfp().aD(paramAnonymousView.uRd.uNP.tJp);
                if (paramAnonymousView.uRs == null) {
                  continue;
                }
                k = paramAnonymousView.uRs.ufI;
              }
              catch (Exception paramAnonymousView)
              {
                int k = 0;
                w.printErrStackTrace("MicroMsg.TimelineClickListener", paramAnonymousView, "", new Object[0]);
                j = 0;
                continue;
                if (com.tencent.mm.sdk.platformtools.am.is2G(ab.getContext()))
                {
                  i = 2;
                  continue;
                }
                if (com.tencent.mm.sdk.platformtools.am.is3G(ab.getContext()))
                {
                  i = 3;
                  continue;
                }
                if (!com.tencent.mm.sdk.platformtools.am.is4G(ab.getContext())) {
                  continue;
                }
                i = 4;
                continue;
                j = 0;
                k = 0;
                continue;
                i = 2;
              }
              try
              {
                j = paramAnonymousView.uRs.ufJ;
                ((com.tencent.mm.modelsns.d)localObject1).q("22LayerId", k + ",");
                ((com.tencent.mm.modelsns.d)localObject1).q("23ExpId", j + ",");
                ((com.tencent.mm.modelsns.d)localObject1).q("24ClickState", i + ",");
                ((com.tencent.mm.modelsns.d)localObject1).q("25ClickTime", bg.Pu() + ",");
                i = 0;
                if (!com.tencent.mm.sdk.platformtools.am.isWifi(ab.getContext())) {
                  continue;
                }
                i = 1;
                ((com.tencent.mm.modelsns.d)localObject1).q("26NetworkType", i + ",");
                ((com.tencent.mm.modelsns.d)localObject1).q("27IsFlowControl", n + ",");
                ((com.tencent.mm.modelsns.d)localObject1).q("28AutoDownloadSetting", i1 + ",");
                ((com.tencent.mm.modelsns.d)localObject1).q("29IsAutoPlay", m + ",");
                ((com.tencent.mm.modelsns.d)localObject1).q("30IsFlowControlDatePeriod", i2 + ",");
                w.i("MicroMsg.TimelineClickListener", "report SnsSightPreloadExp(sight_autodownload) logbuffer(13323): " + ((com.tencent.mm.modelsns.d)localObject1).LT());
                com.tencent.mm.plugin.report.service.g.ork.i(13323, new Object[] { localObject1 });
                GMTrace.o(8654761754624L, 64483);
                return;
              }
              catch (Exception paramAnonymousView) {}
            }
            if ((!bool) || (com.tencent.mm.plugin.sns.model.ae.bja().b(localm, paramAnonymousView) <= 5)) {
              break label2338;
            }
            com.tencent.mm.plugin.sns.model.ae.bja().x(localanu);
            i = 1;
            break;
          }
        }
      }
    };
    this.qmL = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(18569425321984L, 138353);
        if ((paramAnonymousView.getTag() instanceof ak))
        {
          paramAnonymousView = (ak)paramAnonymousView.getTag();
          if (!paramAnonymousView.poX) {
            paramAnonymousContextMenu.add(0, 19, 0, b.this.activity.getString(i.j.dgh));
          }
          if (bg.Sy(com.tencent.mm.k.g.ut().getValue("SIGHTCannotTransmitForFav")) != 0) {
            break label317;
          }
          if (paramAnonymousView.pWB.uUc.ueW.size() <= 0) {
            break label310;
          }
          paramAnonymousContextMenuInfo = (anu)paramAnonymousView.pWB.uUc.ueW.get(0);
          String str = paramAnonymousContextMenuInfo.mmR;
          str = com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), str) + i.e(paramAnonymousContextMenuInfo);
          paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ap.a(paramAnonymousView.eEM, paramAnonymousContextMenuInfo);
          boolean bool1 = FileOp.aZ(str);
          boolean bool2 = FileOp.aZ(paramAnonymousContextMenuInfo);
          w.i("MicroMsg.TimelineOnCreateContextMenuListener", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          if ((!bool1) || (!bool2)) {
            break label317;
          }
        }
        label310:
        label317:
        for (int i = 1;; i = 0)
        {
          if (com.tencent.mm.bj.d.LL("favorite")) {
            paramAnonymousContextMenu.add(0, 10, 0, b.this.activity.getString(i.j.dNH));
          }
          if (i != 0)
          {
            paramAnonymousContextMenuInfo = new dh();
            paramAnonymousContextMenuInfo.eEV.eEM = paramAnonymousView.eEM;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousContextMenuInfo);
            if (paramAnonymousContextMenuInfo.eEW.eEu) {
              paramAnonymousContextMenu.add(0, 18, 0, b.this.activity.getString(i.j.phO));
            }
          }
          GMTrace.o(18569425321984L, 138353);
          return;
          w.w("MicroMsg.TimelineOnCreateContextMenuListener", "sight item had not attch.");
        }
      }
      
      public final boolean cG(View paramAnonymousView)
      {
        GMTrace.i(18569559539712L, 138354);
        if ((paramAnonymousView.getTag() instanceof ak))
        {
          String str = ((ak)paramAnonymousView.getTag()).eEM;
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(str);
          b.this.qmv.a(paramAnonymousView, str, localm.blD());
          GMTrace.o(18569559539712L, 138354);
          return true;
        }
        GMTrace.o(18569559539712L, 138354);
        return false;
      }
    };
    this.qmU = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8656640802816L, 64497);
        b.this.cB(paramAnonymousView);
        if ((paramAnonymousView.getTag() == null) || (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
        {
          GMTrace.o(8656640802816L, 64497);
          return;
        }
        Object localObject = (com.tencent.mm.plugin.sns.data.b)paramAnonymousView.getTag();
        paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bjd().Is(((com.tencent.mm.plugin.sns.data.b)localObject).eEM);
        if (paramAnonymousView == null)
        {
          GMTrace.o(8656640802816L, 64497);
          return;
        }
        if (paramAnonymousView.uX(32))
        {
          ((com.tencent.mm.plugin.sns.data.b)localObject).ppa = System.currentTimeMillis();
          localObject = paramAnonymousView.bmh();
          if (b.this.scene != 0) {
            break label154;
          }
        }
        label154:
        for (int i = 1;; i = 2)
        {
          paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c((String)localObject, 20, i, "", paramAnonymousView.bmm(), paramAnonymousView.blE());
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
          GMTrace.o(8656640802816L, 64497);
          return;
        }
      }
    };
    this.qmG = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18567680491520L, 138340);
        w.i("MicroMsg.TimelineClickListener", "unlike click");
        com.tencent.mm.plugin.sns.data.b localb = (com.tencent.mm.plugin.sns.data.b)paramAnonymousView.getTag();
        com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(localb.eEM);
        if (localm == null)
        {
          GMTrace.o(18567680491520L, 138340);
          return;
        }
        if (localm.uX(32))
        {
          paramAnonymousView = localm.blB();
          if (paramAnonymousView == null)
          {
            paramAnonymousView = "";
            ((com.tencent.mm.plugin.sns.b.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sns.b.c.class)).a(11855, localm.bml(), new Object[] { Integer.valueOf(3), paramAnonymousView, Integer.valueOf(localm.bml()) });
          }
        }
        else
        {
          if (localb.poY.qjG.pCu.bjZ().size() <= 0) {
            break label230;
          }
        }
        label230:
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label235;
          }
          b.this.bmQ();
          paramAnonymousView = new a.b.a();
          paramAnonymousView.pCE = a.b.a.pCA;
          paramAnonymousView.ppa = localb.ppa;
          paramAnonymousView.pCF = 0L;
          paramAnonymousView = new com.tencent.mm.plugin.sns.model.q(localm.field_snsId, 8, paramAnonymousView);
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
          GMTrace.o(18567680491520L, 138340);
          return;
          paramAnonymousView = paramAnonymousView.hTy;
          break;
        }
        label235:
        b.this.bmR();
        paramAnonymousView = new a.b.a();
        paramAnonymousView.ppa = localb.ppa;
        paramAnonymousView.pCF = System.currentTimeMillis();
        paramAnonymousView = new com.tencent.mm.plugin.sns.model.q(localm.field_snsId, 8, paramAnonymousView);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
        GMTrace.o(18567680491520L, 138340);
      }
    };
    this.qmX = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20054276046848L, 149416);
        if ((paramAnonymousView.getTag() != null) && ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
        {
          paramAnonymousAdapterView = (com.tencent.mm.plugin.sns.data.b)paramAnonymousView.getTag();
          if (paramAnonymousInt < paramAnonymousAdapterView.poY.qjG.pCu.bjZ().size())
          {
            paramAnonymousView = (a.b.a)paramAnonymousAdapterView.poY.qjG.pCu.bjZ().get(paramAnonymousInt);
            w.i("MicroMsg.TimelineClickListener", "unlike item click, reason=%s, id=%s", new Object[] { paramAnonymousView.pCB, Integer.valueOf(paramAnonymousView.pCE) });
            com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousAdapterView.eEM);
            if (localm == null)
            {
              GMTrace.o(20054276046848L, 149416);
              return;
            }
            paramAnonymousView.ppa = paramAnonymousAdapterView.ppa;
            paramAnonymousView.pCF = System.currentTimeMillis();
            paramAnonymousAdapterView = new com.tencent.mm.plugin.sns.model.q(localm.field_snsId, 8, paramAnonymousView);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousAdapterView, 0);
            b.this.bmR();
          }
        }
        GMTrace.o(20054276046848L, 149416);
      }
    };
    this.qna = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20053739175936L, 149412);
        if ((paramAnonymousView.getTag() == null) || ((!(paramAnonymousView.getTag() instanceof a.c)) && (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) && (!(paramAnonymousView.getTag() instanceof ak)) && (!(paramAnonymousView.getTag() instanceof MaskImageView))))
        {
          GMTrace.o(20053739175936L, 149412);
          return;
        }
        Object localObject1;
        int i;
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
        {
          localObject1 = com.tencent.mm.plugin.sns.storage.h.Is(((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).eHy);
          if ((paramAnonymousView instanceof LinearLayout)) {
            i = 0;
          }
        }
        for (;;)
        {
          if ((localObject1 == null) || (!((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)))
          {
            GMTrace.o(20053739175936L, 149412);
            return;
            i = 1;
            continue;
            if ((paramAnonymousView.getTag() instanceof MaskImageView))
            {
              localObject1 = (MaskImageView)paramAnonymousView.getTag();
              if (!(((MaskImageView)localObject1).getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
                break label3450;
              }
              localObject1 = com.tencent.mm.plugin.sns.storage.h.Is(((com.tencent.mm.plugin.sns.ui.ap)((MaskImageView)localObject1).getTag()).eHy);
              if ((paramAnonymousView instanceof LinearLayout))
              {
                i = 0;
                continue;
              }
              i = 1;
            }
          }
        }
        for (;;)
        {
          break;
          if ((paramAnonymousView.getTag() instanceof ak))
          {
            localObject1 = (ak)paramAnonymousView.getTag();
            localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(((ak)localObject1).eEM);
            if ((paramAnonymousView instanceof LinearLayout))
            {
              i = 0;
              break;
            }
            i = 1;
            break;
          }
          localObject1 = com.tencent.mm.plugin.sns.storage.h.Ir(((a.c)paramAnonymousView.getTag()).eUg);
          i = 0;
          break;
          Object localObject4;
          Object localObject5;
          int j;
          for (;;)
          {
            try
            {
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blB();
              if (localObject2 != null) {
                continue;
              }
              localObject2 = "";
              localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().mmR;
              if (!((com.tencent.mm.plugin.sns.storage.m)localObject1).bkj())
              {
                localObject5 = com.tencent.mm.plugin.report.service.g.ork;
                if (b.this.scene != 0) {
                  continue;
                }
                j = 1;
                if (i == 0) {
                  continue;
                }
                i = 1;
                ((com.tencent.mm.plugin.report.service.g)localObject5).i(14066, new Object[] { Integer.valueOf(j), Integer.valueOf(i), localObject4, localObject2 });
              }
            }
            catch (Exception localException)
            {
              Object localObject2;
              w.e("MicroMsg.TimelineClickListener", "report click ad card style error " + localException.getMessage());
              continue;
              localObject4 = (ak)localException.qlW.pWD.getTag();
            }
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().blz().bkg())
            {
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().blz().bkc();
              localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi();
              com.tencent.mm.kernel.h.xw();
              localObject5 = com.tencent.mm.kernel.a.wx();
              u.e((String)localObject2, (String)localObject4, (String)localObject5, u.Y((String)localObject2, (String)localObject4, (String)localObject5), 0);
            }
            localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
            if ((((biz)localObject2).uUc.ueV != 15) || (((biz)localObject2).uUj == 1)) {
              break label2345;
            }
            w.i("MicroMsg.TimelineClickListener", "onsight click");
            localObject2 = null;
            if ((paramAnonymousView.getTag() instanceof ak)) {
              localObject2 = (ak)paramAnonymousView.getTag();
            }
            if (!(paramAnonymousView.getTag() instanceof a.c)) {
              break label3436;
            }
            localObject2 = (a.c)paramAnonymousView.getTag();
            if ((((a.c)localObject2).qlW.pWD.getTag() instanceof ak)) {
              continue;
            }
            GMTrace.o(20053739175936L, 149412);
            return;
            localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject2).hTy;
            continue;
            j = 2;
            continue;
            i = 2;
          }
          for (;;)
          {
            if (localObject1 == null)
            {
              GMTrace.o(20053739175936L, 149412);
              return;
            }
            if (b.this.pPx != null) {
              b.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject1);
            }
            boolean bool = ((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32);
            Object localObject6 = ((ak)localObject4).pWB;
            if ((((biz)localObject6).uUc.ueW == null) || (((biz)localObject6).uUc.ueW.size() == 0))
            {
              w.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
              GMTrace.o(20053739175936L, 149412);
              return;
            }
            localObject5 = (anu)((biz)localObject6).uUc.ueW.get(0);
            if (bool)
            {
              com.tencent.mm.plugin.sns.model.ae.bja();
              if (!com.tencent.mm.plugin.sns.model.g.t((anu)localObject5))
              {
                ((ak)localObject4).pIr.setVisibility(8);
                ((ak)localObject4).pWE.setVisibility(0);
                ((ak)localObject4).pWE.cjf();
                com.tencent.mm.plugin.sns.model.ae.bja().y((anu)localObject5);
                paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.biY();
                localObject3 = an.bTq();
                ((an)localObject3).time = ((biz)localObject6).nFd;
                paramAnonymousView.a((anu)localObject5, 4, null, (an)localObject3);
                if (bool) {
                  com.tencent.mm.plugin.sns.a.b.j.a(j.b.pok, j.a.pob, (com.tencent.mm.plugin.sns.storage.m)localObject1);
                }
                GMTrace.o(20053739175936L, 149412);
                return;
              }
            }
            if ((((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCp) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml))) {}
            for (i = 1; (i == 0) && (bool) && (com.tencent.mm.plugin.sns.model.ae.bja().u((anu)localObject5)); i = 0)
            {
              com.tencent.mm.plugin.sns.model.ae.bja().y((anu)localObject5);
              ((ak)localObject4).pIr.setVisibility(8);
              ((ak)localObject4).pWE.setVisibility(8);
              paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bja();
              localObject3 = ((ak)localObject4).oUt;
              i = b.this.activity.hashCode();
              j = ((ak)localObject4).position;
              localObject4 = an.bTq();
              ((an)localObject4).time = ((biz)localObject6).nFd;
              paramAnonymousView.a((com.tencent.mm.plugin.sns.storage.m)localObject1, (anu)localObject5, (com.tencent.mm.plugin.sight.decode.a.a)localObject3, i, j, (an)localObject4, bool);
              if (bool) {
                com.tencent.mm.plugin.sns.a.b.j.a(j.b.pok, j.a.pob, (com.tencent.mm.plugin.sns.storage.m)localObject1);
              }
              GMTrace.o(20053739175936L, 149412);
              return;
            }
            label1067:
            label1310:
            int k;
            if (b.this.scene == 0)
            {
              localObject4 = com.tencent.mm.modelsns.b.ha(717);
              ((com.tencent.mm.modelsns.b)localObject4).lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject1)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type).bC(((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)).lu(((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi()).lu(((anu)localObject5).mmR);
              ((com.tencent.mm.modelsns.b)localObject4).LR();
              if (b.this.scene != 0) {
                break label1737;
              }
              localObject4 = com.tencent.mm.modelsns.b.ha(745);
              ((com.tencent.mm.modelsns.b)localObject4).lu(i.g((com.tencent.mm.plugin.sns.storage.m)localObject1)).hd(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type).bC(((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32));
              localObject4 = com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), ((anu)localObject5).mmR);
              localObject6 = i.j((anu)localObject5);
              if (FileOp.aZ((String)localObject4 + (String)localObject6))
              {
                new StringBuilder().append((String)localObject4).append((String)localObject6);
                new StringBuilder().append((String)localObject4).append(i.e((anu)localObject5));
              }
              if (FileOp.aZ((String)localObject4 + i.p((anu)localObject5)))
              {
                new StringBuilder().append((String)localObject4).append(i.p((anu)localObject5));
                new StringBuilder().append((String)localObject4).append(i.n((anu)localObject5));
              }
              localObject4 = new int[2];
              if (localObject3 == null) {
                break label1748;
              }
              if (((a.c)localObject3).qlW.pWD != null) {
                ((a.c)localObject3).qlW.pWD.getLocationInWindow((int[])localObject4);
              }
              i = ((a.c)localObject3).qlW.pWD.getWidth();
              j = ((a.c)localObject3).qlW.pWD.getHeight();
              com.tencent.mm.plugin.report.service.g.ork.i(11444, new Object[] { Integer.valueOf(3) });
              if ((!((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)) || (!((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCp) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml))) {
                break label1832;
              }
              paramAnonymousView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject1);
              if (!bg.nm(paramAnonymousView)) {
                ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml = paramAnonymousView;
              }
              paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
              if (b.this.scene != 0) {
                break label1821;
              }
              k = 1;
              label1406:
              if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj() != null) {
                ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().getSource();
              }
              paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 22, k, "", 5, 21, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("img_gallery_left", localObject4[0]);
              paramAnonymousView.putExtra("img_gallery_top", localObject4[1]);
              paramAnonymousView.putExtra("img_gallery_width", i);
              paramAnonymousView.putExtra("img_gallery_height", j);
              paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
              paramAnonymousView.putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi());
              localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
              if (localObject3 != null)
              {
                localObject3 = ((biz)localObject3).uUc.ueW;
                if (((List)localObject3).size() > 0) {
                  paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject3).get(0)).uCO);
                }
              }
              paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
              if (b.this.scene != 0) {
                break label1827;
              }
            }
            label1737:
            label1748:
            label1821:
            label1827:
            for (i = 1;; i = 2)
            {
              paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
              paramAnonymousView.putExtra("sns_landing_pages_xml", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml);
              paramAnonymousView.putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bml());
              paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
              paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
              paramAnonymousView.putExtra("sns_landing_is_native_sight_ad", true);
              b.this.activity.startActivity(paramAnonymousView);
              b.this.activity.overridePendingTransition(0, 0);
              GMTrace.o(20053739175936L, 149412);
              return;
              localObject4 = com.tencent.mm.modelsns.b.hb(717);
              break;
              localObject4 = com.tencent.mm.modelsns.b.hb(745);
              break label1067;
              if ((paramAnonymousView.getTag() instanceof ak))
              {
                paramAnonymousView = (ak)paramAnonymousView.getTag();
                if (paramAnonymousView != null) {
                  paramAnonymousView.pWD.getLocationInWindow((int[])localObject4);
                }
                i = paramAnonymousView.pWD.getWidth();
                j = paramAnonymousView.pWD.getHeight();
                break label1310;
              }
              if (paramAnonymousView != null) {
                paramAnonymousView.getLocationInWindow((int[])localObject4);
              }
              i = paramAnonymousView.getWidth();
              j = paramAnonymousView.getHeight();
              break label1310;
              k = 2;
              break label1406;
            }
            label1832:
            paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
            if (b.this.scene == 0) {}
            for (i = 1;; i = 2)
            {
              if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj() != null) {
                ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().getSource();
              }
              paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 22, i, "", 5, 0, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(paramAnonymousView, 0);
              localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmg();
              paramAnonymousView = (View)localObject3;
              if (bg.nm((String)localObject3)) {
                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmf();
              }
              if (!bg.nm(paramAnonymousView)) {
                break;
              }
              GMTrace.o(20053739175936L, 149412);
              return;
            }
            w.i("MicroMsg.TimelineClickListener", "adlink url " + paramAnonymousView + " " + ((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCH);
            Object localObject3 = new Intent();
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCH == 0)
            {
              bool = true;
              if (com.tencent.mm.platformtools.r.hks) {
                bool = false;
              }
              localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
              if (b.this.scene != 0) {
                break label2340;
              }
            }
            label2340:
            for (i = 1;; i = 2)
            {
              localObject4 = new SnsAdClick((String)localObject4, i, ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi(), 5, (byte)0);
              if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)))
              {
                localObject5 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blB();
                if (localObject5 != null) {
                  ((Intent)localObject3).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject5).hTy);
                }
              }
              ((Intent)localObject3).putExtra("KRightBtn", bool);
              localObject5 = new Bundle();
              ((Bundle)localObject5).putParcelable("KSnsAdTag", (Parcelable)localObject4);
              ((Bundle)localObject5).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh);
              ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject5);
              ((Intent)localObject3).putExtra("rawUrl", paramAnonymousView);
              ((Intent)localObject3).putExtra("useJs", true);
              ((Intent)localObject3).putExtra("srcUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject3).putExtra("stastic_scene", 15);
              ((Intent)localObject3).putExtra("KPublisherId", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject3).putExtra("pre_username", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject3).putExtra("prePublishId", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject3).putExtra("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject3, b.this.activity);
              GMTrace.o(20053739175936L, 149412);
              return;
              bool = false;
              break;
            }
            label2345:
            if (((((biz)localObject3).uUc.ueV == 1) && (((biz)localObject3).uUc.ueW.size() == 1)) || (((biz)localObject3).uUc.ueV == 7))
            {
              if ((paramAnonymousView.getTag() instanceof a.c))
              {
                paramAnonymousView = ((a.c)paramAnonymousView.getTag()).qlx.vk(0);
                if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
                  break label3411;
                }
                if ((!((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCp) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml))) {
                  break label2919;
                }
                localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
                if (b.this.scene != 0) {
                  break label2909;
                }
                i = 1;
                label2464:
                if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj() != null) {
                  ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().getSource();
                }
                localObject3 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject3, 22, i, "", 4, 21, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
                com.tencent.mm.kernel.h.xz();
                com.tencent.mm.kernel.h.xx().fYr.a((k)localObject3, 0);
                localObject3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject1);
                if (!bg.nm((String)localObject3)) {
                  ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml = ((String)localObject3);
                }
                localObject3 = new int[2];
                if (paramAnonymousView != null) {
                  paramAnonymousView.getLocationInWindow((int[])localObject3);
                }
                i = paramAnonymousView.getWidth();
                j = paramAnonymousView.getHeight();
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("img_gallery_left", localObject3[0]);
                paramAnonymousView.putExtra("img_gallery_top", localObject3[1]);
                paramAnonymousView.putExtra("img_gallery_width", i);
                paramAnonymousView.putExtra("img_gallery_height", j);
                paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
                paramAnonymousView.putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi());
                paramAnonymousView.putExtra("sns_landing_pages_aid", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmd());
                paramAnonymousView.putExtra("sns_landing_pages_traceid", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bme());
                localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD();
                if (localObject3 != null)
                {
                  localObject3 = ((biz)localObject3).uUc.ueW;
                  if (((List)localObject3).size() > 0) {
                    paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject3).get(0)).uCO);
                  }
                }
                paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                if (b.this.scene != 0) {
                  break label2914;
                }
              }
              label2909:
              label2914:
              for (i = 1;; i = 2)
              {
                paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
                paramAnonymousView.putExtra("sns_landing_pages_xml", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().field_adxml);
                paramAnonymousView.putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bml());
                paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
                paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                b.this.activity.startActivity(paramAnonymousView);
                b.this.activity.overridePendingTransition(0, 0);
                if (b.this.pPx != null) {
                  b.this.pPx.biI().v((com.tencent.mm.plugin.sns.storage.m)localObject1);
                }
                GMTrace.o(20053739175936L, 149412);
                return;
                if ((paramAnonymousView.getTag() instanceof MaskImageView))
                {
                  paramAnonymousView = (MaskImageView)paramAnonymousView.getTag();
                  break;
                }
                paramAnonymousView = (TagImageView)paramAnonymousView;
                break;
                i = 2;
                break label2464;
              }
              label2919:
              localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmg();
              paramAnonymousView = (View)localObject3;
              if (bg.nm((String)localObject3)) {
                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmf();
              }
              if (bg.nm(paramAnonymousView))
              {
                GMTrace.o(20053739175936L, 149412);
                return;
              }
              localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
              if (b.this.scene != 0) {
                break label3420;
              }
              i = 1;
              if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj() != null) {
                ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmj().getSource();
              }
              localObject3 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject3, 22, i, "", 4, 0, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh, ((com.tencent.mm.plugin.sns.storage.m)localObject1).blE());
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a((k)localObject3, 0);
              w.i("MicroMsg.TimelineClickListener", "adlink url " + paramAnonymousView + " " + ((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCH);
              localObject3 = new Intent();
              if (((com.tencent.mm.plugin.sns.storage.m)localObject1).blz().pCH != 0) {
                break label3425;
              }
              bool = true;
              label3105:
              if (com.tencent.mm.platformtools.r.hks) {
                bool = false;
              }
              localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmh();
              if (b.this.scene != 0) {
                break label3431;
              }
            }
            label3411:
            label3420:
            label3425:
            label3431:
            for (i = 1;; i = 2)
            {
              localObject4 = new SnsAdClick((String)localObject4, i, ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bmi(), 4, (byte)0);
              if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)))
              {
                localObject5 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blB();
                if (localObject5 != null) {
                  ((Intent)localObject3).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject5).hTy);
                }
              }
              ((Intent)localObject3).putExtra("KRightBtn", bool);
              localObject5 = new Bundle();
              ((Bundle)localObject5).putParcelable("KSnsAdTag", (Parcelable)localObject4);
              ((Bundle)localObject5).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().pTh);
              ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject5);
              ((Intent)localObject3).putExtra("rawUrl", paramAnonymousView);
              ((Intent)localObject3).putExtra("useJs", true);
              ((Intent)localObject3).putExtra("srcUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject3).putExtra("stastic_scene", 15);
              ((Intent)localObject3).putExtra("KPublisherId", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject3).putExtra("pre_username", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject3).putExtra("prePublishId", "sns_" + i.dt(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject3).putExtra("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              com.tencent.mm.plugin.sns.c.a.hnH.j((Intent)localObject3, b.this.activity);
              GMTrace.o(20053739175936L, 149412);
              return;
              i = 2;
              break;
              bool = false;
              break label3105;
            }
            label3436:
            localObject5 = null;
            localObject4 = localObject3;
            localObject3 = localObject5;
          }
          label3450:
          i = 0;
          localObject1 = null;
        }
      }
    };
    this.qmO = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(20054678700032L, 149419);
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        Object localObject;
        if ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.ui.r))
        {
          paramAnonymousContextMenuInfo = (com.tencent.mm.plugin.sns.ui.r)paramAnonymousContextMenuInfo;
          localObject = paramAnonymousContextMenuInfo.pRY;
          if (com.tencent.mm.bj.d.LL("favorite")) {
            switch (((biz)localObject).uUc.ueV)
            {
            default: 
              paramAnonymousContextMenu.add(0, 3, 0, paramAnonymousView.getContext().getString(i.j.dNH));
            }
          }
        }
        for (;;)
        {
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramAnonymousContextMenuInfo.eEM));
          GMTrace.o(20054678700032L, 149419);
          return;
          paramAnonymousContextMenu.add(0, 4, 0, paramAnonymousView.getContext().getString(i.j.dNH));
          localObject = new dh();
          ((dh)localObject).eEV.eEM = paramAnonymousContextMenuInfo.eEM;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          if (((dh)localObject).eEW.eEu)
          {
            paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.phO));
            continue;
            paramAnonymousContextMenu.add(0, 5, 0, paramAnonymousView.getContext().getString(i.j.dNH));
            continue;
            paramAnonymousContextMenu.add(0, 9, 0, paramAnonymousView.getContext().getString(i.j.dNH));
            continue;
            paramAnonymousContextMenu.add(0, 3, 0, paramAnonymousView.getContext().getString(i.j.dNH));
            localObject = new dh();
            ((dh)localObject).eEV.eEM = paramAnonymousContextMenuInfo.eEM;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            if (((dh)localObject).eEW.eEu)
            {
              paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.phO));
              continue;
              paramAnonymousContextMenu.add(0, 10, 0, paramAnonymousView.getContext().getString(i.j.dNH));
              continue;
              paramAnonymousContextMenu.add(0, 22, 0, paramAnonymousView.getContext().getString(i.j.dNH));
            }
          }
        }
      }
      
      public final boolean cG(View paramAnonymousView)
      {
        GMTrace.i(20054544482304L, 149418);
        Object localObject = paramAnonymousView.getTag();
        if ((localObject instanceof com.tencent.mm.plugin.sns.ui.r))
        {
          localObject = (com.tencent.mm.plugin.sns.ui.r)localObject;
          biz localbiz = ((com.tencent.mm.plugin.sns.ui.r)localObject).pRY;
          if ((localbiz.uUc.ueV == 10) || (localbiz.uUc.ueV == 17) || (localbiz.uUc.ueV == 22) || (localbiz.uUc.ueV == 23))
          {
            GMTrace.o(20054544482304L, 149418);
            return false;
          }
          b.this.qmv.a(paramAnonymousView, ((com.tencent.mm.plugin.sns.ui.r)localObject).eEM, localbiz);
          GMTrace.o(20054544482304L, 149418);
          return true;
        }
        GMTrace.o(20054544482304L, 149418);
        return false;
      }
    };
    this.qmm = new b.e()
    {
      public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
      {
        GMTrace.i(20053873393664L, 149413);
        if ((paramAnonymousb != null) && (paramAnonymousInt == 0)) {
          if (paramAnonymousb.oSc == null) {
            break label94;
          }
        }
        label94:
        for (paramAnonymousb = (View)paramAnonymousb.oSc.get();; paramAnonymousb = null)
        {
          if ((paramAnonymousb != null) && ((paramAnonymousb instanceof com.tencent.mm.plugin.sight.decode.a.a)))
          {
            paramAnonymousb = (com.tencent.mm.plugin.sight.decode.a.a)paramAnonymousb;
            paramAnonymousb.NE();
            if ((paramAnonymousb.bgl() != null) && ((paramAnonymousb.bgl() instanceof ak))) {
              paramAnonymousb.bgl();
            }
          }
          GMTrace.o(20053873393664L, 149413);
          return;
        }
      }
    };
    GMTrace.o(8652748488704L, 64468);
  }
  
  public static com.tencent.mm.plugin.sns.storage.m cF(View paramView)
  {
    GMTrace.i(18570901716992L, 138364);
    if ((paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
      paramView = com.tencent.mm.plugin.sns.storage.h.Is(((com.tencent.mm.plugin.sns.ui.ap)paramView.getTag()).eHy);
    }
    for (;;)
    {
      GMTrace.o(18570901716992L, 138364);
      return paramView;
      if ((paramView.getTag() instanceof MaskImageView))
      {
        paramView = (MaskImageView)paramView.getTag();
        if ((paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
          paramView = com.tencent.mm.plugin.sns.storage.h.Is(((com.tencent.mm.plugin.sns.ui.ap)paramView.getTag()).eHy);
        }
      }
      else
      {
        if ((paramView.getTag() instanceof ak))
        {
          paramView = (ak)paramView.getTag();
          paramView = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramView.eEM);
          continue;
        }
        paramView = com.tencent.mm.plugin.sns.storage.h.Ir(((a.c)paramView.getTag()).eUg);
        continue;
      }
      paramView = null;
    }
  }
  
  public final void a(View paramView, com.tencent.mm.plugin.sns.storage.m paramm, int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(21064667103232L, 156944);
    int i;
    label78:
    int j;
    if ((paramView.getTag() instanceof a.c))
    {
      paramView = ((a.c)paramView.getTag()).qlx.vk(0);
      if (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
        break label524;
      }
      if ((!paramm.blz().pCp) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(paramString))) {
        break label516;
      }
      Object localObject = paramm.bmh();
      if (this.scene != 0) {
        break label498;
      }
      i = 1;
      int k = paramm.bmm();
      if (!paramBoolean) {
        break label504;
      }
      j = 22;
      label93:
      if (paramm.bmj() != null) {
        paramm.bmj().getSource();
      }
      localObject = new com.tencent.mm.plugin.sns.a.b.c((String)localObject, paramInt, i, "", k, j, paramm.blD().pTh, paramm.blE());
      com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
      localObject = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(paramm);
      if (!bg.nm((String)localObject)) {
        paramm.bmj().field_adxml = ((String)localObject);
      }
      localObject = new int[2];
      paramView.getLocationInWindow((int[])localObject);
      paramInt = paramView.getWidth();
      i = paramView.getHeight();
      paramView = new Intent();
      paramView.putExtra("img_gallery_left", localObject[0]);
      paramView.putExtra("img_gallery_top", localObject[1]);
      paramView.putExtra("img_gallery_width", paramInt);
      paramView.putExtra("img_gallery_height", i);
      paramView.putExtra("sns_landing_pages_share_sns_id", paramm.blE());
      paramView.putExtra("sns_landing_pages_ux_info", paramm.bmi());
      paramView.putExtra("sns_landing_pages_aid", paramm.bmd());
      paramView.putExtra("sns_landing_pages_traceid", paramm.bme());
      localObject = paramm.blD();
      if (localObject != null)
      {
        localObject = ((biz)localObject).uUc.ueW;
        if (((List)localObject).size() > 0) {
          paramView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject).get(0)).uCO);
        }
      }
      paramView.setClass(this.activity, SnsAdNativeLandingPagesUI.class);
      if (this.scene != 0) {
        break label511;
      }
    }
    label498:
    label504:
    label511:
    for (paramInt = 1;; paramInt = 2)
    {
      paramView.putExtra("sns_landig_pages_from_source", paramInt);
      paramView.putExtra("sns_landing_pages_xml", paramString);
      paramView.putExtra("sns_landing_pages_rec_src", paramm.bml());
      paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
      paramView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
      this.activity.startActivity(paramView);
      this.activity.overridePendingTransition(0, 0);
      if (this.pPx != null) {
        this.pPx.biI().v(paramm);
      }
      GMTrace.o(21064667103232L, 156944);
      return;
      if ((paramView.getTag() instanceof MaskImageView))
      {
        paramView = (MaskImageView)paramView.getTag();
        break;
      }
      paramView = (TagImageView)paramView;
      break;
      i = 2;
      break label78;
      j = 21;
      break label93;
    }
    label516:
    w.e("MicroMsg.TimelineClickListener", "cardSelectLeftLsn invalid ad style");
    label524:
    GMTrace.o(21064667103232L, 156944);
  }
  
  public final boolean a(com.tencent.mm.plugin.sns.storage.a parama, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(16046400471040L, 119555);
    if ((parama != null) && (parama.pCc == 4) && (parama.pCt != null))
    {
      qi localqi = new qi();
      localqi.eUY.eAv = (i.dt(paramm.field_snsId) + ":" + parama.pyc + ":" + com.tencent.mm.plugin.sns.model.ae.biJ() + ":" + System.currentTimeMillis());
      localqi.eUY.userName = parama.pCt.eIH;
      localqi.eUY.eVc = bg.Sy(parama.pCt.aKw);
      localqi.eUY.eVa = parama.pCt.eAw;
      parama = localqi.eUY;
      if (this.scene == 0) {}
      for (int i = 1045;; i = 1046)
      {
        parama.scene = i;
        com.tencent.mm.sdk.b.a.vgX.m(localqi);
        GMTrace.o(16046400471040L, 119555);
        return true;
      }
    }
    GMTrace.o(16046400471040L, 119555);
    return false;
  }
  
  public final void aJx()
  {
    GMTrace.i(8654090665984L, 64478);
    a locala = this.qmv;
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(218, locala);
    GMTrace.o(8654090665984L, 64478);
  }
  
  public final void art()
  {
    GMTrace.i(8654224883712L, 64479);
    a locala = this.qmv;
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(218, locala);
    GMTrace.o(8654224883712L, 64479);
  }
  
  public final void b(View paramView, com.tencent.mm.plugin.sns.storage.m paramm, int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(21064801320960L, 156945);
    Object localObject = null;
    if ((paramView.getTag() instanceof ak)) {
      localObject = (ak)paramView.getTag();
    }
    a.c localc;
    if ((paramView.getTag() instanceof a.c))
    {
      localc = (a.c)paramView.getTag();
      if (!(localc.qlW.pWD.getTag() instanceof ak))
      {
        GMTrace.o(21064801320960L, 156945);
        return;
      }
      localObject = (ak)localc.qlW.pWD.getTag();
    }
    for (;;)
    {
      if ((paramm == null) || (localObject == null))
      {
        GMTrace.o(21064801320960L, 156945);
        return;
      }
      if (this.pPx != null) {
        this.pPx.biI().v(paramm);
      }
      boolean bool = paramm.uX(32);
      biz localbiz = ((ak)localObject).pWB;
      if ((localbiz.uUc.ueW == null) || (localbiz.uUc.ueW.size() == 0))
      {
        w.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
        GMTrace.o(21064801320960L, 156945);
        return;
      }
      anu localanu = (anu)localbiz.uUc.ueW.get(0);
      if (bool)
      {
        com.tencent.mm.plugin.sns.model.ae.bja();
        if (!com.tencent.mm.plugin.sns.model.g.t(localanu))
        {
          ((ak)localObject).pIr.setVisibility(8);
          ((ak)localObject).pWE.setVisibility(0);
          ((ak)localObject).pWE.cjf();
          com.tencent.mm.plugin.sns.model.ae.bja().y(localanu);
          paramView = com.tencent.mm.plugin.sns.model.ae.biY();
          paramm = an.bTq();
          paramm.time = localbiz.nFd;
          paramView.a(localanu, 4, null, paramm);
          GMTrace.o(21064801320960L, 156945);
          return;
        }
      }
      if ((paramm.uX(32)) && (paramm.blz().pCp) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(paramString))) {}
      for (int i = 1; (i == 0) && (bool) && (com.tencent.mm.plugin.sns.model.ae.bja().u(localanu)); i = 0)
      {
        com.tencent.mm.plugin.sns.model.ae.bja().y(localanu);
        ((ak)localObject).pIr.setVisibility(8);
        ((ak)localObject).pWE.setVisibility(8);
        paramView = com.tencent.mm.plugin.sns.model.ae.bja();
        paramString = ((ak)localObject).oUt;
        paramInt = this.activity.hashCode();
        i = ((ak)localObject).position;
        localObject = an.bTq();
        ((an)localObject).time = localbiz.nFd;
        paramView.a(paramm, localanu, paramString, paramInt, i, (an)localObject, bool);
        GMTrace.o(21064801320960L, 156945);
        return;
      }
      localObject = new int[2];
      int j;
      int k;
      label571:
      int m;
      if (localc != null)
      {
        if (localc.qlW.pWD != null) {
          localc.qlW.pWD.getLocationInWindow((int[])localObject);
        }
        j = localc.qlW.pWD.getWidth();
        i = localc.qlW.pWD.getHeight();
        if ((!paramm.uX(32)) || (!paramm.blz().pCp) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Im(paramString))) {
          break label987;
        }
        paramView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(paramm);
        if (!bg.nm(paramView)) {
          paramm.bmj().field_adxml = paramView;
        }
        paramView = paramm.bmh();
        if (this.scene == 0)
        {
          k = 1;
          int n = paramm.bmm();
          if (!paramBoolean) {
            break label975;
          }
          m = 22;
          label586:
          if (paramm.bmj() != null) {
            paramm.bmj().getSource();
          }
          paramView = new com.tencent.mm.plugin.sns.a.b.c(paramView, paramInt, k, "", n, m, paramm.blD().pTh, paramm.blE());
          com.tencent.mm.kernel.h.xx().fYr.a(paramView, 0);
          paramView = new Intent();
          paramView.putExtra("img_gallery_left", localObject[0]);
          paramView.putExtra("img_gallery_top", localObject[1]);
          paramView.putExtra("img_gallery_width", j);
          paramView.putExtra("img_gallery_height", i);
          paramView.putExtra("sns_landing_pages_share_sns_id", paramm.blE());
          paramView.putExtra("sns_landing_pages_ux_info", paramm.bmi());
          localObject = paramm.blD();
          if (localObject != null)
          {
            localObject = ((biz)localObject).uUc.ueW;
            if (((List)localObject).size() > 0) {
              paramView.putExtra("sns_landing_pages_share_thumb_url", ((anu)((List)localObject).get(0)).uCO);
            }
          }
          paramView.setClass(this.activity, SnsAdNativeLandingPagesUI.class);
          if (this.scene != 0) {
            break label982;
          }
          paramInt = 1;
          label793:
          paramView.putExtra("sns_landig_pages_from_source", paramInt);
          paramView.putExtra("sns_landing_pages_xml", paramString);
          paramView.putExtra("sns_landing_pages_rec_src", paramm.bml());
          paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
          paramView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
          paramView.putExtra("sns_landing_is_native_sight_ad", true);
          this.activity.startActivity(paramView);
          this.activity.overridePendingTransition(0, 0);
          GMTrace.o(21064801320960L, 156945);
        }
      }
      else if ((paramView.getTag() instanceof ak))
      {
        paramView = (ak)paramView.getTag();
        if (paramView == null) {
          break label1014;
        }
        paramView.pWD.getLocationInWindow((int[])localObject);
        i = paramView.pWD.getWidth();
        j = paramView.pWD.getHeight();
      }
      for (;;)
      {
        k = i;
        i = j;
        j = k;
        break;
        if (paramView != null)
        {
          paramView.getLocationInWindow((int[])localObject);
          j = paramView.getWidth();
          i = paramView.getHeight();
          break;
          k = 2;
          break label571;
          label975:
          m = 21;
          break label586;
          label982:
          paramInt = 2;
          break label793;
          label987:
          w.e("MicroMsg.TimelineClickListener", "cardSelectLeftLsn invalid ad style");
          GMTrace.o(21064801320960L, 156945);
          return;
        }
        i = 0;
        j = 0;
        break;
        label1014:
        j = 0;
        i = 0;
      }
      localc = null;
    }
  }
  
  public abstract void bmP();
  
  public abstract void bmQ();
  
  public abstract void bmR();
  
  public abstract void bs(Object paramObject);
  
  public abstract void c(View paramView, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void cA(View paramView);
  
  public abstract void cB(View paramView);
  
  public abstract void cx(View paramView);
  
  public abstract void cy(View paramView);
  
  public abstract void cz(View paramView);
  
  public final void h(biz parambiz)
  {
    GMTrace.i(16631187111936L, 123912);
    if ((parambiz != null) && (parambiz.pwN != null) && (parambiz.pwN.tOK != null) && (com.tencent.mm.pluginsdk.model.app.g.bJ(parambiz.pwN.tOK.lQa)))
    {
      com.tencent.mm.protocal.c.as localas = parambiz.pwN;
      String str = com.tencent.mm.plugin.sns.c.a.hnI.bH(localas.tOK.lQa);
      com.tencent.mm.plugin.sns.c.a.hnI.a(this.activity, localas.tOK.lQa, str, parambiz.jhi, 38, 19, 10, localas.tOK.tOD, parambiz.mmR);
    }
    GMTrace.o(16631187111936L, 123912);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */