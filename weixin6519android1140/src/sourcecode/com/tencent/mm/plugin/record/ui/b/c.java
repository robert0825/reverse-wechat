package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.plugin.record.a.g;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.plugin.record.a.s;
import com.tencent.mm.plugin.record.ui.RecordMsgFileUI;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.c;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.Map;

public final class c
  implements h.b
{
  public static Map<String, View> oiM;
  private View.OnClickListener lgu;
  private h.a ohW;
  
  static
  {
    GMTrace.i(7548270804992L, 56239);
    oiM = new HashMap();
    GMTrace.o(7548270804992L, 56239);
  }
  
  public c(h.a parama)
  {
    GMTrace.i(7547599716352L, 56234);
    this.lgu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7549344546816L, 56247);
        com.tencent.mm.plugin.record.ui.a.b localb = (com.tencent.mm.plugin.record.ui.a.b)paramAnonymousView.getTag();
        Object localObject;
        if (localb.aGU == 0)
        {
          if (m.d(localb.eIc, localb.eDr))
          {
            w.i("MicroMsg.SightViewWrapper", "onclick: play sight");
            localObject = new Intent(paramAnonymousView.getContext(), RecordMsgFileUI.class);
            ((Intent)localObject).putExtra("message_id", localb.eDr);
            ((Intent)localObject).putExtra("record_xml", localb.eRw);
            ((Intent)localObject).putExtra("record_data_id", localb.eIc.lhq);
            paramAnonymousView.getContext().startActivity((Intent)localObject);
            GMTrace.o(7549344546816L, 56247);
            return;
          }
          localObject = m.d(localb.eIc.lhq, localb.eDr, true);
          g localg = s.baL().Fv((String)localObject);
          if (localg == null) {}
          for (localObject = "null";; localObject = Integer.valueOf(localg.field_status))
          {
            w.i("MicroMsg.SightViewWrapper", "onclick: cdnInfo status %s", new Object[] { localObject });
            if ((localg == null) || (2 == localg.field_status) || (3 == localg.field_status)) {
              break label256;
            }
            if (4 != localg.field_status) {
              break;
            }
            h.bm(paramAnonymousView.getContext(), paramAnonymousView.getResources().getString(R.l.duB));
            GMTrace.o(7549344546816L, 56247);
            return;
          }
          if ((localg.field_status == 0) || (1 == localg.field_status))
          {
            GMTrace.o(7549344546816L, 56247);
            return;
          }
          label256:
          m.a(localb.eIc, localb.eDr, true);
          GMTrace.o(7549344546816L, 56247);
          return;
        }
        if (localb.aGU == 1)
        {
          w.i("MicroMsg.SightViewWrapper", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(localb.ohE.field_id), Long.valueOf(localb.ohE.field_localId), Integer.valueOf(localb.ohE.field_itemStatus) });
          if (localb.ohE.isDone())
          {
            localObject = new ft();
            ((ft)localObject).eIo.type = 14;
            ((ft)localObject).eIo.eIq = localb.eIc;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            w.i("MicroMsg.SightViewWrapper", "favItemInfo is Done,file exist ret = %d", new Object[] { Integer.valueOf(((ft)localObject).eIp.ret) });
            if (((ft)localObject).eIp.ret == 1)
            {
              localObject = new Intent();
              ((Intent)localObject).putExtra("key_detail_info_id", localb.ohE.field_localId);
              ((Intent)localObject).putExtra("key_detail_data_id", localb.eIc.lhq);
              ((Intent)localObject).putExtra("key_detail_can_delete", false);
              d.b(paramAnonymousView.getContext(), "favorite", ".ui.detail.FavoriteFileDetailUI", (Intent)localObject);
              GMTrace.o(7549344546816L, 56247);
              return;
            }
            if (bg.nm(localb.eIc.ujt))
            {
              w.w("MicroMsg.SightViewWrapper", "favItemInfo getCdnDataUrl empty");
              GMTrace.o(7549344546816L, 56247);
              return;
            }
            w.w("MicroMsg.SightViewWrapper", "? info is done, source file not exist, cdn data url is not null");
          }
          for (;;)
          {
            paramAnonymousView = new ft();
            paramAnonymousView.eIo.eDp = localb.ohE.field_localId;
            if (!localb.ohE.axK()) {
              break;
            }
            w.w("MicroMsg.SightViewWrapper", "upload failed, try to restart...");
            paramAnonymousView.eIo.type = 15;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
            GMTrace.o(7549344546816L, 56247);
            return;
            if ((localb.ohE.axL()) || (localb.ohE.axK()))
            {
              w.i("MicroMsg.SightViewWrapper", "favItemInfo isDownLoadFaied or isUploadFailed, wait download");
            }
            else
            {
              if ((localb.ohE.isDownloading()) || (localb.ohE.axJ()))
              {
                w.i("MicroMsg.SightViewWrapper", "favItemInfo isDownloading or isUploadding, wait download");
                GMTrace.o(7549344546816L, 56247);
                return;
              }
              w.w("MicroMsg.SightViewWrapper", "other status, not done, downloading, uploading, downloadfail, uploadfail");
            }
          }
          w.w("MicroMsg.SightViewWrapper", "download failed, try to restart...");
          paramAnonymousView.eIo.type = 16;
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
        }
        GMTrace.o(7549344546816L, 56247);
      }
    };
    this.ohW = parama;
    GMTrace.o(7547599716352L, 56234);
  }
  
  public final void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    GMTrace.i(7547868151808L, 56236);
    paramView.setTag(paramb);
    paramView.setOnClickListener(this.lgu);
    com.tencent.mm.plugin.sight.decode.a.a locala = (com.tencent.mm.plugin.sight.decode.a.a)paramView.findViewById(R.h.image);
    ImageView localImageView = (ImageView)paramView.findViewById(R.h.cfI);
    MMPinProgressBtn localMMPinProgressBtn = (MMPinProgressBtn)paramView.findViewById(R.h.progress);
    locala.lx(paramInt);
    com.tencent.mm.plugin.record.ui.a.c localc1 = (com.tencent.mm.plugin.record.ui.a.c)paramb;
    paramb = this.ohW;
    Map localMap = oiM;
    h.a.c localc = new h.a.c();
    localc.eIc = localc1.eIc;
    if (localc1.aGU == 0)
    {
      localc.ohY = localc1.eDr;
      if (m.d(localc1.eIc, localc1.eDr))
      {
        localImageView.setVisibility(8);
        localMMPinProgressBtn.setVisibility(8);
        paramView = m.c(localc1.eIc, localc1.eDr);
        if (!paramView.equals(locala.NE())) {
          locala.D(paramb.a(localc));
        }
        locala.ar(paramView, false);
        GMTrace.o(7547868151808L, 56236);
        return;
      }
      paramView = m.d(localc1.eIc.lhq, localc1.eDr, true);
      paramView = s.baL().Fv(paramView);
      if ((paramView == null) || (2 == paramView.field_status)) {
        localImageView.setImageResource(R.k.cOK);
      }
      for (;;)
      {
        localImageView.setVisibility(0);
        localMMPinProgressBtn.setVisibility(8);
        locala.clear();
        locala.D(paramb.a(localc));
        GMTrace.o(7547868151808L, 56236);
        return;
        if ((3 == paramView.field_status) || (4 == paramView.field_status))
        {
          localImageView.setImageResource(R.g.ban);
        }
        else
        {
          if ((paramView.field_status == 0) || (1 == paramView.field_status))
          {
            localImageView.setVisibility(8);
            localMMPinProgressBtn.setVisibility(0);
            localMMPinProgressBtn.setProgress((int)(paramView.field_offset / Math.max(1, paramView.field_totalLen) * 100.0F));
            locala.clear();
            locala.D(paramb.a(localc));
            GMTrace.o(7547868151808L, 56236);
            return;
          }
          localImageView.setImageResource(R.k.cOK);
        }
      }
    }
    if (localc1.aGU == 1)
    {
      localMap.put(localc1.eIc.lhq, paramView);
      w.d("MicroMsg.SightRecordData", "dataId %s, status %s", new Object[] { Long.valueOf(localc1.ohE.field_localId), Integer.valueOf(localc1.ohE.field_itemStatus) });
      localc.ohY = localc1.ohE.field_localId;
      paramView = new ft();
      paramView.eIo.type = 14;
      paramView.eIo.eIq = localc1.eIc;
      com.tencent.mm.sdk.b.a.vgX.m(paramView);
      if ((!localc1.ohE.isDone()) && (paramView.eIp.ret != 1)) {
        break label762;
      }
      if (paramView.eIp.ret == 1)
      {
        localImageView.setVisibility(8);
        localMMPinProgressBtn.setVisibility(8);
        paramView.eIo.type = 2;
        com.tencent.mm.sdk.b.a.vgX.m(paramView);
        paramView = paramView.eIp.path;
        if (bg.nm(paramView))
        {
          w.w("MicroMsg.SightRecordData", "videoPath is null!");
          GMTrace.o(7547868151808L, 56236);
          return;
        }
        if (!paramView.equals(locala.NE())) {
          locala.D(paramb.a(localc));
        }
        locala.ar(paramView, false);
        GMTrace.o(7547868151808L, 56236);
        return;
      }
      if (!bg.nm(localc1.eIc.ujt)) {
        break label743;
      }
      localImageView.setImageResource(R.g.ban);
    }
    for (;;)
    {
      localImageView.setVisibility(0);
      localMMPinProgressBtn.setVisibility(8);
      locala.clear();
      locala.D(paramb.a(localc));
      GMTrace.o(7547868151808L, 56236);
      return;
      label743:
      w.w("MicroMsg.SightRecordData", "? info is done, source file not exist, cdn data url is not null");
      localImageView.setImageResource(R.k.cOK);
      continue;
      label762:
      if ((localc1.ohE.axL()) || (localc1.ohE.axK()))
      {
        localImageView.setImageResource(R.k.cOK);
      }
      else
      {
        if (localc1.ohE.isDownloading())
        {
          localImageView.setVisibility(8);
          localMMPinProgressBtn.setVisibility(0);
          localMMPinProgressBtn.cjf();
          locala.clear();
          locala.D(paramb.a(localc));
          GMTrace.o(7547868151808L, 56236);
          return;
        }
        w.w("MicroMsg.SightRecordData", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        localImageView.setImageResource(R.k.cOK);
      }
    }
  }
  
  public final View cZ(Context paramContext)
  {
    GMTrace.i(7547733934080L, 56235);
    View localView = View.inflate(paramContext, R.i.cEC, null);
    ((com.tencent.mm.plugin.sight.decode.a.a)localView.findViewById(R.h.image)).tW(com.tencent.mm.br.a.fromDPToPix(paramContext, 260));
    GMTrace.o(7547733934080L, 56235);
    return localView;
  }
  
  public final void destroy()
  {
    GMTrace.i(7548002369536L, 56237);
    this.ohW = null;
    GMTrace.o(7548002369536L, 56237);
  }
  
  public final void pause()
  {
    GMTrace.i(7548136587264L, 56238);
    GMTrace.o(7548136587264L, 56238);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */