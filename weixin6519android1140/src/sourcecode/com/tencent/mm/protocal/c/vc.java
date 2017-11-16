package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vc
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int type;
  public LinkedList<uw> unq;
  public LinkedList<ve> unr;
  public String uns;
  public String unt;
  public LinkedList<vd> unu;
  public int unv;
  public boolean unw;
  
  public vc()
  {
    GMTrace.i(3940364058624L, 29358);
    this.unq = new LinkedList();
    this.unr = new LinkedList();
    this.unu = new LinkedList();
    GMTrace.o(3940364058624L, 29358);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3940498276352L, 29359);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      paramVarArgs.fk(2, this.type);
      paramVarArgs.d(3, 8, this.unq);
      paramVarArgs.d(4, 8, this.unr);
      if (this.uns != null) {
        paramVarArgs.e(5, this.uns);
      }
      if (this.unt != null) {
        paramVarArgs.e(6, this.unt);
      }
      paramVarArgs.d(7, 8, this.unu);
      paramVarArgs.fk(8, this.unv);
      paramVarArgs.ah(9, this.unw);
      GMTrace.o(3940498276352L, 29359);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.eBt != null) {
        paramInt = b.a.a.b.b.a.f(1, this.eBt) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.type) + b.a.a.a.c(3, 8, this.unq) + b.a.a.a.c(4, 8, this.unr);
      paramInt = i;
      if (this.uns != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uns);
      }
      i = paramInt;
      if (this.unt != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.unt);
      }
      paramInt = b.a.a.a.c(7, 8, this.unu);
      int j = b.a.a.a.fh(8, this.unv);
      int k = b.a.a.b.b.a.cK(9);
      GMTrace.o(3940498276352L, 29359);
      return i + paramInt + j + (k + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.unq.clear();
      this.unr.clear();
      this.unu.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3940498276352L, 29359);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vc localvc = (vc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3940498276352L, 29359);
        return -1;
      case 1: 
        localvc.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 2: 
        localvc.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((uw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localvc.unq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ve();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ve)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localvc.unr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 5: 
        localvc.uns = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 6: 
        localvc.unt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new vd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((vd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localvc.unu.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3940498276352L, 29359);
        return 0;
      case 8: 
        localvc.unv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3940498276352L, 29359);
        return 0;
      }
      localvc.unw = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(3940498276352L, 29359);
      return 0;
    }
    GMTrace.o(3940498276352L, 29359);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\vc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */