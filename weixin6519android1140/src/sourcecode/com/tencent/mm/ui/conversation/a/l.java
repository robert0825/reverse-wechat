package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelvideo.m.5;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l
  extends b
  implements s.a
{
  public ViewGroup oK;
  public Map<String, Long> wZW;
  public Map<Long, b> wZX;
  
  public l(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14510547009536L, 108112);
    this.wZW = new HashMap();
    this.wZX = new HashMap();
    o.Nh().a(this, Looper.getMainLooper());
    this.oK = ((ViewGroup)this.view);
    GMTrace.o(14510547009536L, 108112);
  }
  
  private void updateStatus()
  {
    GMTrace.i(14510949662720L, 108115);
    w.i("MicroMsg.MassSightBanner", "call update status");
    a locala = new a();
    locala.wZY = new WeakReference(this);
    at.xB().A(locala);
    GMTrace.o(14510949662720L, 108115);
  }
  
  public final void a(s.a.a parama)
  {
    GMTrace.i(14511083880448L, 108116);
    parama = parama.euR;
    Long localLong = (Long)this.wZW.get(parama);
    if (localLong == null)
    {
      w.d("MicroMsg.MassSightBanner", "massSendId is null, fileName %s", new Object[] { parama });
      if (bg.aq(parama, "").startsWith("DELETE_")) {
        updateStatus();
      }
      GMTrace.o(14511083880448L, 108116);
      return;
    }
    b localb = (b)this.wZX.get(localLong);
    if (localb == null)
    {
      w.d("MicroMsg.MassSightBanner", "find massSendId %d, but holder is null", new Object[] { localLong });
      GMTrace.o(14511083880448L, 108116);
      return;
    }
    r localr = t.mw(parama);
    if (localr == null)
    {
      w.w("MicroMsg.MassSightBanner", "on nofify changed, filename %s, massSendId %d, but videoinfo is null", new Object[] { parama, localLong });
      GMTrace.o(14511083880448L, 108116);
      return;
    }
    if (localr.status == 199)
    {
      w.i("MicroMsg.MassSightBanner", "fileName %s, massSendId %d, done", new Object[] { parama, localLong });
      updateStatus();
      GMTrace.o(14511083880448L, 108116);
      return;
    }
    c.a(localb, localr);
    GMTrace.o(14511083880448L, 108116);
  }
  
  public final void destroy()
  {
    GMTrace.i(14510815444992L, 108114);
    o.Nh().a(this);
    GMTrace.o(14510815444992L, 108114);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14510681227264L, 108113);
    int i = R.i.cBo;
    GMTrace.o(14510681227264L, 108113);
    return i;
  }
  
  private static final class a
    implements Runnable
  {
    WeakReference<l> wZY;
    
    public a()
    {
      GMTrace.i(14497125236736L, 108012);
      GMTrace.o(14497125236736L, 108012);
    }
    
    public final void run()
    {
      GMTrace.i(14497259454464L, 108013);
      List localList1 = o.Nh().Ny();
      List localList2 = o.Nh().Nz();
      Object localObject = (l)this.wZY.get();
      if (localObject == null)
      {
        w.w("MicroMsg.MassSightBanner", "try to load date, but banner ref is null");
        GMTrace.o(14497259454464L, 108013);
        return;
      }
      w.i("MicroMsg.MassSightBanner", "ViewCount %d, unfinish size %d, fail size %d", new Object[] { Integer.valueOf(((l)localObject).oK.getChildCount()), Integer.valueOf(localList1.size()), Integer.valueOf(localList2.size()) });
      if ((((l)localObject).oK.getChildCount() == 0) && (localList1.isEmpty()) && (localList2.isEmpty()))
      {
        GMTrace.o(14497259454464L, 108013);
        return;
      }
      localObject = new l.c();
      ((l.c)localObject).wZY = new WeakReference(this.wZY.get());
      ((l.c)localObject).xah = localList1;
      ((l.c)localObject).xai = localList2;
      af.t((Runnable)localObject);
      GMTrace.o(14497259454464L, 108013);
    }
  }
  
  private static final class b
  {
    ProgressBar ktM;
    long wZZ;
    boolean xaa;
    View xab;
    com.tencent.mm.plugin.sight.decode.a.a xac;
    ImageView xad;
    TextView xae;
    ImageButton xaf;
    
    public b()
    {
      GMTrace.i(14505983606784L, 108078);
      this.wZZ = 0L;
      this.xaa = false;
      this.xab = null;
      this.xac = null;
      this.xad = null;
      this.xae = null;
      this.ktM = null;
      this.xaf = null;
      GMTrace.o(14505983606784L, 108078);
    }
  }
  
  private static final class c
    implements Runnable
  {
    WeakReference<l> wZY;
    List<r> xah;
    List<r> xai;
    
    public c()
    {
      GMTrace.i(14502628163584L, 108053);
      GMTrace.o(14502628163584L, 108053);
    }
    
    private static int a(String paramString, l paraml, List<r> paramList, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(14502762381312L, 108054);
      Iterator localIterator = paramList.iterator();
      r localr;
      label195:
      l.b localb;
      for (;;)
      {
        if (localIterator.hasNext())
        {
          localr = (r)localIterator.next();
          paraml.wZW.put(localr.getFileName(), Long.valueOf(localr.haN));
          if (paraml.wZX.containsKey(Long.valueOf(localr.haN)))
          {
            w.d("MicroMsg.MassSightBanner", "%s: has contains massSendId %d, file %s", new Object[] { paramString, Long.valueOf(localr.haN), localr.getFileName() });
          }
          else if (paramInt1 < paramInt2)
          {
            paramList = paraml.oK;
            int i = paramInt1 + 1;
            paramList = paramList.getChildAt(paramInt1);
            w.d("MicroMsg.MassSightBanner", "%s: refresh view(%d/%d, hashCode %d) with massSendId %d", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramList.hashCode()), Long.valueOf(localr.haN) });
            paramInt1 = i;
            localb = (l.b)paramList.getTag();
            if (localb != null) {
              break label713;
            }
            localb = new l.b();
          }
        }
      }
      label444:
      label677:
      label713:
      for (;;)
      {
        String str1;
        if (localb.wZZ != localr.haN)
        {
          w.d("MicroMsg.MassSightBanner", "ashutest::mass send id not match! %d -> %d, totalCount %d", new Object[] { Long.valueOf(localb.wZZ), Long.valueOf(localr.haN), Integer.valueOf(paramInt3) });
          localb.wZZ = localr.haN;
          localb.xab = paramList;
          localb.xac = ((com.tencent.mm.plugin.sight.decode.a.a)paramList.findViewById(R.h.bHc));
          localb.xad = ((ImageView)paramList.findViewById(R.h.cfP));
          localb.ktM = ((ProgressBar)paramList.findViewById(R.h.progress));
          localb.xaf = ((ImageButton)paramList.findViewById(R.h.biN));
          localb.xae = ((TextView)paramList.findViewById(R.h.bHq));
          localb.xac.tW(paramList.getResources().getDimensionPixelSize(R.f.aQy));
          localb.xab.setTag(localb);
          localb.xaf.setTag(Long.valueOf(localb.wZZ));
          localb.xab.setOnClickListener(new l.b.1(localb));
          localb.xaf.setOnClickListener(new l.b.2(localb));
          o.Nh();
          str1 = s.mk(localr.getFileName());
          o.Nh();
          String str2 = s.ml(localr.getFileName());
          paramList = n.IZ().a(str2, com.tencent.mm.br.a.getDensity(paramList.getContext()), paramList.getContext());
          localb.xac.D(paramList);
          if (paramInt3 <= 3) {
            break label677;
          }
          localb.xac.clear();
          localb.xad.setVisibility(0);
        }
        for (;;)
        {
          a(localb, localr);
          paraml.wZX.put(Long.valueOf(localr.haN), localb);
          break;
          paramList = LayoutInflater.from(paraml.oK.getContext()).inflate(R.i.cBp, paraml.oK, false);
          paraml.oK.addView(paramList);
          w.d("MicroMsg.MassSightBanner", "%s: new view(%d/%d, hashCode %d) with massSendId %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramList.hashCode()), Long.valueOf(localr.haN) });
          break label195;
          w.d("MicroMsg.MassSightBanner", "ashutest::mass send id match! %d, totalCount %d", new Object[] { Long.valueOf(localb.wZZ), Integer.valueOf(paramInt3) });
          break label444;
          localb.xac.ar(str1, false);
          localb.xad.setVisibility(8);
        }
        GMTrace.o(14502762381312L, 108054);
        return paramInt1;
      }
    }
    
    public static void a(l.b paramb, r paramr)
    {
      boolean bool = true;
      GMTrace.i(14502896599040L, 108055);
      w.v("MicroMsg.MassSightBanner", "info status %d", new Object[] { Integer.valueOf(paramr.status) });
      if ((paramr.status == 198) || (paramr.status == 197) || (paramr.status == 196))
      {
        paramb.ktM.setVisibility(4);
        paramb.xae.setVisibility(0);
        paramb.xaf.setEnabled(true);
        paramb.xaa = true;
        GMTrace.o(14502896599040L, 108055);
        return;
      }
      float f = paramr.hbc / paramr.gsL;
      paramb.ktM.setVisibility(0);
      paramb.xae.setVisibility(4);
      paramb.ktM.setProgress((int)(paramb.ktM.getMax() * f));
      paramr = paramb.xaf;
      if (Float.compare(0.99F, f) > 0) {}
      for (;;)
      {
        paramr.setEnabled(bool);
        paramb.xaa = false;
        GMTrace.o(14502896599040L, 108055);
        return;
        bool = false;
      }
    }
    
    public final void run()
    {
      GMTrace.i(14503030816768L, 108056);
      l locall = (l)this.wZY.get();
      if (locall == null)
      {
        w.w("MicroMsg.MassSightBanner", "try to refresh, but banner ref is null");
        GMTrace.o(14503030816768L, 108056);
        return;
      }
      int k = locall.oK.getChildCount();
      locall.wZX.clear();
      HashSet localHashSet = new HashSet();
      Iterator localIterator = this.xah.iterator();
      while (localIterator.hasNext()) {
        localHashSet.add(Long.valueOf(((r)localIterator.next()).haN));
      }
      localIterator = this.xai.iterator();
      while (localIterator.hasNext()) {
        localHashSet.add(Long.valueOf(((r)localIterator.next()).haN));
      }
      int i = localHashSet.size();
      int j = a("update unfinish", locall, this.xah, 0, k, i);
      j = a("update fail", locall, this.xai, j, k, i);
      i = j;
      while (i < k)
      {
        locall.oK.removeViewAt(j);
        i += 1;
      }
      GMTrace.o(14503030816768L, 108056);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */