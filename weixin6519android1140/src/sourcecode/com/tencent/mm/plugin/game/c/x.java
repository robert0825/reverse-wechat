package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class x
  extends com.tencent.mm.bm.a
{
  public String lPF;
  public String lQn;
  public String lQo;
  public int lQp;
  public int lQq;
  public bf lQr;
  public be lQs;
  public bg lQt;
  public cn lQu;
  
  public x()
  {
    GMTrace.i(12642907324416L, 94197);
    GMTrace.o(12642907324416L, 94197);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12643041542144L, 94198);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQn != null) {
        paramVarArgs.e(1, this.lQn);
      }
      if (this.lQo != null) {
        paramVarArgs.e(2, this.lQo);
      }
      paramVarArgs.fk(3, this.lQp);
      if (this.lPF != null) {
        paramVarArgs.e(4, this.lPF);
      }
      paramVarArgs.fk(5, this.lQq);
      if (this.lQr != null)
      {
        paramVarArgs.fm(6, this.lQr.aYq());
        this.lQr.a(paramVarArgs);
      }
      if (this.lQs != null)
      {
        paramVarArgs.fm(7, this.lQs.aYq());
        this.lQs.a(paramVarArgs);
      }
      if (this.lQt != null)
      {
        paramVarArgs.fm(9, this.lQt.aYq());
        this.lQt.a(paramVarArgs);
      }
      if (this.lQu != null)
      {
        paramVarArgs.fm(10, this.lQu.aYq());
        this.lQu.a(paramVarArgs);
      }
      GMTrace.o(12643041542144L, 94198);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lQn != null) {
        paramInt = b.a.a.b.b.a.f(1, this.lQn) + 0;
      }
      i = paramInt;
      if (this.lQo != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQo);
      }
      i += b.a.a.a.fh(3, this.lQp);
      paramInt = i;
      if (this.lPF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPF);
      }
      i = paramInt + b.a.a.a.fh(5, this.lQq);
      paramInt = i;
      if (this.lQr != null) {
        paramInt = i + b.a.a.a.fj(6, this.lQr.aYq());
      }
      i = paramInt;
      if (this.lQs != null) {
        i = paramInt + b.a.a.a.fj(7, this.lQs.aYq());
      }
      paramInt = i;
      if (this.lQt != null) {
        paramInt = i + b.a.a.a.fj(9, this.lQt.aYq());
      }
      i = paramInt;
      if (this.lQu != null) {
        i = paramInt + b.a.a.a.fj(10, this.lQu.aYq());
      }
      GMTrace.o(12643041542144L, 94198);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12643041542144L, 94198);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      x localx = (x)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 8: 
      default: 
        GMTrace.o(12643041542144L, 94198);
        return -1;
      case 1: 
        localx.lQn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 2: 
        localx.lQo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 3: 
        localx.lQp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 4: 
        localx.lPF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 5: 
        localx.lQq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localx.lQr = ((bf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new be();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((be)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localx.lQs = ((be)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643041542144L, 94198);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bg();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localx.lQt = ((bg)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643041542144L, 94198);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cn();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localx.lQu = ((cn)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12643041542144L, 94198);
      return 0;
    }
    GMTrace.o(12643041542144L, 94198);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */