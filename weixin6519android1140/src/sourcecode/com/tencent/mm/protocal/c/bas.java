package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bas
  extends azh
{
  public String tTZ;
  public aos tUa;
  public agx tUt;
  public agy tUu;
  public int uOo;
  public cb uOp;
  
  public bas()
  {
    GMTrace.i(3897414385664L, 29038);
    GMTrace.o(3897414385664L, 29038);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3897548603392L, 29039);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tUa == null) {
        throw new b("Not all required fields were included: Contact");
      }
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.tUu == null) {
        throw new b("Not all required fields were included: HardDeviceAttr");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tUa != null)
      {
        paramVarArgs.fm(2, this.tUa.aYq());
        this.tUa.a(paramVarArgs);
      }
      if (this.tUt != null)
      {
        paramVarArgs.fm(3, this.tUt.aYq());
        this.tUt.a(paramVarArgs);
      }
      if (this.tUu != null)
      {
        paramVarArgs.fm(4, this.tUu.aYq());
        this.tUu.a(paramVarArgs);
      }
      if (this.tTZ != null) {
        paramVarArgs.e(5, this.tTZ);
      }
      paramVarArgs.fk(6, this.uOo);
      if (this.uOp != null)
      {
        paramVarArgs.fm(7, this.uOp.aYq());
        this.uOp.a(paramVarArgs);
      }
      GMTrace.o(3897548603392L, 29039);
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
      if (this.tUa != null) {
        paramInt = i + b.a.a.a.fj(2, this.tUa.aYq());
      }
      i = paramInt;
      if (this.tUt != null) {
        i = paramInt + b.a.a.a.fj(3, this.tUt.aYq());
      }
      paramInt = i;
      if (this.tUu != null) {
        paramInt = i + b.a.a.a.fj(4, this.tUu.aYq());
      }
      i = paramInt;
      if (this.tTZ != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tTZ);
      }
      i += b.a.a.a.fh(6, this.uOo);
      paramInt = i;
      if (this.uOp != null) {
        paramInt = i + b.a.a.a.fj(7, this.uOp.aYq());
      }
      GMTrace.o(3897548603392L, 29039);
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
      if (this.tUa == null) {
        throw new b("Not all required fields were included: Contact");
      }
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.tUu == null) {
        throw new b("Not all required fields were included: HardDeviceAttr");
      }
      GMTrace.o(3897548603392L, 29039);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bas localbas = (bas)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3897548603392L, 29039);
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
          localbas.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3897548603392L, 29039);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aos();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aos)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbas.tUa = ((aos)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3897548603392L, 29039);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbas.tUt = ((agx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3897548603392L, 29039);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbas.tUu = ((agy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3897548603392L, 29039);
        return 0;
      case 5: 
        localbas.tTZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3897548603392L, 29039);
        return 0;
      case 6: 
        localbas.uOo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3897548603392L, 29039);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbas.uOp = ((cb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3897548603392L, 29039);
      return 0;
    }
    GMTrace.o(3897548603392L, 29039);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */