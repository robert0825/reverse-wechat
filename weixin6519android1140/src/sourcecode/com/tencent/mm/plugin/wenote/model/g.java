package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.r;
import com.tencent.mm.plugin.wenote.model.a.t;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
  extends c
  implements com.tencent.mm.ad.e
{
  public static HashMap<e, l> sbW;
  public boolean eON;
  public long eOS;
  public String sbT;
  public String sbU;
  public e sbV;
  private int sbX;
  private int sbY;
  public String sbZ;
  public int sca;
  public long scb;
  public String scc;
  public String scd;
  
  static
  {
    GMTrace.i(17243085733888L, 128471);
    sbW = new HashMap();
    GMTrace.o(17243085733888L, 128471);
  }
  
  public g()
  {
    GMTrace.i(17241072467968L, 128456);
    this.eOS = -1L;
    this.sbU = "";
    this.eON = true;
    this.sbX = 0;
    this.sbY = 0;
    this.sca = 0;
    this.scb = 0L;
    this.sbE.clear();
    this.sbD = null;
    sbJ = "";
    this.sbL = false;
    com.tencent.mm.pluginsdk.model.c.bJe();
    at.wS().a(426, this);
    GMTrace.o(17241072467968L, 128456);
  }
  
  private String NB(String paramString)
  {
    GMTrace.i(20647249969152L, 153834);
    Object localObject = f.ep(this.eOS);
    if (localObject == null)
    {
      paramString = ((com.tencent.mm.plugin.wenote.model.a.n)this.sbG.get(paramString)).lhq;
      GMTrace.o(20647249969152L, 153834);
      return paramString;
    }
    localObject = ((e)localObject).field_favProto.ulB.iterator();
    while (((Iterator)localObject).hasNext())
    {
      th localth = (th)((Iterator)localObject).next();
      if ((!bg.nm(localth.ukv)) && (localth.ukv.equals(paramString)))
      {
        paramString = localth.lhq;
        GMTrace.o(20647249969152L, 153834);
        return paramString;
      }
    }
    paramString = ((com.tencent.mm.plugin.wenote.model.a.n)this.sbG.get(paramString)).lhq;
    GMTrace.o(20647249969152L, 153834);
    return paramString;
  }
  
  public final void L(Context paramContext, int paramInt)
  {
    GMTrace.i(20646981533696L, 153832);
    Intent localIntent = new Intent();
    localIntent.putExtra("note_open_from_scene", paramInt);
    if (paramInt == 4)
    {
      localIntent.putExtra("fav_note_thumbpath", this.scc);
      localIntent.putExtra("fav_note_link_sns_xml", this.scd);
    }
    localIntent.putExtra("edit_status", this.sbL);
    localIntent.putExtra("show_share", this.eON);
    localIntent.putExtra("note_fav_localid", this.eOS);
    localIntent.putExtra("note_link_sns_localid", this.sbT);
    localIntent.putExtra("fav_note_xml", this.sbU);
    localIntent.putExtra("fav_note_scroll_to_position", this.sbX);
    localIntent.putExtra("fav_note_scroll_to_offset", this.sbY);
    localIntent.putExtra("fav_note_link_source_info", this.sbZ);
    localIntent.putExtra("note_fav_post_scene", this.sca);
    d.b(paramContext, "wenote", ".ui.nativenote.NoteEditorUI", localIntent);
    GMTrace.o(20646981533696L, 153832);
  }
  
  public final void Nv(String paramString)
  {
    GMTrace.i(17242414645248L, 128466);
    t localt = (t)this.sbG.get(paramString);
    Intent localIntent = new Intent();
    localIntent.putExtra("fav_open_from_wnnote", true);
    localIntent.putExtra("fav_note_xml", this.sbU);
    if (localt != null) {
      localIntent.putExtra("key_detail_data_id", NB(paramString));
    }
    localIntent.putExtra("key_detail_can_delete", false);
    localIntent.putExtra("key_detail_info_id", this.eOS);
    d.b(ab.getContext(), "favorite", ".ui.detail.FavoriteFileDetailUI", localIntent);
    GMTrace.o(17242414645248L, 128466);
  }
  
  public final void Nw(String paramString)
  {
    GMTrace.i(17242683080704L, 128468);
    paramString = (r)this.sbG.get(paramString);
    if (paramString == null)
    {
      h.bm(ab.getContext(), ab.getContext().getString(R.l.duy));
      GMTrace.o(17242683080704L, 128468);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("kwebmap_slat", paramString.lat);
    localIntent.putExtra("kwebmap_lng", paramString.lng);
    localIntent.putExtra("kPoiName", paramString.mzo);
    localIntent.putExtra("Kwebmap_locaion", paramString.gEy);
    if (paramString.sds >= 0.0D) {
      localIntent.putExtra("kwebmap_scale", paramString.sds);
    }
    localIntent.putExtra("kisUsername", "");
    localIntent.putExtra("kwebmap_from_to", true);
    localIntent.putExtra("KFavLocSigleView", true);
    localIntent.putExtra("map_view_type", 2);
    localIntent.putExtra("kFavInfoLocalId", this.eOS);
    localIntent.putExtra("kFavCanDel", false);
    localIntent.putExtra("kFavCanRemark", false);
    d.b(ab.getContext(), "location", ".ui.RedirectUI", localIntent);
    GMTrace.o(17242683080704L, 128468);
  }
  
  public final void Nx(String paramString)
  {
    GMTrace.i(17242548862976L, 128467);
    Intent localIntent = new Intent();
    localIntent.putExtra("fav_open_from_wnnote", true);
    localIntent.putExtra("fav_note_xml", this.sbU);
    if (this.sbG.get(paramString) != null) {
      localIntent.putExtra("key_detail_data_id", ((com.tencent.mm.plugin.wenote.model.a.n)this.sbG.get(paramString)).lhq);
    }
    localIntent.putExtra("key_detail_info_id", this.eOS);
    d.b(ab.getContext(), "favorite", ".ui.FavImgGalleryUI", localIntent);
    GMTrace.o(17242548862976L, 128467);
  }
  
  public final void Ny(String paramString)
  {
    GMTrace.i(17242951516160L, 128470);
    this.sbU = paramString;
    GMTrace.o(17242951516160L, 128470);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(17242817298432L, 128469);
    if (paramk.getType() == 426)
    {
      paramString = new ft();
      paramString.eIo.eEg = paramk;
      paramString.eIo.type = 31;
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
      if ((!bg.nm(paramString.eIp.path)) && (paramInt2 == 65101)) {
        w.e("MicroMsg.WNNoteFavProcess", "wenote conflict when commit");
      }
      at.wS().b(426, this);
      GMTrace.o(17242817298432L, 128469);
      return;
    }
    GMTrace.o(17242817298432L, 128469);
  }
  
  public final void a(long paramLong, Context paramContext, Boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(20646847315968L, 153831);
    this.eOS = paramLong;
    this.eON = paramBoolean.booleanValue();
    this.sbX = paramInt1;
    this.sbY = paramInt2;
    this.sbV = f.ep(this.eOS);
    if (this.sbV != null)
    {
      if (this.scb <= 0L) {
        this.scb = this.sbV.field_updateTime;
      }
      this.sbM = this.sbV.field_favProto;
      this.sbD = this.sbV;
    }
    if ((this.sca == 0) && (this.sbM.ulz != null)) {
      this.sca = this.sbM.ulz.eDi;
    }
    L(paramContext, 2);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17247112265728L, 128501);
        if (g.sbW.containsKey(g.this.sbV)) {
          g.this.sbC = ((l)g.sbW.get(g.this.sbV));
        }
        for (;;)
        {
          g.this.bW(g.this.sbC.ohD);
          if (com.tencent.mm.plugin.wenote.model.nativenote.manager.k.bHX() != null) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.k.bHX().sfs.jL(true);
          }
          GMTrace.o(17247112265728L, 128501);
          return;
          g.this.bGP();
        }
      }
      
      public final String toString()
      {
        GMTrace.i(17247246483456L, 128502);
        String str = super.toString() + "|dealWNoteInfo";
        GMTrace.o(17247246483456L, 128502);
        return str;
      }
    });
    GMTrace.o(20646847315968L, 153831);
  }
  
  public final void a(th paramth, String paramString)
  {
    GMTrace.i(17242011992064L, 128463);
    l locall = this.sbC;
    ft localft = new ft();
    localft.eIo.type = 28;
    localft.eIo.eDp = locall.scX.field_localId;
    localft.eIo.eIq = paramth;
    localft.eIo.path = paramString;
    localft.eIo.eIv = 18;
    com.tencent.mm.sdk.b.a.vgX.m(localft);
    GMTrace.o(17242011992064L, 128463);
  }
  
  public final String bGN()
  {
    GMTrace.i(20647115751424L, 153833);
    String str = this.sbU;
    GMTrace.o(20647115751424L, 153833);
    return str;
  }
  
  public final void bGP()
  {
    GMTrace.i(17241475121152L, 128459);
    this.sbC = new l();
    this.sbC.scX = this.sbV;
    this.sbC.eOS = this.eOS;
    this.sbC.aGU = 1;
    if ((this.sbV == null) || (this.sbV.field_favProto == null))
    {
      GMTrace.o(17241475121152L, 128459);
      return;
    }
    this.sbC.sdb = this.scb;
    this.sbC.ohD = this.sbV.field_favProto.ulB;
    sbW.put(this.sbV, this.sbC);
    GMTrace.o(17241475121152L, 128459);
  }
  
  public final String g(th paramth)
  {
    GMTrace.i(17241609338880L, 128460);
    paramth = f.n(paramth);
    GMTrace.o(17241609338880L, 128460);
    return paramth;
  }
  
  public final String h(th paramth)
  {
    GMTrace.i(17241743556608L, 128461);
    paramth = f.h(paramth);
    GMTrace.o(17241743556608L, 128461);
    return paramth;
  }
  
  public final void m(th paramth)
  {
    GMTrace.i(17241877774336L, 128462);
    l locall = this.sbC;
    ft localft = new ft();
    localft.eIo.type = 28;
    localft.eIo.eDp = locall.scX.field_localId;
    localft.eIo.eIq = paramth;
    localft.eIo.path = "";
    localft.eIo.eIv = 18;
    com.tencent.mm.sdk.b.a.vgX.m(localft);
    GMTrace.o(17241877774336L, 128462);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */