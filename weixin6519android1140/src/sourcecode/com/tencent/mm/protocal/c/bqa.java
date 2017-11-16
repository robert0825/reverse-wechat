package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bqa
  extends ayx
{
  public long uXW;
  public bpz uYP;
  public bpz vai;
  public bpz vaj;
  public bpz vak;
  public bpz val;
  
  public bqa()
  {
    GMTrace.i(3645621927936L, 27162);
    GMTrace.o(3645621927936L, 27162);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3645756145664L, 27163);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uYP == null) {
        throw new b("Not all required fields were included: ReportData");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uYP != null)
      {
        paramVarArgs.fm(2, this.uYP.aYq());
        this.uYP.a(paramVarArgs);
      }
      if (this.vai != null)
      {
        paramVarArgs.fm(3, this.vai.aYq());
        this.vai.a(paramVarArgs);
      }
      if (this.vaj != null)
      {
        paramVarArgs.fm(4, this.vaj.aYq());
        this.vaj.a(paramVarArgs);
      }
      if (this.vak != null)
      {
        paramVarArgs.fm(5, this.vak.aYq());
        this.vak.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.uXW);
      if (this.val != null)
      {
        paramVarArgs.fm(7, this.val.aYq());
        this.val.a(paramVarArgs);
      }
      GMTrace.o(3645756145664L, 27163);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.uYP != null) {
        paramInt = i + b.a.a.a.fj(2, this.uYP.aYq());
      }
      i = paramInt;
      if (this.vai != null) {
        i = paramInt + b.a.a.a.fj(3, this.vai.aYq());
      }
      paramInt = i;
      if (this.vaj != null) {
        paramInt = i + b.a.a.a.fj(4, this.vaj.aYq());
      }
      i = paramInt;
      if (this.vak != null) {
        i = paramInt + b.a.a.a.fj(5, this.vak.aYq());
      }
      i += b.a.a.a.S(6, this.uXW);
      paramInt = i;
      if (this.val != null) {
        paramInt = i + b.a.a.a.fj(7, this.val.aYq());
      }
      GMTrace.o(3645756145664L, 27163);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uYP == null) {
        throw new b("Not all required fields were included: ReportData");
      }
      GMTrace.o(3645756145664L, 27163);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bqa localbqa = (bqa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3645756145664L, 27163);
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
          localbqa.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3645756145664L, 27163);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbqa.uYP = ((bpz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3645756145664L, 27163);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbqa.vai = ((bpz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3645756145664L, 27163);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbqa.vaj = ((bpz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3645756145664L, 27163);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbqa.vak = ((bpz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3645756145664L, 27163);
        return 0;
      case 6: 
        localbqa.uXW = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3645756145664L, 27163);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bpz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bpz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbqa.val = ((bpz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3645756145664L, 27163);
      return 0;
    }
    GMTrace.o(3645756145664L, 27163);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */