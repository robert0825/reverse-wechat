package com.tencent.mm.ao;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements e, f
{
  List<b> gGE;
  private HashSet<b> gGF;
  b gGG;
  private j gGH;
  public boolean gGI;
  
  public c()
  {
    GMTrace.i(3536234479616L, 26347);
    this.gGG = null;
    this.gGH = null;
    this.gGI = false;
    this.gGE = new LinkedList();
    this.gGF = new HashSet();
    h.xx().fYr.a(109, this);
    GMTrace.o(3536234479616L, 26347);
  }
  
  private boolean a(b paramb)
  {
    GMTrace.i(3537039785984L, 26353);
    if ((paramb == null) || (paramb.gGN.size() > 0))
    {
      GMTrace.o(3537039785984L, 26353);
      return false;
    }
    boolean bool = b(paramb);
    GMTrace.o(3537039785984L, 26353);
    return bool;
  }
  
  private static void c(b paramb)
  {
    GMTrace.i(3537442439168L, 26356);
    if (paramb == null)
    {
      w.e("ModelImage.DownloadImgService", "task is null");
      GMTrace.o(3537442439168L, 26356);
      return;
    }
    if (paramb.gGN == null)
    {
      w.e("ModelImage.DownloadImgService", "task callback list is null");
      GMTrace.o(3537442439168L, 26356);
      return;
    }
    Iterator localIterator = paramb.gGN.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.gGP != null) {
        localc.gGP.a(paramb.gGJ, paramb.gGK, paramb.gGL, paramb.gGM, localc.gGQ);
      }
    }
    GMTrace.o(3537442439168L, 26356);
  }
  
  private void gj(int paramInt)
  {
    GMTrace.i(3537979310080L, 26360);
    if ((this.gGG != null) || (this.gGE.size() <= 0) || (true == this.gGI))
    {
      GMTrace.o(3537979310080L, 26360);
      return;
    }
    this.gGG = ((b)this.gGE.get(0));
    this.gGE.remove(0);
    this.gGH = new j(this.gGG.gGJ, this.gGG.gGK, this.gGG.gGL, this, paramInt);
    this.gGH.gIt = this.gGG.gGM;
    w.i("ModelImage.DownloadImgService", "do scene, (" + this.gGG.gGJ + ", " + this.gGG.gGK + ", " + this.gGG.gGL + ")");
    h.xx().fYr.a(this.gGH, 0);
    GMTrace.o(3537979310080L, 26360);
  }
  
  public final void ID()
  {
    GMTrace.i(3537576656896L, 26357);
    this.gGI = false;
    gj(-1);
    GMTrace.o(3537576656896L, 26357);
  }
  
  public final int a(long paramLong1, long paramLong2, int paramInt1, Object paramObject, int paramInt2, a parama, int paramInt3)
  {
    GMTrace.i(3536502915072L, 26349);
    if (parama == null)
    {
      w.e("ModelImage.DownloadImgService", "listener is null");
      GMTrace.o(3536502915072L, 26349);
      return -1;
    }
    b localb = new b(paramLong1, paramLong2, paramInt1);
    localb.gGM = paramInt2;
    if (this.gGF.contains(localb))
    {
      w.e("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] add failed, task already done");
      GMTrace.o(3536502915072L, 26349);
      return -2;
    }
    if ((this.gGG != null) && (localb.equals(this.gGG)))
    {
      if (this.gGG.a(parama, paramObject))
      {
        GMTrace.o(3536502915072L, 26349);
        return 0;
      }
      GMTrace.o(3536502915072L, 26349);
      return -3;
    }
    paramInt2 = this.gGE.indexOf(localb);
    if ((paramInt2 >= 0) && (paramInt2 < this.gGE.size()))
    {
      if (((b)this.gGE.get(paramInt2)).a(parama, paramObject))
      {
        GMTrace.o(3536502915072L, 26349);
        return 0;
      }
      GMTrace.o(3536502915072L, 26349);
      return -4;
    }
    w.i("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] no found task, create a new task(" + paramLong1 + " " + paramLong2 + " " + paramInt1 + ")");
    localb.a(parama, paramObject);
    this.gGE.add(localb);
    gj(paramInt3);
    GMTrace.o(3536502915072L, 26349);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(3537845092352L, 26359);
    if (this.gGH != paramk)
    {
      w.d("ModelImage.DownloadImgService", "scene changed");
      GMTrace.o(3537845092352L, 26359);
      return;
    }
    Iterator localIterator = this.gGG.gGN.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.gGP != null) {
        localc.gGP.a(this.gGG.gGJ, this.gGG.gGK, this.gGG.gGL, this.gGG.gGM, localc.gGQ, paramInt1, paramInt2, paramk);
      }
    }
    GMTrace.o(3537845092352L, 26359);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(3537710874624L, 26358);
    if (this.gGH != paramk)
    {
      w.d("ModelImage.DownloadImgService", "scene changed");
      GMTrace.o(3537710874624L, 26358);
      return;
    }
    this.gGF.add(new b(this.gGG.gGJ, this.gGG.gGK, this.gGG.gGL));
    w.i("ModelImage.DownloadImgService", "scene end, (" + this.gGG.gGJ + ", " + this.gGG.gGK + ", " + this.gGG.gGL + ")");
    Iterator localIterator = this.gGG.gGN.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.gGP != null) {
        localc.gGP.a(this.gGG.gGJ, this.gGG.gGK, this.gGG.gGL, this.gGG.gGM, localc.gGQ, paramInt1, paramInt2, paramString, paramk);
      }
    }
    this.gGG = null;
    this.gGH = null;
    gj(-1);
    GMTrace.o(3537710874624L, 26358);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(3536905568256L, 26352);
    if (parama == null)
    {
      w.e("ModelImage.DownloadImgService", "listener is null");
      GMTrace.o(3536905568256L, 26352);
      return;
    }
    w.i("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] cancel all tasks of listener");
    this.gGI = true;
    if (this.gGG != null)
    {
      this.gGG.b(parama);
      a(this.gGG);
    }
    Object localObject1 = new LinkedList();
    Object localObject2 = this.gGE.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((List)localObject1).add((b)((Iterator)localObject2).next());
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (b)((Iterator)localObject1).next();
      ((b)localObject2).b(parama);
      a((b)localObject2);
    }
    ID();
    GMTrace.o(3536905568256L, 26352);
  }
  
  public final boolean a(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(3536637132800L, 26350);
    b localb = new b(paramLong1, paramLong2, paramInt);
    if ((this.gGG != null) && (this.gGG.equals(localb)))
    {
      GMTrace.o(3536637132800L, 26350);
      return true;
    }
    if (this.gGE.indexOf(localb) >= 0)
    {
      GMTrace.o(3536637132800L, 26350);
      return true;
    }
    GMTrace.o(3536637132800L, 26350);
    return false;
  }
  
  public final boolean a(long paramLong1, long paramLong2, int paramInt1, Object paramObject, int paramInt2, a parama)
  {
    GMTrace.i(3536368697344L, 26348);
    if (a(paramLong1, paramLong2, paramInt1, paramObject, paramInt2, parama, -1) >= 0)
    {
      GMTrace.o(3536368697344L, 26348);
      return true;
    }
    GMTrace.o(3536368697344L, 26348);
    return false;
  }
  
  public final boolean a(long paramLong1, long paramLong2, a parama)
  {
    GMTrace.i(3536771350528L, 26351);
    if (parama == null)
    {
      w.e("ModelImage.DownloadImgService", "listener is null");
      GMTrace.o(3536771350528L, 26351);
      return false;
    }
    b localb2 = new b(paramLong1, paramLong2, 1);
    b localb1 = null;
    if ((this.gGG != null) && (this.gGG.equals(localb2))) {
      localb1 = this.gGG;
    }
    while (localb1 != null)
    {
      localb1.b(parama);
      a(localb1);
      w.i("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] task has been canceled, (" + paramLong1 + ", " + paramLong2 + ", 1)");
      GMTrace.o(3536771350528L, 26351);
      return true;
      int i = this.gGE.indexOf(localb2);
      if (-1 != i) {
        localb1 = (b)this.gGE.get(i);
      }
    }
    w.e("ModelImage.DownloadImgService", "[" + parama.hashCode() + "] task no found, (" + paramLong1 + ", " + paramLong2 + ", 1)");
    GMTrace.o(3536771350528L, 26351);
    return false;
  }
  
  final boolean b(b paramb)
  {
    GMTrace.i(3537308221440L, 26355);
    if (paramb == null)
    {
      w.e("ModelImage.DownloadImgService", "task is null");
      GMTrace.o(3537308221440L, 26355);
      return false;
    }
    w.i("ModelImage.DownloadImgService", "cancel scene, (" + paramb.gGJ + ", " + paramb.gGK + ", " + paramb.gGL + ")");
    if ((this.gGG != null) && (this.gGG.equals(paramb)))
    {
      h.xx().fYr.c(this.gGH);
      this.gGH = null;
      c(this.gGG);
      this.gGG = null;
      gj(-1);
      GMTrace.o(3537308221440L, 26355);
      return true;
    }
    if (this.gGE.contains(paramb))
    {
      int i = this.gGE.indexOf(paramb);
      paramb = (b)this.gGE.get(i);
      if (paramb != null)
      {
        this.gGE.remove(paramb);
        c(paramb);
      }
      GMTrace.o(3537308221440L, 26355);
      return true;
    }
    GMTrace.o(3537308221440L, 26355);
    return false;
  }
  
  public final boolean f(long paramLong1, long paramLong2)
  {
    GMTrace.i(3537174003712L, 26354);
    boolean bool = b(new b(paramLong1, paramLong2, 1));
    GMTrace.o(3537174003712L, 26354);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject);
    
    public abstract void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, k paramk);
    
    public abstract void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, k paramk);
  }
  
  private static final class b
  {
    public long gGJ;
    public long gGK;
    public int gGL;
    public int gGM;
    public List<c.c> gGN;
    private int gGO;
    
    public b(long paramLong1, long paramLong2, int paramInt)
    {
      GMTrace.i(3538381963264L, 26363);
      this.gGO = 0;
      this.gGJ = paramLong1;
      this.gGK = paramLong2;
      this.gGL = paramInt;
      this.gGM = 0;
      GMTrace.o(3538381963264L, 26363);
    }
    
    public final boolean a(c.a parama, Object paramObject)
    {
      GMTrace.i(3538516180992L, 26364);
      if (this.gGN == null) {
        this.gGN = new LinkedList();
      }
      parama = new c.c(parama, paramObject);
      if (this.gGN.contains(parama))
      {
        w.d("ModelImage.DownloadImgService.Task", "task item already exists");
        GMTrace.o(3538516180992L, 26364);
        return false;
      }
      this.gGN.add(parama);
      GMTrace.o(3538516180992L, 26364);
      return true;
    }
    
    public final boolean b(c.a parama)
    {
      GMTrace.i(3538650398720L, 26365);
      parama = new c.c(parama, null);
      if (this.gGN.contains(parama))
      {
        this.gGN.remove(parama);
        GMTrace.o(3538650398720L, 26365);
        return true;
      }
      GMTrace.o(3538650398720L, 26365);
      return false;
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(3538784616448L, 26366);
      if ((paramObject == null) || (!(paramObject instanceof b)))
      {
        GMTrace.o(3538784616448L, 26366);
        return false;
      }
      paramObject = (b)paramObject;
      if ((((b)paramObject).gGJ == this.gGJ) && (((b)paramObject).gGK == this.gGK) && (((b)paramObject).gGL == this.gGL))
      {
        GMTrace.o(3538784616448L, 26366);
        return true;
      }
      GMTrace.o(3538784616448L, 26366);
      return false;
    }
    
    public final int hashCode()
    {
      GMTrace.i(3538918834176L, 26367);
      if (this.gGO == 0) {
        this.gGO = (this.gGJ + "_" + this.gGK + "_" + this.gGL).hashCode();
      }
      int i = this.gGO;
      GMTrace.o(3538918834176L, 26367);
      return i;
    }
  }
  
  private static final class c
  {
    public c.a gGP;
    public Object gGQ;
    
    public c(c.a parama, Object paramObject)
    {
      GMTrace.i(3508451409920L, 26140);
      this.gGP = parama;
      this.gGQ = paramObject;
      GMTrace.o(3508451409920L, 26140);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(3508585627648L, 26141);
      if ((paramObject == null) || (!(paramObject instanceof c)))
      {
        GMTrace.o(3508585627648L, 26141);
        return false;
      }
      paramObject = (c)paramObject;
      if (this.gGP == ((c)paramObject).gGP)
      {
        GMTrace.o(3508585627648L, 26141);
        return true;
      }
      GMTrace.o(3508585627648L, 26141);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */