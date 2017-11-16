package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arn
  extends azh
{
  public int jzH;
  public String jzI;
  public String tUm;
  public atz tUn;
  public arq tUo;
  public String uHF;
  public String uHJ;
  
  public arn()
  {
    GMTrace.i(19142400802816L, 142622);
    GMTrace.o(19142400802816L, 142622);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19142535020544L, 142623);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(3, this.jzI);
      }
      if (this.uHF != null) {
        paramVarArgs.e(4, this.uHF);
      }
      if (this.tUm != null) {
        paramVarArgs.e(5, this.tUm);
      }
      if (this.uHJ != null) {
        paramVarArgs.e(6, this.uHJ);
      }
      if (this.tUn != null)
      {
        paramVarArgs.fm(7, this.tUn.aYq());
        this.tUn.a(paramVarArgs);
      }
      if (this.tUo != null)
      {
        paramVarArgs.fm(8, this.tUo.aYq());
        this.tUo.a(paramVarArgs);
      }
      GMTrace.o(19142535020544L, 142623);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jzI);
      }
      i = paramInt;
      if (this.uHF != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uHF);
      }
      paramInt = i;
      if (this.tUm != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tUm);
      }
      i = paramInt;
      if (this.uHJ != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uHJ);
      }
      paramInt = i;
      if (this.tUn != null) {
        paramInt = i + b.a.a.a.fj(7, this.tUn.aYq());
      }
      i = paramInt;
      if (this.tUo != null) {
        i = paramInt + b.a.a.a.fj(8, this.tUo.aYq());
      }
      GMTrace.o(19142535020544L, 142623);
      return i;
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
      GMTrace.o(19142535020544L, 142623);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arn localarn = (arn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(19142535020544L, 142623);
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
          localarn.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19142535020544L, 142623);
        return 0;
      case 2: 
        localarn.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19142535020544L, 142623);
        return 0;
      case 3: 
        localarn.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142535020544L, 142623);
        return 0;
      case 4: 
        localarn.uHF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142535020544L, 142623);
        return 0;
      case 5: 
        localarn.tUm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142535020544L, 142623);
        return 0;
      case 6: 
        localarn.uHJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142535020544L, 142623);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((atz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localarn.tUn = ((atz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19142535020544L, 142623);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new arq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((arq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localarn.tUo = ((arq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(19142535020544L, 142623);
      return 0;
    }
    GMTrace.o(19142535020544L, 142623);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\arn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */