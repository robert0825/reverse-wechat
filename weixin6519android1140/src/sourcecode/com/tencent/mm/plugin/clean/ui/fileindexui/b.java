package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.clean.c.i;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.c;
import com.tencent.mm.ui.widget.MMAutoAdjustTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
  extends BaseAdapter
  implements com.tencent.mm.ui.gridviewheaders.e
{
  private static int jTZ;
  ArrayList<i> iBZ;
  HashSet<Integer> iYP;
  boolean isStop;
  private CleanChattingDetailUI jTY;
  private boolean jUa;
  GridHeadersGridView.c jUb;
  private ae jUc;
  AbsListView.OnScrollListener jUd;
  AdapterView.OnItemClickListener juU;
  private String username;
  
  static
  {
    GMTrace.i(20532628029440L, 152980);
    jTZ = 0;
    GMTrace.o(20532628029440L, 152980);
  }
  
  public b(CleanChattingDetailUI paramCleanChattingDetailUI, String paramString)
  {
    GMTrace.i(20529943674880L, 152960);
    this.isStop = false;
    this.jUb = new GridHeadersGridView.c()
    {
      public final void ci(View paramAnonymousView)
      {
        GMTrace.i(20515313942528L, 152851);
        paramAnonymousView = (b.a)paramAnonymousView.getTag();
        b.a(b.this, paramAnonymousView);
        b.this.notifyDataSetChanged();
        GMTrace.o(20515313942528L, 152851);
      }
    };
    this.juU = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20519474692096L, 152882);
        w.i("MicroMsg.CleanChattingDetailAdapter", "Click Item position=%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        paramAnonymousAdapterView = b.this.mi(paramAnonymousInt);
        paramAnonymousView = new Intent();
        switch (paramAnonymousAdapterView.type)
        {
        }
        for (;;)
        {
          GMTrace.o(20519474692096L, 152882);
          return;
          paramAnonymousView.setAction("android.intent.action.VIEW");
          paramAnonymousView.setDataAndType(Uri.fromFile(new File(paramAnonymousAdapterView.filePath)), "video/*");
          try
          {
            b.e(b.this).startActivity(Intent.createChooser(paramAnonymousView, b.e(b.this).getString(R.l.egG)));
            GMTrace.o(20519474692096L, 152882);
            return;
          }
          catch (Exception paramAnonymousAdapterView)
          {
            GMTrace.o(20519474692096L, 152882);
            return;
          }
          paramAnonymousView.putExtra("key_title", b.e(b.this).getString(R.l.dhX));
          paramAnonymousView.putExtra("show_menu", false);
          if (FileOp.aZ(paramAnonymousAdapterView.filePath)) {}
          for (paramAnonymousAdapterView = paramAnonymousAdapterView.filePath;; paramAnonymousAdapterView = paramAnonymousAdapterView.eIy)
          {
            paramAnonymousView.putExtra("key_image_path", paramAnonymousAdapterView);
            d.a(b.e(b.this), ".ui.tools.ShowImageUI", paramAnonymousView);
            GMTrace.o(20519474692096L, 152882);
            return;
          }
          paramAnonymousView.putExtra("app_msg_id", paramAnonymousAdapterView.eCL);
          d.a(b.e(b.this), ".ui.chatting.AppAttachDownloadUI", paramAnonymousView);
        }
      }
    };
    this.jUc = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(20526051360768L, 152931);
        if (!b.f(b.this)) {
          b.this.notifyDataSetChanged();
        }
        GMTrace.o(20526051360768L, 152931);
      }
    };
    this.jUd = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(20533701771264L, 152988);
        GMTrace.o(20533701771264L, 152988);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(20533567553536L, 152987);
        com.tencent.mm.ao.n.Jd().bi(paramAnonymousInt);
        if (paramAnonymousInt != 2)
        {
          b.a(b.this, false);
          b.g(b.this).removeCallbacksAndMessages(null);
          b.g(b.this).sendEmptyMessageDelayed(0, 200L);
          GMTrace.o(20533567553536L, 152987);
          return;
        }
        b.a(b.this, true);
        GMTrace.o(20533567553536L, 152987);
      }
    };
    this.jTY = paramCleanChattingDetailUI;
    this.iYP = new HashSet();
    this.iBZ = new ArrayList();
    this.username = paramString;
    GMTrace.o(20529943674880L, 152960);
  }
  
  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20530748981248L, 152966);
    if (paramView == null)
    {
      w.v("MicroMsg.CleanChattingDetailAdapter", "convertView is null");
      paramView = this.jTY.getLayoutInflater().inflate(R.i.ctr, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.jUf = ((TextView)paramView.findViewById(R.h.bGb));
      paramViewGroup.jUg = ((TextView)paramView.findViewById(R.h.bFZ));
      paramViewGroup.jUh = ((CheckBox)paramView.findViewById(R.h.bFY));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      localObject = mi(paramInt);
      paramViewGroup.position = paramInt;
      paramViewGroup.jUf.setText(com.tencent.mm.pluginsdk.i.n.ac(this.jTY.getString(R.l.dxt), ((i)localObject).hct / 1000L));
      long l = ((i)localObject).anR();
      localObject = new HashSet();
      paramInt = 0;
      while (paramInt < this.iBZ.size())
      {
        if (((i)this.iBZ.get(paramInt)).anR() == l) {
          ((HashSet)localObject).add(Integer.valueOf(paramInt));
        }
        paramInt += 1;
      }
      w.v("MicroMsg.CleanChattingDetailAdapter", "convertView is not null");
      paramViewGroup = (a)paramView.getTag();
    }
    Object localObject = ((HashSet)localObject).iterator();
    paramInt = 1;
    if (((Iterator)localObject).hasNext())
    {
      int i = ((Integer)((Iterator)localObject).next()).intValue();
      if (this.iYP.contains(Integer.valueOf(i))) {
        break label304;
      }
      paramInt = 0;
    }
    label304:
    for (;;)
    {
      break;
      if (paramInt != 0) {
        paramViewGroup.jUh.setChecked(true);
      }
      for (;;)
      {
        GMTrace.o(20530748981248L, 152966);
        return paramView;
        paramViewGroup.jUh.setChecked(false);
      }
    }
  }
  
  public final void aom()
  {
    GMTrace.i(20531017416704L, 152968);
    this.iYP.clear();
    aon();
    GMTrace.o(20531017416704L, 152968);
  }
  
  final void aon()
  {
    GMTrace.i(20530883198976L, 152967);
    this.jTY.mk(this.iYP.size());
    Object localObject = this.jTY;
    int i;
    if (this.iYP.size() == this.iBZ.size())
    {
      i = 1;
      if (i == 0) {
        break label121;
      }
      ((CleanChattingDetailUI)localObject).iYX.setChecked(true);
    }
    long l;
    for (;;)
    {
      localObject = this.iYP.iterator();
      for (l = 0L; ((Iterator)localObject).hasNext(); l = ((i)this.iBZ.get(i)).size + l) {
        i = ((Integer)((Iterator)localObject).next()).intValue();
      }
      i = 0;
      break;
      label121:
      ((CleanChattingDetailUI)localObject).iYX.setChecked(false);
    }
    localObject = this.jTY;
    if (l > 0L)
    {
      ((CleanChattingDetailUI)localObject).jUp.setText(((CleanChattingDetailUI)localObject).getString(R.l.dmD, new Object[] { bg.aF(l) }));
      GMTrace.o(20530883198976L, 152967);
      return;
    }
    ((CleanChattingDetailUI)localObject).jUp.setText("");
    GMTrace.o(20530883198976L, 152967);
  }
  
  public final int getCount()
  {
    GMTrace.i(20530077892608L, 152961);
    int i = this.iBZ.size();
    GMTrace.o(20530077892608L, 152961);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20530346328064L, 152963);
    long l = paramInt;
    GMTrace.o(20530346328064L, 152963);
    return l;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20530480545792L, 152964);
    long l = System.currentTimeMillis();
    i locali;
    if (paramView == null)
    {
      paramView = this.jTY.getLayoutInflater().inflate(R.i.ctq, paramViewGroup, false);
      paramViewGroup = new c();
      paramViewGroup.jUi = ((MMImageView)paramView.findViewById(R.h.brT));
      paramViewGroup.hqJ = ((CheckBox)paramView.findViewById(R.h.cbs));
      paramViewGroup.jUk = paramView.findViewById(R.h.cbu);
      paramViewGroup.jUl = paramView.findViewById(R.h.cbS);
      paramViewGroup.jUj = ((ImageView)paramView.findViewById(R.h.bTm));
      paramViewGroup.jUm = ((TextView)paramView.findViewById(R.h.bPp));
      paramView.setTag(paramViewGroup);
      locali = mi(paramInt);
      paramViewGroup.jUi.setTag(locali.filePath);
      paramViewGroup.jUk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20529004150784L, 152953);
          b.a(b.this, paramInt);
          b.this.notifyDataSetChanged();
          GMTrace.o(20529004150784L, 152953);
        }
      });
      if (!this.iYP.contains(Integer.valueOf(paramInt))) {
        break label311;
      }
      paramViewGroup.hqJ.setChecked(true);
      paramViewGroup.jUl.setVisibility(0);
      label191:
      if (locali.type != 3) {
        break label331;
      }
      paramViewGroup.jUj.setVisibility(0);
      label208:
      if (locali.type != 4) {
        break label343;
      }
      paramViewGroup.jUi.setImageResource(q.Oo(com.tencent.mm.a.e.bb(locali.filePath)));
      paramViewGroup.jUm.setText(new File(locali.filePath).getName());
      paramViewGroup.jUm.setVisibility(0);
    }
    for (;;)
    {
      w.d("MicroMsg.CleanChattingDetailAdapter", "getView time=%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(20530480545792L, 152964);
      return paramView;
      paramViewGroup = (c)paramView.getTag();
      break;
      label311:
      paramViewGroup.hqJ.setChecked(false);
      paramViewGroup.jUl.setVisibility(8);
      break label191;
      label331:
      paramViewGroup.jUj.setVisibility(8);
      break label208;
      label343:
      if (jTZ == 0) {
        jTZ = paramView.getMeasuredWidth();
      }
      Object localObject = new c.a();
      ((c.a)localObject).gKH = 1;
      ((c.a)localObject).gKD = false;
      ((c.a)localObject).gKJ = jTZ;
      ((c.a)localObject).gKI = jTZ;
      paramInt = locali.type;
      ((c.a)localObject).gKE = locali.eIy;
      localObject = ((c.a)localObject).Jn();
      com.tencent.mm.ao.n.Jd().a(locali.eIy, paramViewGroup.jUi, (c)localObject);
      paramViewGroup.jUm.setVisibility(8);
    }
  }
  
  public final i mi(int paramInt)
  {
    GMTrace.i(20530212110336L, 152962);
    i locali = (i)this.iBZ.get(paramInt);
    GMTrace.o(20530212110336L, 152962);
    return locali;
  }
  
  public final long mj(int paramInt)
  {
    GMTrace.i(20530614763520L, 152965);
    long l = ((i)this.iBZ.get(paramInt)).anR();
    GMTrace.o(20530614763520L, 152965);
    return l;
  }
  
  final class a
  {
    TextView jUf;
    TextView jUg;
    CheckBox jUh;
    int position;
    
    a()
    {
      GMTrace.i(20512629587968L, 152831);
      GMTrace.o(20512629587968L, 152831);
    }
  }
  
  private final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(20533030682624L, 152983);
      GMTrace.o(20533030682624L, 152983);
    }
    
    private void al(List<com.tencent.mm.plugin.i.b.a> paramList)
    {
      GMTrace.i(20533299118080L, 152985);
      int j = paramList.size();
      HashMap localHashMap = new HashMap();
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      if (i < j)
      {
        com.tencent.mm.plugin.i.b.a locala = (com.tencent.mm.plugin.i.b.a)paramList.get(i);
        i locali2 = (i)localHashMap.get(Long.valueOf(locala.field_msgId));
        i locali1 = locali2;
        if (locali2 == null)
        {
          locali1 = new i();
          localHashMap.put(Long.valueOf(locala.field_msgId), locali1);
          localArrayList.add(locali1);
        }
        locali1.jTu.add(locala);
        locali1.hct = locala.field_msgtime;
        locali1.userName = locala.field_username;
        locali1.eCL = locala.field_msgId;
        if (!com.tencent.mm.plugin.i.a.ly(locala.field_msgSubType)) {
          locali1.size += locala.field_size;
        }
        switch (locala.field_msgSubType)
        {
        }
        for (;;)
        {
          i += 1;
          break;
          locali1.filePath = (h.xy().fYT + locala.field_path);
          locali1.type = 3;
          continue;
          locali1.eIy = (h.xy().fYT + locala.field_path);
          locali1.type = 3;
          continue;
          locali1.filePath = (h.xy().fYT + locala.field_path);
          locali1.type = 1;
          continue;
          locali1.eIy = (h.xy().fYT + locala.field_path);
          locali1.type = 1;
          continue;
          locali1.filePath = (h.xy().fYT + locala.field_path);
          locali1.type = 1;
          continue;
          locali1.eIy = (h.xy().fYT + locala.field_path);
          locali1.type = 1;
          continue;
          locali1.filePath = (h.xy().fYT + locala.field_path);
          locali1.type = 4;
          continue;
          locali1.eIy = (h.xy().fYT + locala.field_path);
          locali1.type = 4;
          continue;
          locali1.filePath = (h.xy().fYT + locala.field_path);
          locali1.type = 4;
          continue;
          locali1.eIy = (h.xy().fYT + locala.field_path);
          locali1.type = 4;
        }
      }
      paramList = localArrayList.iterator();
      while (paramList.hasNext()) {
        if (((i)paramList.next()).size <= 0L) {
          paramList.remove();
        }
      }
      b.d(b.this).addAll(localArrayList);
      GMTrace.o(20533299118080L, 152985);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 179
      //   3: ldc -75
      //   5: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: new 183	com/tencent/mm/pointers/PLong
      //   11: dup
      //   12: invokespecial 184	com/tencent/mm/pointers/PLong:<init>	()V
      //   15: astore 11
      //   17: new 183	com/tencent/mm/pointers/PLong
      //   20: dup
      //   21: invokespecial 184	com/tencent/mm/pointers/PLong:<init>	()V
      //   24: astore 12
      //   26: invokestatic 190	com/tencent/mm/plugin/i/b:aiA	()Lcom/tencent/mm/plugin/i/b;
      //   29: invokevirtual 194	com/tencent/mm/plugin/i/b:aiB	()Lcom/tencent/mm/plugin/i/b/b;
      //   32: astore 10
      //   34: aload_0
      //   35: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:jUe	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
      //   38: invokestatic 198	com/tencent/mm/plugin/clean/ui/fileindexui/b:a	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Ljava/lang/String;
      //   41: astore 13
      //   43: invokestatic 204	com/tencent/mm/sdk/platformtools/bg:Pw	()J
      //   46: lstore_1
      //   47: new 116	java/lang/StringBuilder
      //   50: dup
      //   51: ldc -50
      //   53: invokespecial 209	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   56: aload 13
      //   58: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   61: ldc -45
      //   63: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   66: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   69: astore 14
      //   71: aconst_null
      //   72: astore 9
      //   74: aconst_null
      //   75: astore 8
      //   77: aload 10
      //   79: getfield 217	com/tencent/mm/plugin/i/b/b:fTZ	Lcom/tencent/mm/sdk/e/e;
      //   82: aload 14
      //   84: aconst_null
      //   85: invokeinterface 223 3 0
      //   90: astore 10
      //   92: aload 10
      //   94: ifnull +63 -> 157
      //   97: aload 10
      //   99: astore 8
      //   101: aload 10
      //   103: astore 9
      //   105: aload 10
      //   107: invokeinterface 228 1 0
      //   112: ifeq +45 -> 157
      //   115: aload 10
      //   117: astore 8
      //   119: aload 10
      //   121: astore 9
      //   123: aload 11
      //   125: aload 10
      //   127: iconst_0
      //   128: invokeinterface 232 2 0
      //   133: putfield 235	com/tencent/mm/pointers/PLong:value	J
      //   136: aload 10
      //   138: astore 8
      //   140: aload 10
      //   142: astore 9
      //   144: aload 12
      //   146: aload 10
      //   148: iconst_1
      //   149: invokeinterface 232 2 0
      //   154: putfield 235	com/tencent/mm/pointers/PLong:value	J
      //   157: aload 10
      //   159: ifnull +10 -> 169
      //   162: aload 10
      //   164: invokeinterface 238 1 0
      //   169: ldc -16
      //   171: ldc -14
      //   173: iconst_2
      //   174: anewarray 4	java/lang/Object
      //   177: dup
      //   178: iconst_0
      //   179: aload 13
      //   181: aastore
      //   182: dup
      //   183: iconst_1
      //   184: lload_1
      //   185: invokestatic 246	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
      //   188: invokestatic 64	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   191: aastore
      //   192: invokestatic 251	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   195: aload 12
      //   197: aload 12
      //   199: getfield 235	com/tencent/mm/pointers/PLong:value	J
      //   202: lconst_1
      //   203: lsub
      //   204: putfield 235	com/tencent/mm/pointers/PLong:value	J
      //   207: aload 11
      //   209: getfield 235	com/tencent/mm/pointers/PLong:value	J
      //   212: lstore 5
      //   214: lload 5
      //   216: ldc2_w 252
      //   219: lsub
      //   220: aload 12
      //   222: getfield 235	com/tencent/mm/pointers/PLong:value	J
      //   225: invokestatic 259	java/lang/Math:max	(JJ)J
      //   228: lstore_3
      //   229: aload_0
      //   230: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:jUe	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
      //   233: invokestatic 262	com/tencent/mm/plugin/clean/ui/fileindexui/b:b	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Z
      //   236: istore 7
      //   238: iload 7
      //   240: ifeq +69 -> 309
      //   243: ldc2_w 179
      //   246: ldc -75
      //   248: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   251: return
      //   252: astore 10
      //   254: aload 8
      //   256: astore 9
      //   258: ldc -16
      //   260: aload 10
      //   262: ldc_w 264
      //   265: iconst_1
      //   266: anewarray 4	java/lang/Object
      //   269: dup
      //   270: iconst_0
      //   271: aload 14
      //   273: aastore
      //   274: invokestatic 268	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   277: aload 8
      //   279: ifnull -110 -> 169
      //   282: aload 8
      //   284: invokeinterface 238 1 0
      //   289: goto -120 -> 169
      //   292: astore 8
      //   294: aload 9
      //   296: ifnull +10 -> 306
      //   299: aload 9
      //   301: invokeinterface 238 1 0
      //   306: aload 8
      //   308: athrow
      //   309: lload_3
      //   310: lstore_1
      //   311: lload_3
      //   312: lload 5
      //   314: lcmp
      //   315: ifne +7 -> 322
      //   318: lload_3
      //   319: lconst_1
      //   320: lsub
      //   321: lstore_1
      //   322: aload_0
      //   323: invokestatic 190	com/tencent/mm/plugin/i/b:aiA	()Lcom/tencent/mm/plugin/i/b;
      //   326: invokevirtual 194	com/tencent/mm/plugin/i/b:aiB	()Lcom/tencent/mm/plugin/i/b/b;
      //   329: aload_0
      //   330: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:jUe	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
      //   333: invokestatic 198	com/tencent/mm/plugin/clean/ui/fileindexui/b:a	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Ljava/lang/String;
      //   336: lload 5
      //   338: lload_1
      //   339: invokevirtual 272	com/tencent/mm/plugin/i/b/b:f	(Ljava/lang/String;JJ)Ljava/util/List;
      //   342: invokespecial 274	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:al	(Ljava/util/List;)V
      //   345: aload_0
      //   346: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:jUe	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
      //   349: invokestatic 277	com/tencent/mm/plugin/clean/ui/fileindexui/b:c	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)V
      //   352: lload_1
      //   353: lstore_3
      //   354: aload_0
      //   355: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:jUe	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
      //   358: invokestatic 262	com/tencent/mm/plugin/clean/ui/fileindexui/b:b	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Z
      //   361: ifne +77 -> 438
      //   364: lload_3
      //   365: aload 12
      //   367: getfield 235	com/tencent/mm/pointers/PLong:value	J
      //   370: lcmp
      //   371: ifle +67 -> 438
      //   374: lload_3
      //   375: ldc2_w 278
      //   378: lsub
      //   379: aload 12
      //   381: getfield 235	com/tencent/mm/pointers/PLong:value	J
      //   384: invokestatic 259	java/lang/Math:max	(JJ)J
      //   387: lstore 5
      //   389: lload 5
      //   391: lstore_1
      //   392: lload 5
      //   394: lload_3
      //   395: lcmp
      //   396: ifne +8 -> 404
      //   399: lload 5
      //   401: lconst_1
      //   402: lsub
      //   403: lstore_1
      //   404: aload_0
      //   405: invokestatic 190	com/tencent/mm/plugin/i/b:aiA	()Lcom/tencent/mm/plugin/i/b;
      //   408: invokevirtual 194	com/tencent/mm/plugin/i/b:aiB	()Lcom/tencent/mm/plugin/i/b/b;
      //   411: aload_0
      //   412: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:jUe	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
      //   415: invokestatic 198	com/tencent/mm/plugin/clean/ui/fileindexui/b:a	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)Ljava/lang/String;
      //   418: lload_3
      //   419: lload_1
      //   420: invokevirtual 272	com/tencent/mm/plugin/i/b/b:f	(Ljava/lang/String;JJ)Ljava/util/List;
      //   423: invokespecial 274	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:al	(Ljava/util/List;)V
      //   426: aload_0
      //   427: getfield 15	com/tencent/mm/plugin/clean/ui/fileindexui/b$b:jUe	Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;
      //   430: invokestatic 277	com/tencent/mm/plugin/clean/ui/fileindexui/b:c	(Lcom/tencent/mm/plugin/clean/ui/fileindexui/b;)V
      //   433: lload_1
      //   434: lstore_3
      //   435: goto -81 -> 354
      //   438: ldc2_w 179
      //   441: ldc -75
      //   443: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   446: return
      //   447: astore 8
      //   449: ldc_w 281
      //   452: aload 8
      //   454: ldc_w 283
      //   457: iconst_0
      //   458: anewarray 4	java/lang/Object
      //   461: invokestatic 268	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   464: ldc2_w 179
      //   467: ldc -75
      //   469: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   472: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	473	0	this	b
      //   46	388	1	l1	long
      //   228	207	3	l2	long
      //   212	188	5	l3	long
      //   236	3	7	bool	boolean
      //   75	208	8	localObject1	Object
      //   292	15	8	localObject2	Object
      //   447	6	8	localException1	Exception
      //   72	228	9	localObject3	Object
      //   32	131	10	localObject4	Object
      //   252	9	10	localException2	Exception
      //   15	193	11	localPLong1	com.tencent.mm.pointers.PLong
      //   24	356	12	localPLong2	com.tencent.mm.pointers.PLong
      //   41	139	13	str1	String
      //   69	203	14	str2	String
      // Exception table:
      //   from	to	target	type
      //   77	92	252	java/lang/Exception
      //   105	115	252	java/lang/Exception
      //   123	136	252	java/lang/Exception
      //   144	157	252	java/lang/Exception
      //   77	92	292	finally
      //   105	115	292	finally
      //   123	136	292	finally
      //   144	157	292	finally
      //   258	277	292	finally
      //   229	238	447	java/lang/Exception
      //   322	352	447	java/lang/Exception
      //   354	389	447	java/lang/Exception
      //   404	433	447	java/lang/Exception
    }
  }
  
  final class c
  {
    CheckBox hqJ;
    MMImageView jUi;
    ImageView jUj;
    View jUk;
    View jUl;
    TextView jUm;
    
    c()
    {
      GMTrace.i(20510616322048L, 152816);
      GMTrace.o(20510616322048L, 152816);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\fileindexui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */