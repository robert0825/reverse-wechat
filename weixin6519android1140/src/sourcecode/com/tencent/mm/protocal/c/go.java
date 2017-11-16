package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class go
  extends azh
{
  public int jhA;
  public int tOB;
  public int tOy;
  public azp tQa;
  public azp tSd;
  public azp tSj;
  public azt tUX;
  public String tVe;
  public azq tVh;
  public azp tVi;
  public int tVk;
  public String tVl;
  public String tVm;
  
  public go()
  {
    GMTrace.i(3763062439936L, 28037);
    GMTrace.o(3763062439936L, 28037);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3763196657664L, 28038);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tVe != null) {
        paramVarArgs.e(2, this.tVe);
      }
      if (this.tQa != null)
      {
        paramVarArgs.fm(3, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tOB);
      paramVarArgs.fk(5, this.tVk);
      if (this.tVl != null) {
        paramVarArgs.e(6, this.tVl);
      }
      paramVarArgs.fk(7, this.jhA);
      if (this.tVm != null) {
        paramVarArgs.e(8, this.tVm);
      }
      if (this.tVh != null)
      {
        paramVarArgs.fm(9, this.tVh.aYq());
        this.tVh.a(paramVarArgs);
      }
      if (this.tSj != null)
      {
        paramVarArgs.fm(10, this.tSj.aYq());
        this.tSj.a(paramVarArgs);
      }
      if (this.tVi != null)
      {
        paramVarArgs.fm(11, this.tVi.aYq());
        this.tVi.a(paramVarArgs);
      }
      if (this.tUX != null)
      {
        paramVarArgs.fm(12, this.tUX.aYq());
        this.tUX.a(paramVarArgs);
      }
      paramVarArgs.fk(13, this.tOy);
      if (this.tSd != null)
      {
        paramVarArgs.fm(14, this.tSd.aYq());
        this.tSd.a(paramVarArgs);
      }
      GMTrace.o(3763196657664L, 28038);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.tVe != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tVe);
      }
      i = paramInt;
      if (this.tQa != null) {
        i = paramInt + b.a.a.a.fj(3, this.tQa.aYq());
      }
      i = i + b.a.a.a.fh(4, this.tOB) + b.a.a.a.fh(5, this.tVk);
      paramInt = i;
      if (this.tVl != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tVl);
      }
      i = paramInt + b.a.a.a.fh(7, this.jhA);
      paramInt = i;
      if (this.tVm != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tVm);
      }
      i = paramInt;
      if (this.tVh != null) {
        i = paramInt + b.a.a.a.fj(9, this.tVh.aYq());
      }
      paramInt = i;
      if (this.tSj != null) {
        paramInt = i + b.a.a.a.fj(10, this.tSj.aYq());
      }
      i = paramInt;
      if (this.tVi != null) {
        i = paramInt + b.a.a.a.fj(11, this.tVi.aYq());
      }
      paramInt = i;
      if (this.tUX != null) {
        paramInt = i + b.a.a.a.fj(12, this.tUX.aYq());
      }
      i = paramInt + b.a.a.a.fh(13, this.tOy);
      paramInt = i;
      if (this.tSd != null) {
        paramInt = i + b.a.a.a.fj(14, this.tSd.aYq());
      }
      GMTrace.o(3763196657664L, 28038);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      GMTrace.o(3763196657664L, 28038);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      go localgo = (go)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3763196657664L, 28038);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 2: 
        localgo.tVe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgo.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 4: 
        localgo.tOB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 5: 
        localgo.tVk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 6: 
        localgo.tVl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 7: 
        localgo.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 8: 
        localgo.tVm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgo.tVh = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgo.tSj = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgo.tVi = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgo.tUX = ((azt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3763196657664L, 28038);
        return 0;
      case 13: 
        localgo.tOy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3763196657664L, 28038);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localgo.tSd = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3763196657664L, 28038);
      return 0;
    }
    GMTrace.o(3763196657664L, 28038);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\go.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */