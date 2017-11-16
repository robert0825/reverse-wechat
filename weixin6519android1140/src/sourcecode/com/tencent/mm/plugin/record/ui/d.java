package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d
  extends h
{
  private static HashMap<String, Boolean> ohF;
  public com.tencent.mm.sdk.b.c ohG;
  
  static
  {
    GMTrace.i(7521561477120L, 56040);
    ohF = new HashMap();
    GMTrace.o(7521561477120L, 56040);
  }
  
  public d(Context paramContext, h.a parama)
  {
    super(paramContext, parama);
    GMTrace.i(7521024606208L, 56036);
    this.ohG = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7521024606208L, 56036);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(7521158823936L, 56037);
    w.i("MicroMsg.FavRecordAdapter", "updateData localId %s,status %s", new Object[] { Long.valueOf(((b)parama).ohE.field_localId), Integer.valueOf(((b)parama).ohE.field_itemStatus) });
    this.ohV = parama;
    this.ohD.clear();
    this.ohD.addAll(parama.ohD);
    notifyDataSetChanged();
    GMTrace.o(7521158823936L, 56037);
  }
  
  public final void d(com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    GMTrace.i(7521293041664L, 56038);
    w.d("MicroMsg.FavRecordAdapter", "setupRecord %s", new Object[] { Long.valueOf(((b)this.ohV).ohE.field_localId) });
    paramb.aGU = 1;
    paramb.ohE = ((b)this.ohV).ohE;
    GMTrace.o(7521293041664L, 56038);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */