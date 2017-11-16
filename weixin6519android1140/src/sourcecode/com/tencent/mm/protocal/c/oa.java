package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class oa
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPM;
  public String lPj;
  public int ueV;
  public LinkedList<anu> ueW;
  public int ueX;
  public String ueY;
  
  public oa()
  {
    GMTrace.i(3744003522560L, 27895);
    this.ueW = new LinkedList();
    GMTrace.o(3744003522560L, 27895);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3744137740288L, 27896);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPj != null) {
        paramVarArgs.e(1, this.lPj);
      }
      paramVarArgs.fk(2, this.ueV);
      if (this.eBt != null) {
        paramVarArgs.e(3, this.eBt);
      }
      if (this.lPM != null) {
        paramVarArgs.e(4, this.lPM);
      }
      paramVarArgs.d(5, 8, this.ueW);
      paramVarArgs.fk(6, this.ueX);
      if (this.ueY != null) {
        paramVarArgs.e(7, this.ueY);
      }
      GMTrace.o(3744137740288L, 27896);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lPj != null) {
        paramInt = b.a.a.b.b.a.f(1, this.lPj) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.ueV);
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.eBt);
      }
      i = paramInt;
      if (this.lPM != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lPM);
      }
      i = i + b.a.a.a.c(5, 8, this.ueW) + b.a.a.a.fh(6, this.ueX);
      paramInt = i;
      if (this.ueY != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ueY);
      }
      GMTrace.o(3744137740288L, 27896);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ueW.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3744137740288L, 27896);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      oa localoa = (oa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3744137740288L, 27896);
        return -1;
      case 1: 
        localoa.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3744137740288L, 27896);
        return 0;
      case 2: 
        localoa.ueV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3744137740288L, 27896);
        return 0;
      case 3: 
        localoa.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3744137740288L, 27896);
        return 0;
      case 4: 
        localoa.lPM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3744137740288L, 27896);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((anu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localoa.ueW.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3744137740288L, 27896);
        return 0;
      case 6: 
        localoa.ueX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3744137740288L, 27896);
        return 0;
      }
      localoa.ueY = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3744137740288L, 27896);
      return 0;
    }
    GMTrace.o(3744137740288L, 27896);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\oa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */