package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;
import java.util.LinkedList;

public final class am
  extends azh
{
  public c lPb;
  public String lQV;
  public LinkedList<q> lQW;
  public bm lQX;
  public az lQY;
  public aw lQZ;
  public bx lRa;
  public LinkedList<r> lRb;
  public cc lRc;
  public ay lRd;
  public av lRe;
  
  public am()
  {
    GMTrace.i(12635928002560L, 94145);
    this.lQW = new LinkedList();
    this.lRb = new LinkedList();
    GMTrace.o(12635928002560L, 94145);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12636062220288L, 94146);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.lQV == null) {
        throw new b("Not all required fields were included: BackGroundURL");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.lPb != null)
      {
        paramVarArgs.fm(2, this.lPb.aYq());
        this.lPb.a(paramVarArgs);
      }
      if (this.lQV != null) {
        paramVarArgs.e(3, this.lQV);
      }
      paramVarArgs.d(4, 8, this.lQW);
      if (this.lQX != null)
      {
        paramVarArgs.fm(5, this.lQX.aYq());
        this.lQX.a(paramVarArgs);
      }
      if (this.lQY != null)
      {
        paramVarArgs.fm(7, this.lQY.aYq());
        this.lQY.a(paramVarArgs);
      }
      if (this.lQZ != null)
      {
        paramVarArgs.fm(8, this.lQZ.aYq());
        this.lQZ.a(paramVarArgs);
      }
      if (this.lRa != null)
      {
        paramVarArgs.fm(9, this.lRa.aYq());
        this.lRa.a(paramVarArgs);
      }
      paramVarArgs.d(10, 8, this.lRb);
      if (this.lRc != null)
      {
        paramVarArgs.fm(11, this.lRc.aYq());
        this.lRc.a(paramVarArgs);
      }
      if (this.lRd != null)
      {
        paramVarArgs.fm(12, this.lRd.aYq());
        this.lRd.a(paramVarArgs);
      }
      if (this.lRe != null)
      {
        paramVarArgs.fm(13, this.lRe.aYq());
        this.lRe.a(paramVarArgs);
      }
      GMTrace.o(12636062220288L, 94146);
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
      if (this.lPb != null) {
        paramInt = i + b.a.a.a.fj(2, this.lPb.aYq());
      }
      i = paramInt;
      if (this.lQV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lQV);
      }
      i += b.a.a.a.c(4, 8, this.lQW);
      paramInt = i;
      if (this.lQX != null) {
        paramInt = i + b.a.a.a.fj(5, this.lQX.aYq());
      }
      i = paramInt;
      if (this.lQY != null) {
        i = paramInt + b.a.a.a.fj(7, this.lQY.aYq());
      }
      paramInt = i;
      if (this.lQZ != null) {
        paramInt = i + b.a.a.a.fj(8, this.lQZ.aYq());
      }
      i = paramInt;
      if (this.lRa != null) {
        i = paramInt + b.a.a.a.fj(9, this.lRa.aYq());
      }
      i += b.a.a.a.c(10, 8, this.lRb);
      paramInt = i;
      if (this.lRc != null) {
        paramInt = i + b.a.a.a.fj(11, this.lRc.aYq());
      }
      i = paramInt;
      if (this.lRd != null) {
        i = paramInt + b.a.a.a.fj(12, this.lRd.aYq());
      }
      paramInt = i;
      if (this.lRe != null) {
        paramInt = i + b.a.a.a.fj(13, this.lRe.aYq());
      }
      GMTrace.o(12636062220288L, 94146);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lQW.clear();
      this.lRb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.lQV == null) {
        throw new b("Not all required fields were included: BackGroundURL");
      }
      GMTrace.o(12636062220288L, 94146);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      am localam = (am)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 6: 
      default: 
        GMTrace.o(12636062220288L, 94146);
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
          localam.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lPb = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 3: 
        localam.lQV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new q();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((q)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lQW.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lQX = ((bm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new az();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((az)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lQY = ((az)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lQZ = ((aw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lRa = ((bx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new r();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((r)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lRb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lRc = ((cc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ay();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ay)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localam.lRd = ((ay)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12636062220288L, 94146);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new av();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((av)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localam.lRe = ((av)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12636062220288L, 94146);
      return 0;
    }
    GMTrace.o(12636062220288L, 94146);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */