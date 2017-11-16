package com.tencent.mm.plugin.multitalk.ui.widget;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.AnimationDrawable;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.multitalk.a.j;
import com.tencent.mm.plugin.multitalk.a.j.1;
import com.tencent.mm.plugin.multitalk.a.j.a;
import com.tencent.mm.plugin.multitalk.a.j.b;
import com.tencent.mm.plugin.multitalk.a.o;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.ui.MMCheckBox;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.pb.talkroom.sdk.g;
import com.tencent.wecall.talkroom.model.TalkRoom;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  implements View.OnClickListener, d.a, com.tencent.mm.plugin.voip.video.f
{
  com.tencent.mm.ui.base.i hwF;
  public TextView jRw;
  public FrameLayout noJ;
  public FrameLayout noK;
  public View noL;
  private View noM;
  private View noN;
  public View noO;
  public MMCheckBox noP;
  public MMCheckBox noQ;
  public MMCheckBox noR;
  private int noS;
  private int noT;
  public ArrayList<RelativeLayout> noU;
  private RelativeLayout noV;
  private com.tencent.mm.plugin.voip.video.a noW;
  private j noX;
  private ObservableTextureView noY;
  public String noZ;
  private MultiTalkMainUI non;
  private ImageButton not;
  private int npa;
  public long npb;
  c npc;
  
  public f(MultiTalkMainUI paramMultiTalkMainUI)
  {
    GMTrace.i(4774258802688L, 35571);
    this.npc = new c();
    this.hwF = null;
    this.noU = new ArrayList(9);
    this.non = paramMultiTalkMainUI;
    this.jRw = ((TextView)paramMultiTalkMainUI.findViewById(R.h.cho));
    this.noL = paramMultiTalkMainUI.findViewById(R.h.cgH);
    this.not = ((ImageButton)paramMultiTalkMainUI.findViewById(R.h.cgG));
    this.noJ = ((FrameLayout)paramMultiTalkMainUI.findViewById(R.h.cgI));
    this.noK = ((FrameLayout)paramMultiTalkMainUI.findViewById(R.h.cgF));
    this.noM = paramMultiTalkMainUI.findViewById(R.h.bOQ);
    this.noN = paramMultiTalkMainUI.findViewById(R.h.bOI);
    this.noP = ((MMCheckBox)paramMultiTalkMainUI.findViewById(R.h.bOZ));
    this.noQ = ((MMCheckBox)paramMultiTalkMainUI.findViewById(R.h.bOR));
    this.noR = ((MMCheckBox)paramMultiTalkMainUI.findViewById(R.h.bON));
    this.noO = paramMultiTalkMainUI.findViewById(R.h.bOL);
    this.noQ.setChecked(o.aRR().jGN);
    this.noR.setChecked(o.aRR().nmk);
    this.noP.setChecked(o.aRR().aRo());
    this.noS = com.tencent.mm.br.a.ef(paramMultiTalkMainUI.vKB.vKW);
    this.noT = b.cS(paramMultiTalkMainUI.vKB.vKW);
    w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "talkingAvatarContainerHeight %d", new Object[] { Integer.valueOf(this.noT) });
    this.not.setOnClickListener(this);
    this.noM.setOnClickListener(this);
    this.noP.setOnClickListener(this);
    this.noQ.setOnClickListener(this);
    this.noR.setOnClickListener(this);
    this.noN.setOnClickListener(this);
    this.noO.setOnClickListener(this);
    n.Dh().a(this);
    int i = 8;
    Object localObject;
    while (i >= 0)
    {
      localObject = (RelativeLayout)LayoutInflater.from(paramMultiTalkMainUI).inflate(R.i.cBe, null);
      a locala = new a();
      locala.npe = ((MultiTalkVideoView)((RelativeLayout)localObject).findViewById(R.h.cgJ));
      locala.npe.index = i;
      locala.npe.setOnClickListener(this);
      locala.npf = ((RelativeLayout)localObject).findViewById(R.h.bMc);
      locala.npg = ((ImageView)((RelativeLayout)localObject).findViewById(R.h.cll));
      locala.nph = ((ImageView)((RelativeLayout)localObject).findViewById(R.h.bPa));
      locala.npi = ((TextView)((RelativeLayout)localObject).findViewById(R.h.cgh));
      locala.npj = ((ImageView)((RelativeLayout)localObject).findViewById(R.h.bKC));
      ((RelativeLayout)localObject).setTag(locala);
      ((RelativeLayout)localObject).setVisibility(8);
      this.noU.add(localObject);
      this.noJ.addView((View)localObject);
      i -= 1;
    }
    if (this.noK != null)
    {
      paramMultiTalkMainUI = (RelativeLayout)LayoutInflater.from(paramMultiTalkMainUI).inflate(R.i.cBe, null);
      localObject = new a();
      ((a)localObject).npe = ((MultiTalkVideoView)paramMultiTalkMainUI.findViewById(R.h.cgJ));
      ((a)localObject).npe.index = 0;
      ((a)localObject).npe.setOnClickListener(this);
      ((a)localObject).npf = paramMultiTalkMainUI.findViewById(R.h.bMc);
      ((a)localObject).npg = ((ImageView)paramMultiTalkMainUI.findViewById(R.h.cll));
      ((a)localObject).nph = ((ImageView)paramMultiTalkMainUI.findViewById(R.h.bPa));
      ((a)localObject).npi = ((TextView)paramMultiTalkMainUI.findViewById(R.h.cgh));
      ((a)localObject).npj = ((ImageView)paramMultiTalkMainUI.findViewById(R.h.bKC));
      paramMultiTalkMainUI.setTag(localObject);
      paramMultiTalkMainUI.setVisibility(8);
      this.noV = paramMultiTalkMainUI;
      this.noK.addView(paramMultiTalkMainUI);
    }
    this.noK.setVisibility(8);
    if (o.aRR().aRo()) {
      this.noO.setVisibility(0);
    }
    for (;;)
    {
      this.noZ = "";
      GMTrace.o(4774258802688L, 35571);
      return;
      this.noO.setVisibility(8);
    }
  }
  
  private void Z(LinkedList<MultiTalkGroupMember> paramLinkedList)
  {
    GMTrace.i(4774527238144L, 35573);
    this.npa = paramLinkedList.size();
    Object localObject = this.noJ.getLayoutParams();
    int j;
    int i;
    int k;
    HashSet localHashSet;
    label169:
    int m;
    label177:
    MultiTalkGroupMember localMultiTalkGroupMember;
    label209:
    int i1;
    if (this.npa <= 4)
    {
      j = this.noS / 2;
      if (this.noT / 2 > j)
      {
        i = j;
        ((ViewGroup.LayoutParams)localObject).height = (i * 2);
        k = j;
        j = i;
        this.noJ.setLayoutParams((ViewGroup.LayoutParams)localObject);
        w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "talkingAvatarWidth: %d | talkingAvatarHeight: %d | size %d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(this.npa) });
        localHashSet = new HashSet();
        localHashSet.addAll(o.aRR().nmn);
        if (o.aRR().aRo()) {
          localHashSet.add(q.zE());
        }
        if (this.npa > 4) {
          break label452;
        }
        localObject = com.tencent.mm.plugin.multitalk.a.i.nmV[this.npa];
        if (localObject == null) {
          break label468;
        }
        m = 0;
        if (m >= localObject.length) {
          break label468;
        }
        if (this.npa <= m / 2) {
          break label462;
        }
        localMultiTalkGroupMember = (MultiTalkGroupMember)paramLinkedList.get(m / 2);
        int n = (int)(localObject[m] * k);
        i1 = (int)(localObject[(m + 1)] * j);
        i = n;
        if (this.npa == 2)
        {
          i = n;
          if (n == 0) {
            i = 1;
          }
        }
        if ((this.npa != 4) || (i != 0)) {
          break label554;
        }
        i = 1;
      }
    }
    label452:
    label462:
    label468:
    label554:
    for (;;)
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)this.noU.get(m / 2);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.width = k;
      localLayoutParams.height = j;
      localLayoutParams.leftMargin = i;
      localLayoutParams.topMargin = i1;
      localRelativeLayout.setLayoutParams(localLayoutParams);
      a(localRelativeLayout, localMultiTalkGroupMember, false, localHashSet);
      localRelativeLayout.setVisibility(0);
      m += 2;
      break label177;
      i = this.noT / 2;
      break;
      if (this.npa <= 9)
      {
        j = this.noS / 3;
        if (this.noT / 3 > j) {}
        for (i = j;; i = this.noT / 3)
        {
          ((ViewGroup.LayoutParams)localObject).height = (i * 3);
          k = j;
          j = i;
          break;
        }
      }
      w.e("MicroMsg.MT.MultiTalkTalkingUILogic", "onlineUserSize larger than 9, %s", new Object[] { Integer.valueOf(this.npa) });
      GMTrace.o(4774527238144L, 35573);
      return;
      localObject = com.tencent.mm.plugin.multitalk.a.i.nmV[5];
      break label169;
      localMultiTalkGroupMember = null;
      break label209;
      if (this.npa <= 4)
      {
        i = this.npa;
        while (i < 9)
        {
          ((RelativeLayout)this.noU.get(i)).setVisibility(8);
          i += 1;
        }
      }
      if ((o.aRR().aRr()) && (this.noP != null) && (!this.noP.isChecked())) {
        o.aRR().rc(1);
      }
      GMTrace.o(4774527238144L, 35573);
      return;
    }
  }
  
  private static void a(RelativeLayout paramRelativeLayout, MultiTalkGroupMember paramMultiTalkGroupMember, boolean paramBoolean, HashSet<String> paramHashSet)
  {
    GMTrace.i(20506858225664L, 152788);
    paramRelativeLayout = (a)paramRelativeLayout.getTag();
    if (paramMultiTalkGroupMember != null)
    {
      paramRelativeLayout.npe.Di(paramMultiTalkGroupMember.xOC);
      paramRelativeLayout.npe.position = paramRelativeLayout.npe.index;
      if (paramMultiTalkGroupMember.status != 10)
      {
        paramRelativeLayout.npf.setVisibility(0);
        if (paramRelativeLayout.npj.getBackground() != null)
        {
          paramRelativeLayout.npj.setVisibility(0);
          ((AnimationDrawable)paramRelativeLayout.npj.getBackground()).stop();
          ((AnimationDrawable)paramRelativeLayout.npj.getBackground()).start();
        }
      }
      while ((paramHashSet.contains(paramMultiTalkGroupMember.xOC)) && (!paramBoolean))
      {
        paramRelativeLayout.npe.aSc();
        GMTrace.o(20506858225664L, 152788);
        return;
        paramRelativeLayout.npf.setVisibility(8);
        a(paramRelativeLayout);
      }
      paramRelativeLayout.npe.aSb();
      GMTrace.o(20506858225664L, 152788);
      return;
    }
    paramRelativeLayout.npf.setVisibility(8);
    a(paramRelativeLayout);
    paramRelativeLayout.npe.aSd();
    GMTrace.o(20506858225664L, 152788);
  }
  
  private static void a(a parama)
  {
    GMTrace.i(4776272068608L, 35586);
    if (parama.npj.getBackground() != null) {
      ((AnimationDrawable)parama.npj.getBackground()).stop();
    }
    parama.npj.setVisibility(8);
    GMTrace.o(4776272068608L, 35586);
  }
  
  private static int p(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(20506992443392L, 152789);
    if (!paramBoolean) {}
    for (int i = -1;; i = paramInt)
    {
      Object localObject = ByteBuffer.allocate(4);
      ((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN).putInt(i);
      localObject = ((ByteBuffer)localObject).array();
      int j = o.aRQ().nlX.setAppCmd(22, (byte[])localObject, 4);
      if (j < 0)
      {
        w.e("MicroMsg.MT.MultiTalkTalkingUILogic", "steve:set netBigVideo failed or NO need!, ret:%d, vID:%d, memberId:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt) });
        GMTrace.o(20506992443392L, 152789);
        return -1;
      }
      GMTrace.o(20506992443392L, 152789);
      return j;
    }
  }
  
  public final RelativeLayout Dh(String paramString)
  {
    GMTrace.i(4774661455872L, 35574);
    Iterator localIterator = this.noU.iterator();
    while (localIterator.hasNext())
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)localIterator.next();
      if (paramString.equals(((a)localRelativeLayout.getTag()).npe.username))
      {
        GMTrace.o(4774661455872L, 35574);
        return localRelativeLayout;
      }
    }
    GMTrace.o(4774661455872L, 35574);
    return null;
  }
  
  public final void a(RelativeLayout paramRelativeLayout, boolean paramBoolean)
  {
    GMTrace.i(4775198326784L, 35578);
    if (!paramBoolean) {
      this.npb = System.currentTimeMillis();
    }
    w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "start capture render");
    if ((this.noK != null) && (this.noK.getVisibility() == 0)) {}
    for (paramRelativeLayout = (ViewGroup)this.non.findViewById(R.h.gFK);; paramRelativeLayout = Dh(q.zE()))
    {
      if (paramRelativeLayout != null)
      {
        if (this.noY == null)
        {
          w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "create capture View");
          this.noY = new ObservableTextureView(this.non);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(1, 1);
          this.noY.setLayoutParams(localLayoutParams);
          paramRelativeLayout.addView(this.noY);
          this.noY.setVisibility(0);
        }
        if (this.noW == null)
        {
          w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "create capture Render");
          this.noW = new com.tencent.mm.plugin.voip.video.a(320, 240);
          this.noW.a(this, true);
          this.noW.a(this.noY);
          this.noW.startCapture();
          if (!o.aRR().nmm) {
            this.noW.bvR();
          }
          w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b", new Object[] { Boolean.valueOf(this.noW.bvT()), Boolean.valueOf(this.noW.bvU()) });
        }
        if (this.noX == null)
        {
          this.noX = new j(this.non);
          com.tencent.mm.sdk.f.e.d(new j.1(this.noX), "MultiTalkVideoTaskManager_native_drawer_handler", 1).start();
        }
      }
      GMTrace.o(4775198326784L, 35578);
      return;
    }
  }
  
  /* Error */
  public final void a(String paramString, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 659
    //   5: ldc_w 661
    //   8: invokestatic 78	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 133	com/tencent/mm/plugin/multitalk/ui/widget/f:noK	Landroid/widget/FrameLayout;
    //   15: invokevirtual 577	android/widget/FrameLayout:getVisibility	()I
    //   18: ifne +54 -> 72
    //   21: aload_0
    //   22: getfield 331	com/tencent/mm/plugin/multitalk/ui/widget/f:noV	Landroid/widget/RelativeLayout;
    //   25: invokevirtual 442	android/widget/RelativeLayout:getTag	()Ljava/lang/Object;
    //   28: checkcast 16	com/tencent/mm/plugin/multitalk/ui/widget/f$a
    //   31: astore 5
    //   33: aload_1
    //   34: aload 5
    //   36: getfield 277	com/tencent/mm/plugin/multitalk/ui/widget/f$a:npe	Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView;
    //   39: getfield 552	com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView:username	Ljava/lang/String;
    //   42: invokevirtual 557	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   45: ifeq +15 -> 60
    //   48: aload 5
    //   50: getfield 277	com/tencent/mm/plugin/multitalk/ui/widget/f$a:npe	Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView;
    //   53: aload_2
    //   54: iload 4
    //   56: iload_3
    //   57: invokevirtual 664	com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView:a	(Landroid/graphics/Bitmap;II)V
    //   60: ldc2_w 659
    //   63: ldc_w 661
    //   66: invokestatic 340	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   69: aload_0
    //   70: monitorexit
    //   71: return
    //   72: aload_0
    //   73: aload_1
    //   74: invokevirtual 657	com/tencent/mm/plugin/multitalk/ui/widget/f:Dh	(Ljava/lang/String;)Landroid/widget/RelativeLayout;
    //   77: astore_1
    //   78: aload_1
    //   79: ifnull +20 -> 99
    //   82: aload_1
    //   83: invokevirtual 442	android/widget/RelativeLayout:getTag	()Ljava/lang/Object;
    //   86: checkcast 16	com/tencent/mm/plugin/multitalk/ui/widget/f$a
    //   89: getfield 277	com/tencent/mm/plugin/multitalk/ui/widget/f$a:npe	Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView;
    //   92: aload_2
    //   93: iload 4
    //   95: iload_3
    //   96: invokevirtual 664	com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView:a	(Landroid/graphics/Bitmap;II)V
    //   99: ldc2_w 659
    //   102: ldc_w 661
    //   105: invokestatic 340	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   108: goto -39 -> 69
    //   111: astore_1
    //   112: aload_0
    //   113: monitorexit
    //   114: aload_1
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	f
    //   0	116	1	paramString	String
    //   0	116	2	paramBitmap	Bitmap
    //   0	116	3	paramInt1	int
    //   0	116	4	paramInt2	int
    //   31	18	5	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	60	111	finally
    //   60	69	111	finally
    //   72	78	111	finally
    //   82	99	111	finally
    //   99	108	111	finally
  }
  
  /* Error */
  public final void a(String paramString, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 666
    //   5: ldc_w 668
    //   8: invokestatic 78	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 133	com/tencent/mm/plugin/multitalk/ui/widget/f:noK	Landroid/widget/FrameLayout;
    //   15: invokevirtual 577	android/widget/FrameLayout:getVisibility	()I
    //   18: ifne +57 -> 75
    //   21: aload_0
    //   22: getfield 331	com/tencent/mm/plugin/multitalk/ui/widget/f:noV	Landroid/widget/RelativeLayout;
    //   25: invokevirtual 442	android/widget/RelativeLayout:getTag	()Ljava/lang/Object;
    //   28: checkcast 16	com/tencent/mm/plugin/multitalk/ui/widget/f$a
    //   31: astore 7
    //   33: aload_1
    //   34: aload 7
    //   36: getfield 277	com/tencent/mm/plugin/multitalk/ui/widget/f$a:npe	Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView;
    //   39: getfield 552	com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView:username	Ljava/lang/String;
    //   42: invokevirtual 557	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   45: ifeq +18 -> 63
    //   48: aload 7
    //   50: getfield 277	com/tencent/mm/plugin/multitalk/ui/widget/f$a:npe	Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView;
    //   53: aload_2
    //   54: iload_3
    //   55: iload 4
    //   57: iconst_0
    //   58: iload 6
    //   60: invokevirtual 671	com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView:a	([IIIII)V
    //   63: ldc2_w 666
    //   66: ldc_w 668
    //   69: invokestatic 340	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   72: aload_0
    //   73: monitorexit
    //   74: return
    //   75: aload_0
    //   76: aload_1
    //   77: invokevirtual 657	com/tencent/mm/plugin/multitalk/ui/widget/f:Dh	(Ljava/lang/String;)Landroid/widget/RelativeLayout;
    //   80: astore_1
    //   81: aload_1
    //   82: ifnull +23 -> 105
    //   85: aload_1
    //   86: invokevirtual 442	android/widget/RelativeLayout:getTag	()Ljava/lang/Object;
    //   89: checkcast 16	com/tencent/mm/plugin/multitalk/ui/widget/f$a
    //   92: getfield 277	com/tencent/mm/plugin/multitalk/ui/widget/f$a:npe	Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView;
    //   95: aload_2
    //   96: iload_3
    //   97: iload 4
    //   99: iconst_0
    //   100: iload 6
    //   102: invokevirtual 671	com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkVideoView:a	([IIIII)V
    //   105: ldc2_w 666
    //   108: ldc_w 668
    //   111: invokestatic 340	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   114: goto -42 -> 72
    //   117: astore_1
    //   118: aload_0
    //   119: monitorexit
    //   120: aload_1
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	f
    //   0	122	1	paramString	String
    //   0	122	2	paramArrayOfInt	int[]
    //   0	122	3	paramInt1	int
    //   0	122	4	paramInt2	int
    //   0	122	5	paramInt3	int
    //   0	122	6	paramInt4	int
    //   31	18	7	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	63	117	finally
    //   63	72	117	finally
    //   75	81	117	finally
    //   85	105	117	finally
    //   105	114	117	finally
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(4775600979968L, 35581);
    if (!o.aRR().aRr())
    {
      jr(false);
      GMTrace.o(4775600979968L, 35581);
      return;
    }
    if (this.npc.nng == null)
    {
      this.npc.w = paramInt1;
      this.npc.h = paramInt2;
      this.npc.nng = new int[this.npc.w * this.npc.h];
    }
    if (!o.aRR().aRo())
    {
      com.tencent.mm.plugin.multitalk.a.i.aRJ();
      o.aRR().rc(3);
    }
    long l1 = System.currentTimeMillis();
    o.aRR().nmm = this.noW.bvT();
    int j;
    if (this.noW.bvT())
    {
      j = OpenGlRender.qPs;
      if (!this.noW.bvU()) {
        break label269;
      }
    }
    g localg;
    label269:
    for (int k = OpenGlRender.qPr;; k = OpenGlRender.qPq)
    {
      localg = o.aRQ().nlX.a(paramArrayOfByte, (int)paramLong, this.npc.w, this.npc.h, paramInt3 & 0x1F, this.npc.nng);
      if ((localg.ret >= 0) && (this.npc.nng != null) && (localg.xOK != 0) && (localg.xOL != 0)) {
        break label277;
      }
      w.e("MicroMsg.MT.MultiTalkTalkingUILogic", "ret: %d", new Object[] { Integer.valueOf(localg.ret) });
      GMTrace.o(4775600979968L, 35581);
      return;
      j = 0;
      break;
    }
    label277:
    long l2 = System.currentTimeMillis();
    int i;
    if (j == OpenGlRender.qPs)
    {
      i = 257;
      if (!o.aRR().nmz) {
        break label809;
      }
      if (j != OpenGlRender.qPs) {
        break label524;
      }
      i = 259;
    }
    label524:
    label809:
    for (;;)
    {
      paramInt1 = o.aRQ().nlX.a(paramArrayOfByte, (short)(int)paramLong, paramInt1, paramInt2, paramInt3, i);
      paramLong = System.currentTimeMillis();
      long l3 = paramLong - l1;
      if (l3 > 30L) {
        w.d("MicroMsg.MT.MultiTalkTalkingUILogic", "steve: trans size:%dx%d, total: %d, trans: %d, enc: %d", new Object[] { Integer.valueOf(localg.xOK), Integer.valueOf(localg.xOL), Long.valueOf(l3), Long.valueOf(l2 - l1), Long.valueOf(paramLong - l2) });
      }
      if (paramInt1 <= 0) {
        w.v("MicroMsg.MT.MultiTalkTalkingUILogic", "send ret = %d", new Object[] { Integer.valueOf(paramInt1) });
      }
      if ((this.noX != null) && (this.npc.nng != null))
      {
        paramArrayOfByte = this.noX;
        int[] arrayOfInt = this.npc.nng;
        paramInt1 = localg.xOK;
        paramInt2 = localg.xOL;
        if (arrayOfInt == null)
        {
          w.e("MicroMsg.MT.MultiTalkVideoNativeReceiver", "onDrawerReady pBuffer is null");
          GMTrace.o(4775600979968L, 35581);
          return;
          i = 1;
          break;
          i = 3;
          continue;
        }
        if (paramArrayOfByte.nnc.kNw)
        {
          w.d("MicroMsg.MT.MultiTalkVideoNativeReceiver", "onDrawerReady busy!!!!");
          GMTrace.o(4775600979968L, 35581);
          return;
        }
        if (paramArrayOfByte.nnc.nng == null) {
          paramArrayOfByte.nnc.nng = new int[arrayOfInt.length];
        }
        paramArrayOfByte.nnc.w = paramInt1;
        paramArrayOfByte.nnc.h = paramInt2;
        paramArrayOfByte.nnc.nne = paramInt3;
        paramArrayOfByte.nnc.nnf = j;
        paramArrayOfByte.nnc.angle = k;
        paramLong = System.currentTimeMillis();
        paramInt1 = paramArrayOfByte.nnc.h;
        if (paramArrayOfByte.nnc.h > paramArrayOfByte.nnc.w) {
          paramInt1 = paramArrayOfByte.nnc.w;
        }
        if (paramArrayOfByte.nnc.lEg == null) {
          paramArrayOfByte.nnc.lEg = Bitmap.createBitmap(paramInt1, paramInt1, Bitmap.Config.RGB_565);
        }
        if (paramArrayOfByte.nnc.lEg != null) {
          paramArrayOfByte.nnc.lEg.setPixels(arrayOfInt, paramArrayOfByte.nnc.w - paramArrayOfByte.nnc.h, paramArrayOfByte.nnc.w, 0, 0, paramInt1, paramInt1);
        }
        paramLong = System.currentTimeMillis() - paramLong;
        if (paramLong > 30L) {
          w.d("MicroMsg.MT.MultiTalkVideoNativeReceiver", "steve: createBitmap: %d", new Object[] { Long.valueOf(paramLong) });
        }
        if (paramArrayOfByte.nnb != null) {
          paramArrayOfByte.nnb.post(new j.b(paramArrayOfByte));
        }
      }
      GMTrace.o(4775600979968L, 35581);
      return;
    }
  }
  
  public final void aRY()
  {
    GMTrace.i(4775064109056L, 35577);
    Iterator localIterator = this.noU.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)((RelativeLayout)localIterator.next()).getTag();
      if ((!q.zE().equals(locala.npe.username)) && (locala.npe.aSg())) {
        locala.npe.aSb();
      }
    }
    GMTrace.o(4775064109056L, 35577);
  }
  
  public final void aRZ()
  {
    GMTrace.i(4776003633152L, 35584);
    w.e("MicroMsg.MT.MultiTalkTalkingUILogic", "onCameraError");
    if (this.hwF == null) {
      this.hwF = com.tencent.mm.as.a.a(this.non, R.l.eiN, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4782848737280L, 35635);
          f.this.jr(false);
          GMTrace.o(4782848737280L, 35635);
        }
      });
    }
    if (!this.hwF.isShowing()) {
      this.hwF.show();
    }
    o.aRR().rc(1);
    GMTrace.o(4776003633152L, 35584);
  }
  
  public final void c(HashSet<String> paramHashSet)
  {
    GMTrace.i(4774929891328L, 35576);
    Iterator localIterator = this.noU.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)((RelativeLayout)localIterator.next()).getTag();
      if (!q.zE().equals(locala.npe.username)) {
        if (paramHashSet.contains(locala.npe.username))
        {
          if (!locala.npe.aSg()) {
            locala.npe.aSc();
          }
        }
        else if (locala.npe.aSg())
        {
          locala.npe.aSb();
          if ((this.noZ.equals(locala.npe.username)) && (this.noK.getVisibility() == 0))
          {
            this.noZ = "";
            this.noK.setVisibility(8);
            this.noJ.setVisibility(0);
          }
        }
      }
    }
    GMTrace.o(4774929891328L, 35576);
  }
  
  public final void go(boolean paramBoolean)
  {
    GMTrace.i(4775466762240L, 35580);
    w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onFinish");
    this.npa = 0;
    if (!paramBoolean) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4773587714048L, 35566);
          f.this.jRw.setText(R.l.dJA);
          GMTrace.o(4773587714048L, 35566);
        }
      });
    }
    jr(false);
    Iterator localIterator = this.noU.iterator();
    while (localIterator.hasNext()) {
      ((a)((RelativeLayout)localIterator.next()).getTag()).npe.setSurfaceTextureListener(null);
    }
    n.Dh().b(this);
    GMTrace.o(4775466762240L, 35580);
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(4776137850880L, 35585);
    w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "notifyChanged %s", new Object[] { paramString });
    paramString = Dh(paramString);
    if (paramString != null) {
      ((a)paramString.getTag()).npe.aSa();
    }
    GMTrace.o(4776137850880L, 35585);
  }
  
  public final void jr(boolean paramBoolean)
  {
    GMTrace.i(21050842677248L, 156841);
    if ((!paramBoolean) && (this.npb != 0L) && (System.currentTimeMillis() - this.npb > 0L) && (o.aRR().aRs()))
    {
      com.tencent.mm.plugin.multitalk.a.d.n(System.currentTimeMillis() - this.npb, com.tencent.mm.plugin.multitalk.a.i.aRH());
      this.npb = 0L;
    }
    w.i("MicroMsg.MT.MultiTalkTalkingUILogic", "stop capture render");
    Object localObject;
    if (this.noY != null)
    {
      localObject = this.noY.getParent();
      if ((localObject instanceof ViewGroup)) {
        ((ViewGroup)localObject).removeView(this.noY);
      }
      this.noY = null;
    }
    if (this.noW != null)
    {
      this.noW.stopCapture();
      com.tencent.mm.plugin.voip.video.a.bvS();
      this.noW = null;
    }
    if (this.noX != null)
    {
      localObject = this.noX;
      ((j)localObject).nmx = null;
      ((j)localObject).nnc.kNw = false;
      ((j)localObject).nnc.nng = null;
      if (((j)localObject).nnb != null)
      {
        ((j)localObject).nnb.removeCallbacksAndMessages(null);
        ((j)localObject).nnb.getLooper().quit();
        ((j)localObject).nnb = null;
      }
      this.noX = null;
    }
    GMTrace.o(21050842677248L, 156841);
  }
  
  public final void o(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4774393020416L, 35572);
    this.noL.setVisibility(0);
    LinkedList localLinkedList = new LinkedList();
    paramMultiTalkGroup = paramMultiTalkGroup.xOB.iterator();
    while (paramMultiTalkGroup.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)paramMultiTalkGroup.next();
      if ((localMultiTalkGroupMember.status == 10) || (localMultiTalkGroupMember.status == 1)) {
        localLinkedList.add(localMultiTalkGroupMember);
      }
    }
    Z(localLinkedList);
    GMTrace.o(4774393020416L, 35572);
  }
  
  public final void onClick(View paramView)
  {
    Object localObject1 = null;
    boolean bool2 = true;
    GMTrace.i(4774795673600L, 35575);
    Object localObject2;
    Object localObject3;
    if ((paramView instanceof MultiTalkVideoView))
    {
      paramView = (MultiTalkVideoView)paramView;
      if (this.noK.getVisibility() == 8)
      {
        if (!paramView.aSg())
        {
          GMTrace.o(4774795673600L, 35575);
          return;
        }
        this.noK.setVisibility(0);
        this.noJ.setVisibility(8);
        localObject2 = new FrameLayout.LayoutParams(-2, -2);
        ((FrameLayout.LayoutParams)localObject2).width = this.noS;
        ((FrameLayout.LayoutParams)localObject2).height = this.noS;
        ((FrameLayout.LayoutParams)localObject2).leftMargin = 0;
        ((FrameLayout.LayoutParams)localObject2).topMargin = 0;
        this.noV.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject2 = paramView.username;
        localObject3 = o.aRR().nmp.xOB.iterator();
        paramView = (View)localObject1;
        if (((Iterator)localObject3).hasNext())
        {
          localObject1 = (MultiTalkGroupMember)((Iterator)localObject3).next();
          if (((((MultiTalkGroupMember)localObject1).status != 10) && (((MultiTalkGroupMember)localObject1).status != 1)) || (!((MultiTalkGroupMember)localObject1).xOC.equals(localObject2))) {
            break label1060;
          }
          paramView = (View)localObject1;
        }
      }
    }
    label476:
    label1060:
    for (;;)
    {
      break;
      localObject1 = o.aRR().nmp.xOx;
      localObject1 = com.tencent.wecall.talkroom.model.c.crn().YR((String)localObject1);
      if (localObject1 != null)
      {
        localObject1 = ((TalkRoom)localObject1).crk().iterator();
        do
        {
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject3 = (a.av)((Iterator)localObject1).next();
        } while (!((a.av)localObject3).xMH.equals(localObject2));
      }
      for (int i = ((a.av)localObject3).mkl;; i = 0)
      {
        if (!((String)localObject2).equals(q.zE()))
        {
          w.d("MicroMsg.MT.MultiTalkTalkingUILogic", "steve:click memberId:%d", new Object[] { Integer.valueOf(i) });
          o.aRR().CQ((String)localObject2);
          p(true, i);
        }
        boolean bool1 = bool2;
        if (!am.is2G(this.non)) {
          if (!am.is3G(this.non)) {
            break label476;
          }
        }
        for (bool1 = bool2;; bool1 = false)
        {
          localObject1 = new HashSet();
          ((HashSet)localObject1).addAll(o.aRR().nmn);
          if (o.aRR().aRo()) {
            ((HashSet)localObject1).add(q.zE());
          }
          localObject3 = (a)this.noV.getTag();
          ((a)localObject3).npe.Di((String)localObject2);
          ((a)localObject3).npe.aSd();
          this.noV.setTag(localObject3);
          a(this.noV, paramView, bool1, (HashSet)localObject1);
          this.noV.setVisibility(0);
          this.noZ = ((String)localObject2);
          com.tencent.mm.plugin.multitalk.a.d.aRm();
          GMTrace.o(4774795673600L, 35575);
          return;
        }
        if (!paramView.username.equals(q.zE()))
        {
          w.d("MicroMsg.MT.MultiTalkTalkingUILogic", "steve: unsubscribe big video!");
          o.aRR().CQ("");
          p(false, -1);
        }
        this.noK.setVisibility(8);
        this.noJ.setVisibility(0);
        if (this.noV != null)
        {
          paramView = (a)this.noV.getTag();
          if (paramView != null) {
            paramView.npe.aSd();
          }
        }
        this.noZ = "";
        com.tencent.mm.plugin.multitalk.a.d.aRn();
        GMTrace.o(4774795673600L, 35575);
        return;
        if (paramView.getId() == R.h.cgG)
        {
          o.aRR().c(true, false, false);
          GMTrace.o(4774795673600L, 35575);
          return;
        }
        if (paramView.getId() == R.h.bOQ)
        {
          com.tencent.mm.plugin.multitalk.a.d.nme += 1;
          o.aRR().gl(true);
          com.tencent.mm.plugin.multitalk.a.d.aRl();
          GMTrace.o(4774795673600L, 35575);
          return;
        }
        if (paramView.getId() == R.h.bON)
        {
          com.tencent.mm.plugin.multitalk.a.d.nmg += 1;
          o.aRR().gm(this.noR.isChecked());
          if (this.noR.isChecked())
          {
            com.tencent.mm.plugin.multitalk.a.d.aRg();
            GMTrace.o(4774795673600L, 35575);
            return;
          }
          com.tencent.mm.plugin.multitalk.a.d.aRh();
          GMTrace.o(4774795673600L, 35575);
          return;
        }
        if (paramView.getId() == R.h.bOR)
        {
          com.tencent.mm.plugin.multitalk.a.d.nmf += 1;
          paramView = o.aRR();
          bool1 = this.noQ.isChecked();
          o.aRQ().nlX.mT(bool1);
          paramView.gg(bool1);
          if (this.noQ.isChecked())
          {
            com.tencent.mm.plugin.multitalk.a.d.aRe();
            GMTrace.o(4774795673600L, 35575);
            return;
          }
          com.tencent.mm.plugin.multitalk.a.d.aRf();
          GMTrace.o(4774795673600L, 35575);
          return;
        }
        if (paramView.getId() == R.h.bOL)
        {
          if (this.noW != null) {
            this.noW.bvR();
          }
          com.tencent.mm.plugin.multitalk.a.d.aRk();
          GMTrace.o(4774795673600L, 35575);
          return;
        }
        if (paramView.getId() == R.h.bOZ)
        {
          com.tencent.mm.plugin.multitalk.a.d.nmh += 1;
          if (!com.tencent.mm.compatible.e.b.tu())
          {
            com.tencent.mm.as.a.a(this.non, R.l.eiN, null);
            this.noP.setChecked(false);
            GMTrace.o(4774795673600L, 35575);
            return;
          }
          if (!o.aRR().aRr())
          {
            this.noP.setChecked(false);
            GMTrace.o(4774795673600L, 35575);
            return;
          }
          if (!am.isNetworkConnected(this.non))
          {
            com.tencent.mm.as.a.a(this.non, R.l.eiM, null);
            this.noP.setChecked(false);
            GMTrace.o(4774795673600L, 35575);
            return;
          }
          if (this.noP.isChecked())
          {
            a(null, false);
            com.tencent.mm.plugin.multitalk.a.d.aRi();
          }
          for (;;)
          {
            this.noP.setChecked(o.aRR().aRo());
            GMTrace.o(4774795673600L, 35575);
            return;
            jr(false);
            o.aRR().rc(1);
            com.tencent.mm.plugin.multitalk.a.d.aRj();
          }
        }
        if (paramView.getId() == R.h.bOI)
        {
          com.tencent.mm.plugin.multitalk.a.d.nmi += 1;
          this.non.aRW();
        }
        GMTrace.o(4774795673600L, 35575);
        return;
      }
    }
  }
  
  public static final class a
  {
    public MultiTalkVideoView npe;
    View npf;
    public ImageView npg;
    public ImageView nph;
    public TextView npi;
    ImageView npj;
    
    public a()
    {
      GMTrace.i(4779493294080L, 35610);
      GMTrace.o(4779493294080L, 35610);
    }
  }
  
  private final class b
    implements Runnable
  {
    f.a npk;
    
    public b(f.a parama)
    {
      GMTrace.i(4779224858624L, 35608);
      this.npk = parama;
      GMTrace.o(4779224858624L, 35608);
    }
    
    public final void run()
    {
      GMTrace.i(4779359076352L, 35609);
      this.npk.npi.setVisibility(8);
      GMTrace.o(4779359076352L, 35609);
    }
  }
  
  private final class c
  {
    public int h;
    public int[] nng;
    public int w;
    
    public c()
    {
      GMTrace.i(4782982955008L, 35636);
      GMTrace.o(4782982955008L, 35636);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */