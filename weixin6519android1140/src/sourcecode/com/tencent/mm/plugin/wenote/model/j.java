package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.b;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.LinkedList;

public final class j
  extends c
{
  static HashMap<String, l> scx;
  private boolean eON;
  String ePw;
  com.tencent.mm.protocal.b.a.c oic;
  private int sbX;
  private int sbY;
  Long scv;
  private boolean scw;
  
  static
  {
    GMTrace.i(17245635870720L, 128490);
    scx = new HashMap();
    GMTrace.o(17245635870720L, 128490);
  }
  
  public j()
  {
    GMTrace.i(17244159475712L, 128479);
    this.oic = null;
    this.sbX = 0;
    this.sbY = 0;
    this.scw = false;
    this.sbE.clear();
    com.tencent.mm.pluginsdk.model.c.bJe();
    GMTrace.o(17244159475712L, 128479);
  }
  
  public final void Nv(String paramString)
  {
    GMTrace.i(17245233217536L, 128487);
    Intent localIntent = new Intent();
    localIntent.putExtra("message_id", this.scv);
    localIntent.putExtra("record_xml", this.ePw);
    localIntent.putExtra("record_data_id", ((n)this.sbG.get(paramString)).lhq);
    d.b(ab.getContext(), "record", ".ui.RecordMsgFileUI", localIntent);
    GMTrace.o(17245233217536L, 128487);
  }
  
  public final void Nw(String paramString)
  {
    String str = null;
    GMTrace.i(17245501652992L, 128489);
    Object localObject = ((n)this.sbG.get(paramString)).sdd;
    if (((th)localObject).ukn != null) {
      to localto = ((th)localObject).ukn.ukH;
    }
    for (localObject = ((th)localObject).ukn.ukF;; localObject = null)
    {
      if (localObject != null) {
        if (bg.nm(((tj)localObject).ulb)) {
          break label112;
        }
      }
      label112:
      for (str = com.tencent.mm.y.r.fs(((tj)localObject).ulb);; str = com.tencent.mm.y.r.fs(((tj)localObject).eMI))
      {
        paramString = (com.tencent.mm.plugin.wenote.model.a.r)this.sbG.get(paramString);
        if (paramString != null) {
          break;
        }
        h.bm(ab.getContext(), ab.getContext().getString(R.l.duy));
        GMTrace.o(17245501652992L, 128489);
        return;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("map_view_type", 2);
      ((Intent)localObject).putExtra("kwebmap_slat", paramString.lat);
      ((Intent)localObject).putExtra("kwebmap_lng", paramString.lng);
      ((Intent)localObject).putExtra("kPoiName", paramString.mzo);
      ((Intent)localObject).putExtra("Kwebmap_locaion", paramString.gEy);
      if (paramString.sds >= 0.0D) {
        ((Intent)localObject).putExtra("kwebmap_scale", paramString.sds);
      }
      ((Intent)localObject).putExtra("kisUsername", str);
      ((Intent)localObject).putExtra("kwebmap_from_to", true);
      ((Intent)localObject).putExtra("KFavLocSigleView", true);
      ((Intent)localObject).putExtra("kFavCanDel", false);
      ((Intent)localObject).putExtra("kFavCanRemark", false);
      d.b(ab.getContext(), "location", ".ui.RedirectUI", (Intent)localObject);
      GMTrace.o(17245501652992L, 128489);
      return;
    }
  }
  
  public final void Nx(String paramString)
  {
    GMTrace.i(17245367435264L, 128488);
    Intent localIntent = new Intent();
    localIntent.putExtra("message_id", this.scv);
    localIntent.putExtra("record_data_id", ((n)this.sbG.get(paramString)).lhq);
    localIntent.putExtra("record_xml", this.ePw);
    d.b(ab.getContext(), "record", ".ui.RecordMsgImageUI", localIntent);
    GMTrace.o(17245367435264L, 128488);
  }
  
  public final void a(th paramth, String paramString)
  {
    GMTrace.i(17244830564352L, 128484);
    mn localmn = new mn();
    localmn.eRu.type = 8;
    localmn.eRu.eIc = paramth;
    localmn.eRu.eDr = this.scv.longValue();
    localmn.eRu.eIy = paramString;
    com.tencent.mm.sdk.b.a.vgX.m(localmn);
    GMTrace.o(17244830564352L, 128484);
  }
  
  public final void a(String paramString, Long paramLong, boolean paramBoolean, Context paramContext, int paramInt1, int paramInt2)
  {
    GMTrace.i(20645773574144L, 153823);
    this.ePw = paramString;
    this.scv = paramLong;
    this.eON = paramBoolean;
    this.sbX = paramInt1;
    this.sbY = paramInt2;
    System.currentTimeMillis();
    paramLong = new mn();
    paramLong.eRu.type = 0;
    paramLong.eRu.eRw = paramString;
    com.tencent.mm.sdk.b.a.vgX.m(paramLong);
    this.oic = paramLong.eRv.eRE;
    if ((this.oic != null) && (this.oic.glr != null) && (this.oic.glr.size() > 1))
    {
      paramString = new mn();
      paramString.eRu.type = 9;
      paramString.eRu.eIc = ((th)this.oic.glr.get(0));
      paramString.eRu.eDr = this.scv.longValue();
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
      this.scw = paramString.eRv.eRG;
    }
    System.currentTimeMillis();
    paramString = new Intent();
    paramString.putExtra("note_open_from_scene", 1);
    paramString.putExtra("edit_status", this.sbL);
    paramString.putExtra("note_msgid", this.scv);
    paramString.putExtra("record_show_share", this.eON);
    paramString.putExtra("fav_note_xml", this.ePw);
    paramString.putExtra("fav_note_out_of_date", this.scw);
    paramString.putExtra("fav_note_scroll_to_position", this.sbX);
    paramString.putExtra("fav_note_scroll_to_offset", this.sbY);
    d.b(paramContext, "wenote", ".ui.nativenote.NoteEditorUI", paramString);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17240535597056L, 128452);
        j localj = j.this;
        if (j.scx.containsKey(localj.ePw)) {
          localj.sbC = ((l)j.scx.get(localj.ePw));
        }
        for (;;)
        {
          j.this.bW(j.this.sbC.ohD);
          if (k.bHX() != null) {
            k.bHX().sfs.jL(true);
          }
          GMTrace.o(17240535597056L, 128452);
          return;
          localj.sbC = new l();
          localj.sbC.eDr = localj.scv.longValue();
          localj.sbC.scY = localj.ePw;
          if ((localj.oic != null) && (localj.oic.glr != null))
          {
            if (localj.oic.tLX != null)
            {
              localj.sbC.sda = localj.oic.tLX.ulu;
              localj.sbC.scZ = localj.oic.tLX.ult;
              localj.sbC.sdb = localj.oic.tLY;
            }
            localj.sbC.ohD = localj.oic.glr;
            localj.sbC.aGU = 0;
            j.scx.put(localj.ePw, localj.sbC);
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(17240669814784L, 128453);
        String str = super.toString() + "|dealWNoteInfo";
        GMTrace.o(17240669814784L, 128453);
        return str;
      }
    });
    GMTrace.o(20645773574144L, 153823);
  }
  
  public final String g(th paramth)
  {
    GMTrace.i(17244427911168L, 128481);
    mn localmn = new mn();
    localmn.eRu.type = 1;
    localmn.eRu.eIc = paramth;
    localmn.eRu.eDr = this.scv.longValue();
    com.tencent.mm.sdk.b.a.vgX.m(localmn);
    paramth = localmn.eRv.eRF;
    GMTrace.o(17244427911168L, 128481);
    return paramth;
  }
  
  public final String h(th paramth)
  {
    GMTrace.i(17244562128896L, 128482);
    mn localmn = new mn();
    localmn.eRu.type = 1;
    localmn.eRu.eIc = paramth;
    localmn.eRu.eDr = this.scv.longValue();
    com.tencent.mm.sdk.b.a.vgX.m(localmn);
    paramth = localmn.eRv.eIy;
    GMTrace.o(17244562128896L, 128482);
    return paramth;
  }
  
  public final void m(th paramth)
  {
    GMTrace.i(17244696346624L, 128483);
    mn localmn = new mn();
    localmn.eRu.type = 8;
    localmn.eRu.eIc = paramth;
    localmn.eRu.eDr = this.scv.longValue();
    localmn.eRu.eIy = "";
    com.tencent.mm.sdk.b.a.vgX.m(localmn);
    GMTrace.o(17244696346624L, 128483);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */