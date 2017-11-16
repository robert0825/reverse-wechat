package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.qqmail.b.h.d;
import com.tencent.mm.plugin.qqmail.b.o;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.plugin.qqmail.b.y;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.protocal.c.blp;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
  implements e
{
  public int mode;
  private TextView nUA;
  private ImageView nUB;
  public ComposeUI nWd;
  public ViewGroup nWe;
  public Map<String, y> nWf;
  public Map<String, o> nWg;
  public Map<String, String> nWh;
  public Map<String, String> nWi;
  b nWj;
  private View.OnClickListener nWk;
  
  private b(ComposeUI paramComposeUI, TextView paramTextView, ImageView paramImageView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5558492987392L, 41414);
    this.nWf = new HashMap();
    this.nWg = new HashMap();
    this.nWh = new LinkedHashMap();
    this.nWi = new LinkedHashMap();
    this.nWj = null;
    this.nWk = null;
    this.mode = 5;
    this.nWd = paramComposeUI;
    this.nWe = paramViewGroup;
    this.nWk = null;
    this.nUA = paramTextView;
    this.nUB = paramImageView;
    aZe();
    at.wS().a(484, this);
    GMTrace.o(5558492987392L, 41414);
  }
  
  public b(ComposeUI paramComposeUI, TextView paramTextView, ImageView paramImageView, ViewGroup paramViewGroup, byte paramByte)
  {
    this(paramComposeUI, paramTextView, paramImageView, paramViewGroup);
    GMTrace.i(5558627205120L, 41415);
    GMTrace.o(5558627205120L, 41415);
  }
  
  private void a(final y paramy)
  {
    GMTrace.i(5559029858304L, 41418);
    final LinearLayout localLinearLayout = (LinearLayout)((ViewGroup)View.inflate(this.nWd, R.i.cDX, null)).findViewById(R.h.bTr);
    ImageView localImageView1 = (ImageView)localLinearLayout.findViewById(R.h.bTq);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(R.h.bTs);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(R.h.bTu);
    ProgressBar localProgressBar = (ProgressBar)localLinearLayout.findViewById(R.h.bTv);
    TextView localTextView3 = (TextView)localLinearLayout.findViewById(R.h.bTw);
    final ImageView localImageView2 = (ImageView)localLinearLayout.findViewById(R.h.bTt);
    ImageView localImageView3 = (ImageView)localLinearLayout.findViewById(R.h.bTp);
    ((ViewGroup)localLinearLayout.getParent()).removeView(localLinearLayout);
    localImageView1.setImageResource(FileExplorerUI.PE(paramy.name));
    localTextView1.setText(paramy.name);
    localTextView2.setText(bg.aF(paramy.size));
    a locala = new a();
    locala.iub = localImageView1;
    locala.jUm = localTextView1;
    locala.nVM = localTextView2;
    locala.nWt = localProgressBar;
    locala.nWu = localTextView3;
    locala.nWv = localImageView2;
    locala.nWw = localImageView3;
    localLinearLayout.setTag(locala);
    localLinearLayout.setId(Math.abs(paramy.path.hashCode() / 2));
    if (this.nWk != null) {
      localLinearLayout.setOnClickListener(this.nWk);
    }
    this.nWe.addView(localLinearLayout);
    aZe();
    localLinearLayout.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5521448894464L, 41138);
        if (localImageView2.getVisibility() == 0) {
          localImageView2.performClick();
        }
        GMTrace.o(5521448894464L, 41138);
      }
    });
    localImageView2.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5501316235264L, 40988);
        long l;
        if (b.this.mode == 5)
        {
          l = b.this.Ff(paramy.path);
          paramy.nTR = l;
          GMTrace.o(5501316235264L, 40988);
          return;
        }
        if (b.this.mode == 6)
        {
          l = b.this.dm(paramy.path, paramy.name);
          paramy.nTR = l;
        }
        GMTrace.o(5501316235264L, 40988);
      }
    });
    localImageView3.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5521180459008L, 41136);
        h.a(b.this.nWd, R.l.dNM, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(5545205432320L, 41315);
            y localy;
            if ((b.3.this.nWn.state == 0) || (b.3.this.nWn.state == 1))
            {
              paramAnonymous2DialogInterface = b.this;
              localy = b.3.this.nWn;
              if (paramAnonymous2DialogInterface.mode != 5) {
                break label212;
              }
              com.tencent.mm.plugin.qqmail.b.w.aYE().cancel(localy.nTR);
            }
            for (;;)
            {
              b.this.nWf.remove(b.3.this.nWn.path);
              b.this.nWg.remove(b.3.this.nWn.path);
              b.this.nWh.remove(b.3.this.nWn.path);
              b.this.nWi.remove(b.3.this.nWn.path);
              b.this.nWe.removeView(b.3.this.nWo);
              b.this.aZe();
              GMTrace.o(5545205432320L, 41315);
              return;
              label212:
              if (paramAnonymous2DialogInterface.mode == 6)
              {
                o localo = (o)paramAnonymous2DialogInterface.nWg.get(localy.path);
                if (localo != null) {
                  at.wS().c(localo);
                }
                paramAnonymous2DialogInterface.nWh.remove(localy.path);
                paramAnonymous2DialogInterface.nWi.remove(localy.path);
              }
            }
          }
        }, null);
        GMTrace.o(5521180459008L, 41136);
      }
    });
    this.nWe.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5564935438336L, 41462);
        b.this.b(paramy);
        GMTrace.o(5564935438336L, 41462);
      }
    });
    if (paramy.state == 0)
    {
      if (this.mode == 5)
      {
        paramy.nTR = Ff(paramy.path);
        GMTrace.o(5559029858304L, 41418);
        return;
      }
      if (this.mode == 6) {
        paramy.nTR = dm(paramy.path, paramy.name);
      }
    }
    GMTrace.o(5559029858304L, 41418);
  }
  
  public final long Ff(final String paramString)
  {
    GMTrace.i(5559566729216L, 41422);
    p.c localc = new p.c();
    localc.nTc = false;
    localc.nTb = true;
    p localp = com.tencent.mm.plugin.qqmail.b.w.aYE();
    p.a local5 = new p.a()
    {
      public final void onComplete()
      {
        GMTrace.i(5478230786048L, 40816);
        b.this.aZd();
        GMTrace.o(5478230786048L, 40816);
      }
      
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5478096568320L, 40815);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.FileUploadHelper", "errCode:%d, desc:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        paramAnonymousString = (y)b.this.nWf.get(paramString);
        if (paramAnonymousString != null)
        {
          paramAnonymousString.state = 3;
          b.this.b(paramAnonymousString);
        }
        if (paramAnonymousInt == -5)
        {
          b.this.nWd.nUI.a(new c.a()
          {
            public final void aYH()
            {
              GMTrace.i(5502792630272L, 40999);
              GMTrace.o(5502792630272L, 40999);
            }
            
            public final void aYI()
            {
              GMTrace.i(5502926848000L, 41000);
              GMTrace.o(5502926848000L, 41000);
            }
          });
          GMTrace.o(5478096568320L, 40815);
          return;
        }
        GMTrace.o(5478096568320L, 40815);
      }
      
      public final boolean onReady()
      {
        GMTrace.i(5477828132864L, 40813);
        y localy = (y)b.this.nWf.get(paramString);
        if (localy != null)
        {
          localy.state = 1;
          b.this.b(localy);
        }
        GMTrace.o(5477828132864L, 40813);
        return true;
      }
      
      public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(5477962350592L, 40814);
        paramAnonymousString = (String)paramAnonymousMap.get(".Response.result.DataID");
        paramAnonymousMap = (y)b.this.nWf.get(paramString);
        if (paramAnonymousMap != null)
        {
          paramAnonymousMap.state = 2;
          paramAnonymousMap.nTS = paramAnonymousString;
          b.this.b(paramAnonymousMap);
        }
        GMTrace.o(5477962350592L, 40814);
      }
    };
    long l = localp.a("/cgi-bin/uploaddata", 1, null, new h.d("UploadFile", paramString), localc, local5);
    GMTrace.o(5559566729216L, 41422);
    return l;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5560372035584L, 41428);
    if (paramk.getType() == 484)
    {
      paramString = (o)paramk;
      paramk = paramString.filePath;
      final y localy = (y)this.nWf.get(paramk);
      if ((localy != null) && ((paramInt1 != 0) || (paramInt2 != 0)))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.FileUploadHelper", "upload error, errType: %d, errCode: %d, file: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramk });
        localy.state = 3;
        this.nWg.remove(paramk);
        at.wS().c(paramString);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5486418067456L, 40877);
            b.this.b(localy);
            GMTrace.o(5486418067456L, 40877);
          }
        });
      }
    }
    GMTrace.o(5560372035584L, 41428);
  }
  
  public final String aYZ()
  {
    GMTrace.i(5559164076032L, 41419);
    String str1 = "";
    Iterator localIterator = this.nWf.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      String str2 = str1;
      if (str1.length() > 0) {
        str2 = str1 + "|";
      }
      str1 = str2 + ((y)this.nWf.get(str3)).nTS;
    }
    GMTrace.o(5559164076032L, 41419);
    return str1;
  }
  
  public final LinkedList<y> aZa()
  {
    GMTrace.i(5559298293760L, 41420);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.nWf.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(this.nWf.get(str));
    }
    GMTrace.o(5559298293760L, 41420);
    return localLinkedList;
  }
  
  public final void aZb()
  {
    GMTrace.i(5559432511488L, 41421);
    Iterator localIterator;
    Object localObject;
    if (this.mode == 5)
    {
      localIterator = this.nWf.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        localObject = (y)this.nWf.get(localObject);
        if (((y)localObject).state != 2)
        {
          com.tencent.mm.plugin.qqmail.b.w.aYE().cancel(((y)localObject).nTR);
          ((y)localObject).state = 3;
          b((y)localObject);
        }
      }
      GMTrace.o(5559432511488L, 41421);
      return;
    }
    if (this.mode == 6)
    {
      localIterator = this.nWf.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        localObject = (y)this.nWf.get(localObject);
        if (((y)localObject).state != 2)
        {
          o localo = (o)this.nWg.get(((y)localObject).path);
          if (localo != null)
          {
            at.wS().c(localo);
            ((y)localObject).state = 3;
            b((y)localObject);
          }
          this.nWh.remove(((y)localObject).path);
          this.nWi.remove(((y)localObject).path);
          this.nWg.remove(((y)localObject).path);
        }
      }
    }
    GMTrace.o(5559432511488L, 41421);
  }
  
  public final boolean aZc()
  {
    GMTrace.i(5559835164672L, 41424);
    Iterator localIterator = this.nWf.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (y)this.nWf.get(localObject);
      if ((((y)localObject).state != 2) && (((y)localObject).state != 3))
      {
        GMTrace.o(5559835164672L, 41424);
        return false;
      }
    }
    GMTrace.o(5559835164672L, 41424);
    return true;
  }
  
  public final void aZd()
  {
    GMTrace.i(16027341553664L, 119413);
    Object localObject1;
    Object localObject2;
    if (!aZc())
    {
      if (this.nWj != null)
      {
        localObject1 = this.nWj;
        this.nWf.size();
        localObject2 = this.nWf.keySet().iterator();
        String str;
        do
        {
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          str = (String)((Iterator)localObject2).next();
        } while (((y)this.nWf.get(str)).state == 2);
        ((b)localObject1).aYU();
        GMTrace.o(16027341553664L, 119413);
      }
    }
    else
    {
      localObject1 = this.nWf.keySet().iterator();
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (String)((Iterator)localObject1).next();
      } while (((y)this.nWf.get(localObject2)).state == 2);
      for (int i = 0; i == 0; i = 1)
      {
        GMTrace.o(16027341553664L, 119413);
        return;
      }
      if (this.nWj != null) {
        this.nWj.onComplete();
      }
    }
    GMTrace.o(16027341553664L, 119413);
  }
  
  public final void aZe()
  {
    GMTrace.i(5559969382400L, 41425);
    int j;
    int i;
    if (this.nWf.size() == 0)
    {
      this.nUA.setText(this.nWd.getString(R.l.dNS) + " " + this.nWd.getString(R.l.dNV));
      this.nUB.setImageResource(R.k.cOl);
      ((View)this.nWe.getParent()).setVisibility(8);
      j = this.nWe.getChildCount();
      i = 0;
      label105:
      if (i >= j) {
        break label314;
      }
      if (j != 1) {
        break label248;
      }
      this.nWe.getChildAt(i).setBackgroundResource(R.g.aXN);
    }
    for (;;)
    {
      i += 1;
      break label105;
      this.nUA.setText(this.nWd.getString(R.l.dNS) + this.nWd.getResources().getQuantityString(R.j.cIz, this.nWf.size(), new Object[] { Integer.valueOf(this.nWf.size()), bg.aF(aZf()) }));
      this.nUB.setImageResource(R.k.cOm);
      ((View)this.nWe.getParent()).setVisibility(0);
      break;
      label248:
      if (i == 0) {
        this.nWe.getChildAt(i).setBackgroundResource(R.g.aXO);
      } else if ((i > 0) && (i < j - 1)) {
        this.nWe.getChildAt(i).setBackgroundResource(R.g.aXP);
      } else {
        this.nWe.getChildAt(i).setBackgroundResource(R.g.aXQ);
      }
    }
    label314:
    GMTrace.o(5559969382400L, 41425);
  }
  
  public final int aZf()
  {
    GMTrace.i(5560103600128L, 41426);
    Iterator localIterator = this.nWf.keySet().iterator();
    String str;
    long l;
    for (int i = 0; localIterator.hasNext(); i = (int)(((y)this.nWf.get(str)).size + l))
    {
      str = (String)localIterator.next();
      l = i;
    }
    GMTrace.o(5560103600128L, 41426);
    return i;
  }
  
  public final void b(y paramy)
  {
    GMTrace.i(5560237817856L, 41427);
    int i = Math.abs(paramy.path.hashCode() / 2);
    Object localObject = (LinearLayout)this.nWe.findViewById(i);
    if (localObject == null)
    {
      GMTrace.o(5560237817856L, 41427);
      return;
    }
    localObject = (a)((LinearLayout)localObject).getTag();
    switch (paramy.state)
    {
    }
    for (;;)
    {
      GMTrace.o(5560237817856L, 41427);
      return;
      ((a)localObject).jUm.setTextColor(-16777216);
      ((a)localObject).nWt.setVisibility(0);
      ((a)localObject).nWu.setVisibility(8);
      ((a)localObject).nWv.setVisibility(8);
      ((a)localObject).nWw.setVisibility(0);
      GMTrace.o(5560237817856L, 41427);
      return;
      ((a)localObject).jUm.setTextColor(-16777216);
      ((a)localObject).nWt.setVisibility(8);
      ((a)localObject).nWu.setVisibility(8);
      ((a)localObject).nWv.setVisibility(8);
      ((a)localObject).nWw.setVisibility(0);
      GMTrace.o(5560237817856L, 41427);
      return;
      ((a)localObject).jUm.setTextColor(a.c(this.nWd, R.e.aOl));
      ((a)localObject).nWt.setVisibility(8);
      ((a)localObject).nWu.setVisibility(0);
      ((a)localObject).nWv.setVisibility(0);
      ((a)localObject).nWw.setVisibility(0);
    }
  }
  
  public final void bg(List<y> paramList)
  {
    GMTrace.i(5558761422848L, 41416);
    if (paramList == null)
    {
      GMTrace.o(5558761422848L, 41416);
      return;
    }
    Object localObject = paramList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      y localy = (y)((Iterator)localObject).next();
      a(localy);
      this.nWf.put(localy.path, localy);
    }
    if (this.mode == 6)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject = (y)paramList.next();
        this.nWh.put(((y)localObject).path, ((y)localObject).nTS);
        this.nWi.put(((y)localObject).path, ((y)localObject).name);
      }
    }
    GMTrace.o(5558761422848L, 41416);
  }
  
  public final void dl(String paramString1, String paramString2)
  {
    GMTrace.i(5558895640576L, 41417);
    if ((paramString1 == null) || (paramString1.length() == 0) || (this.nWf.containsKey(paramString1)))
    {
      GMTrace.o(5558895640576L, 41417);
      return;
    }
    File localFile = new File(paramString1);
    if ((!localFile.exists()) || (!localFile.isFile()))
    {
      GMTrace.o(5558895640576L, 41417);
      return;
    }
    y localy = new y();
    localy.path = paramString1;
    if (paramString2 == null) {}
    for (localy.name = localFile.getName();; localy.name = paramString2)
    {
      localy.size = localFile.length();
      localy.state = 0;
      this.nWf.put(paramString1, localy);
      a(localy);
      GMTrace.o(5558895640576L, 41417);
      return;
    }
  }
  
  public final long dm(final String paramString1, final String paramString2)
  {
    GMTrace.i(5559700946944L, 41423);
    if (this.nWg.containsKey(paramString1))
    {
      l = ((o)this.nWg.get(paramString1)).hashCode();
      GMTrace.o(5559700946944L, 41423);
      return l;
    }
    paramString2 = new o(paramString1, paramString1, new f()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final k paramAnonymousk)
      {
        GMTrace.i(5504403243008L, 41011);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FileUploadHelper", "offset: %d, totalLen: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (paramAnonymousInt1 < paramAnonymousInt2)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FileUploadHelper", "uploading file: %s, offset: %d, totalLen: %d", new Object[] { paramString1, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          paramAnonymousk = (y)b.this.nWf.get(paramString1);
          if (paramAnonymousk != null)
          {
            paramAnonymousk.state = 1;
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5489102422016L, 40897);
                b.this.b(paramAnonymousk);
                GMTrace.o(5489102422016L, 40897);
              }
            });
          }
          GMTrace.o(5504403243008L, 41011);
          return;
        }
        if (paramAnonymousInt1 >= paramAnonymousInt2)
        {
          final y localy = (y)b.this.nWf.get(paramString1);
          paramAnonymousk = ((o)paramAnonymousk).aYy().ueZ;
          b.this.nWh.put(paramString1, paramAnonymousk);
          b.this.nWi.put(paramString1, paramString2);
          b.this.nWg.remove(paramString1);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FileUploadHelper", "finish uploaded file: %s, attachId: %s", new Object[] { paramString1, paramAnonymousk });
          if (localy != null)
          {
            localy.state = 2;
            localy.nTS = paramAnonymousk;
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5507490250752L, 41034);
                b.this.b(localy);
                GMTrace.o(5507490250752L, 41034);
              }
            });
          }
          b.this.aZd();
        }
        GMTrace.o(5504403243008L, 41011);
      }
    });
    y localy = (y)this.nWf.get(paramString1);
    if (localy != null) {
      localy.state = 1;
    }
    b(localy);
    at.wS().a(paramString2, 0);
    this.nWg.put(paramString1, paramString2);
    long l = paramString2.hashCode();
    GMTrace.o(5559700946944L, 41423);
    return l;
  }
  
  private final class a
  {
    ImageView iub;
    TextView jUm;
    TextView nVM;
    ProgressBar nWt;
    TextView nWu;
    ImageView nWv;
    ImageView nWw;
    
    public a()
    {
      GMTrace.i(5478365003776L, 40817);
      GMTrace.o(5478365003776L, 40817);
    }
  }
  
  public static abstract interface b
  {
    public abstract void aYU();
    
    public abstract void onComplete();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */