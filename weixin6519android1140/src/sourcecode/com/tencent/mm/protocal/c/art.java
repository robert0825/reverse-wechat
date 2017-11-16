package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class art
  extends azh
{
  public String jWE;
  public String jWF;
  public int jWs;
  public String jWt;
  public int uHN;
  public int uHO;
  public String uHP;
  
  public art()
  {
    GMTrace.i(20860387721216L, 155422);
    GMTrace.o(20860387721216L, 155422);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20860521938944L, 155423);
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
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      paramVarArgs.fk(4, this.uHN);
      paramVarArgs.fk(5, this.uHO);
      if (this.jWE != null) {
        paramVarArgs.e(6, this.jWE);
      }
      if (this.jWF != null) {
        paramVarArgs.e(7, this.jWF);
      }
      if (this.uHP != null) {
        paramVarArgs.e(8, this.uHP);
      }
      GMTrace.o(20860521938944L, 155423);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt + b.a.a.a.fh(4, this.uHN) + b.a.a.a.fh(5, this.uHO);
      paramInt = i;
      if (this.jWE != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.jWE);
      }
      i = paramInt;
      if (this.jWF != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.jWF);
      }
      paramInt = i;
      if (this.uHP != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uHP);
      }
      GMTrace.o(20860521938944L, 155423);
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
      GMTrace.o(20860521938944L, 155423);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      art localart = (art)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20860521938944L, 155423);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localart.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20860521938944L, 155423);
        return 0;
      case 2: 
        localart.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20860521938944L, 155423);
        return 0;
      case 3: 
        localart.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20860521938944L, 155423);
        return 0;
      case 4: 
        localart.uHN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20860521938944L, 155423);
        return 0;
      case 5: 
        localart.uHO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20860521938944L, 155423);
        return 0;
      case 6: 
        localart.jWE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20860521938944L, 155423);
        return 0;
      case 7: 
        localart.jWF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20860521938944L, 155423);
        return 0;
      }
      localart.uHP = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20860521938944L, 155423);
      return 0;
    }
    GMTrace.o(20860521938944L, 155423);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\art.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */