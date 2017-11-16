package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class blu
  extends ayx
{
  public String jhi;
  public int tSK;
  public String tUD;
  public LinkedList<aoi> uAR;
  public int uVH;
  public int uVI;
  public LinkedList<ami> uVJ;
  
  public blu()
  {
    GMTrace.i(3716354670592L, 27689);
    this.uAR = new LinkedList();
    this.uVJ = new LinkedList();
    GMTrace.o(3716354670592L, 27689);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3716488888320L, 27690);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      paramVarArgs.fk(3, this.tSK);
      if (this.tUD != null) {
        paramVarArgs.e(4, this.tUD);
      }
      paramVarArgs.fk(5, this.uVH);
      paramVarArgs.d(6, 8, this.uAR);
      paramVarArgs.fk(7, this.uVI);
      paramVarArgs.d(8, 8, this.uVJ);
      GMTrace.o(3716488888320L, 27690);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jhi);
      }
      i += b.a.a.a.fh(3, this.tSK);
      paramInt = i;
      if (this.tUD != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tUD);
      }
      i = b.a.a.a.fh(5, this.uVH);
      int j = b.a.a.a.c(6, 8, this.uAR);
      int k = b.a.a.a.fh(7, this.uVI);
      int m = b.a.a.a.c(8, 8, this.uVJ);
      GMTrace.o(3716488888320L, 27690);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uAR.clear();
      this.uVJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3716488888320L, 27690);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      blu localblu = (blu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3716488888320L, 27690);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localblu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3716488888320L, 27690);
        return 0;
      case 2: 
        localblu.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716488888320L, 27690);
        return 0;
      case 3: 
        localblu.tSK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3716488888320L, 27690);
        return 0;
      case 4: 
        localblu.tUD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716488888320L, 27690);
        return 0;
      case 5: 
        localblu.uVH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3716488888320L, 27690);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aoi();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aoi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localblu.uAR.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3716488888320L, 27690);
        return 0;
      case 7: 
        localblu.uVI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3716488888320L, 27690);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ami();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ami)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localblu.uVJ.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3716488888320L, 27690);
      return 0;
    }
    GMTrace.o(3716488888320L, 27690);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\blu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */