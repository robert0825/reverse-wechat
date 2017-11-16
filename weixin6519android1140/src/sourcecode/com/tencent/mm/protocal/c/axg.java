package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axg
  extends com.tencent.mm.bm.a
{
  public int id;
  public azq uMa;
  public azq uMb;
  public azq uMc;
  public azq uMd;
  public azq uMe;
  public azq uMf;
  public azq uMg;
  public azq uMh;
  public azq uMi;
  
  public axg()
  {
    GMTrace.i(3691390173184L, 27503);
    GMTrace.o(3691390173184L, 27503);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3691524390912L, 27504);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uMb == null) {
        throw new b("Not all required fields were included: province");
      }
      if (this.uMc == null) {
        throw new b("Not all required fields were included: city");
      }
      if (this.uMd == null) {
        throw new b("Not all required fields were included: district");
      }
      if (this.uMe == null) {
        throw new b("Not all required fields were included: zipcode");
      }
      if (this.uMf == null) {
        throw new b("Not all required fields were included: detail");
      }
      if (this.uMg == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.uMh == null) {
        throw new b("Not all required fields were included: phone");
      }
      paramVarArgs.fk(1, this.id);
      if (this.uMa != null)
      {
        paramVarArgs.fm(2, this.uMa.aYq());
        this.uMa.a(paramVarArgs);
      }
      if (this.uMb != null)
      {
        paramVarArgs.fm(3, this.uMb.aYq());
        this.uMb.a(paramVarArgs);
      }
      if (this.uMc != null)
      {
        paramVarArgs.fm(4, this.uMc.aYq());
        this.uMc.a(paramVarArgs);
      }
      if (this.uMd != null)
      {
        paramVarArgs.fm(5, this.uMd.aYq());
        this.uMd.a(paramVarArgs);
      }
      if (this.uMe != null)
      {
        paramVarArgs.fm(6, this.uMe.aYq());
        this.uMe.a(paramVarArgs);
      }
      if (this.uMf != null)
      {
        paramVarArgs.fm(7, this.uMf.aYq());
        this.uMf.a(paramVarArgs);
      }
      if (this.uMg != null)
      {
        paramVarArgs.fm(8, this.uMg.aYq());
        this.uMg.a(paramVarArgs);
      }
      if (this.uMh != null)
      {
        paramVarArgs.fm(9, this.uMh.aYq());
        this.uMh.a(paramVarArgs);
      }
      if (this.uMi != null)
      {
        paramVarArgs.fm(10, this.uMi.aYq());
        this.uMi.a(paramVarArgs);
      }
      GMTrace.o(3691524390912L, 27504);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.id) + 0;
      paramInt = i;
      if (this.uMa != null) {
        paramInt = i + b.a.a.a.fj(2, this.uMa.aYq());
      }
      i = paramInt;
      if (this.uMb != null) {
        i = paramInt + b.a.a.a.fj(3, this.uMb.aYq());
      }
      paramInt = i;
      if (this.uMc != null) {
        paramInt = i + b.a.a.a.fj(4, this.uMc.aYq());
      }
      i = paramInt;
      if (this.uMd != null) {
        i = paramInt + b.a.a.a.fj(5, this.uMd.aYq());
      }
      paramInt = i;
      if (this.uMe != null) {
        paramInt = i + b.a.a.a.fj(6, this.uMe.aYq());
      }
      i = paramInt;
      if (this.uMf != null) {
        i = paramInt + b.a.a.a.fj(7, this.uMf.aYq());
      }
      paramInt = i;
      if (this.uMg != null) {
        paramInt = i + b.a.a.a.fj(8, this.uMg.aYq());
      }
      i = paramInt;
      if (this.uMh != null) {
        i = paramInt + b.a.a.a.fj(9, this.uMh.aYq());
      }
      paramInt = i;
      if (this.uMi != null) {
        paramInt = i + b.a.a.a.fj(10, this.uMi.aYq());
      }
      GMTrace.o(3691524390912L, 27504);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uMb == null) {
        throw new b("Not all required fields were included: province");
      }
      if (this.uMc == null) {
        throw new b("Not all required fields were included: city");
      }
      if (this.uMd == null) {
        throw new b("Not all required fields were included: district");
      }
      if (this.uMe == null) {
        throw new b("Not all required fields were included: zipcode");
      }
      if (this.uMf == null) {
        throw new b("Not all required fields were included: detail");
      }
      if (this.uMg == null) {
        throw new b("Not all required fields were included: name");
      }
      if (this.uMh == null) {
        throw new b("Not all required fields were included: phone");
      }
      GMTrace.o(3691524390912L, 27504);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axg localaxg = (axg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3691524390912L, 27504);
        return -1;
      case 1: 
        localaxg.id = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3691524390912L, 27504);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxg.uMa = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3691524390912L, 27504);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxg.uMb = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3691524390912L, 27504);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxg.uMc = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3691524390912L, 27504);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxg.uMd = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3691524390912L, 27504);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxg.uMe = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3691524390912L, 27504);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxg.uMf = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3691524390912L, 27504);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxg.uMg = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3691524390912L, 27504);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxg.uMh = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3691524390912L, 27504);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaxg.uMi = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3691524390912L, 27504);
      return 0;
    }
    GMTrace.o(3691524390912L, 27504);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\axg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */