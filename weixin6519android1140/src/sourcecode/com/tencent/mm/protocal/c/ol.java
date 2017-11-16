package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ol
  extends azh
{
  public int jNj;
  public LinkedList<anz> tPE;
  public azq tPF;
  public azp tQa;
  public String ubV;
  public String ubW;
  public azq ufm;
  public azq ufo;
  public azq ufp;
  
  public ol()
  {
    GMTrace.i(3828963344384L, 28528);
    this.tPE = new LinkedList();
    GMTrace.o(3828963344384L, 28528);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3829097562112L, 28529);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ufm == null) {
        throw new b("Not all required fields were included: Topic");
      }
      if (this.ufo == null) {
        throw new b("Not all required fields were included: PYInitial");
      }
      if (this.ufp == null) {
        throw new b("Not all required fields were included: QuanPin");
      }
      if (this.tPF == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.ufm != null)
      {
        paramVarArgs.fm(2, this.ufm.aYq());
        this.ufm.a(paramVarArgs);
      }
      if (this.ufo != null)
      {
        paramVarArgs.fm(3, this.ufo.aYq());
        this.ufo.a(paramVarArgs);
      }
      if (this.ufp != null)
      {
        paramVarArgs.fm(4, this.ufp.aYq());
        this.ufp.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.jNj);
      paramVarArgs.d(6, 8, this.tPE);
      if (this.tPF != null)
      {
        paramVarArgs.fm(7, this.tPF.aYq());
        this.tPF.a(paramVarArgs);
      }
      if (this.tQa != null)
      {
        paramVarArgs.fm(8, this.tQa.aYq());
        this.tQa.a(paramVarArgs);
      }
      if (this.ubV != null) {
        paramVarArgs.e(9, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(10, this.ubW);
      }
      GMTrace.o(3829097562112L, 28529);
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
      if (this.ufm != null) {
        paramInt = i + b.a.a.a.fj(2, this.ufm.aYq());
      }
      i = paramInt;
      if (this.ufo != null) {
        i = paramInt + b.a.a.a.fj(3, this.ufo.aYq());
      }
      paramInt = i;
      if (this.ufp != null) {
        paramInt = i + b.a.a.a.fj(4, this.ufp.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.jNj) + b.a.a.a.c(6, 8, this.tPE);
      paramInt = i;
      if (this.tPF != null) {
        paramInt = i + b.a.a.a.fj(7, this.tPF.aYq());
      }
      i = paramInt;
      if (this.tQa != null) {
        i = paramInt + b.a.a.a.fj(8, this.tQa.aYq());
      }
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.ubW);
      }
      GMTrace.o(3829097562112L, 28529);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tPE.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.ufm == null) {
        throw new b("Not all required fields were included: Topic");
      }
      if (this.ufo == null) {
        throw new b("Not all required fields were included: PYInitial");
      }
      if (this.ufp == null) {
        throw new b("Not all required fields were included: QuanPin");
      }
      if (this.tPF == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.tQa == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      GMTrace.o(3829097562112L, 28529);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ol localol = (ol)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3829097562112L, 28529);
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
          localol.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829097562112L, 28529);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localol.ufm = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829097562112L, 28529);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localol.ufo = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829097562112L, 28529);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localol.ufp = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829097562112L, 28529);
        return 0;
      case 5: 
        localol.jNj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3829097562112L, 28529);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((anz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localol.tPE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829097562112L, 28529);
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
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localol.tPF = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829097562112L, 28529);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localol.tQa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3829097562112L, 28529);
        return 0;
      case 9: 
        localol.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3829097562112L, 28529);
        return 0;
      }
      localol.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3829097562112L, 28529);
      return 0;
    }
    GMTrace.o(3829097562112L, 28529);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */