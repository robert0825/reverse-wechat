package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class uj
  extends azh
{
  public int umI;
  public String umJ;
  public String umK;
  public int umL;
  public String umM;
  
  public uj()
  {
    GMTrace.i(4041027354624L, 30108);
    GMTrace.o(4041027354624L, 30108);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4041161572352L, 30109);
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
      paramVarArgs.fk(2, this.umI);
      if (this.umJ != null) {
        paramVarArgs.e(3, this.umJ);
      }
      if (this.umK != null) {
        paramVarArgs.e(4, this.umK);
      }
      paramVarArgs.fk(5, this.umL);
      if (this.umM != null) {
        paramVarArgs.e(6, this.umM);
      }
      GMTrace.o(4041161572352L, 30109);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.umI);
      paramInt = i;
      if (this.umJ != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.umJ);
      }
      i = paramInt;
      if (this.umK != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.umK);
      }
      i += b.a.a.a.fh(5, this.umL);
      paramInt = i;
      if (this.umM != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.umM);
      }
      GMTrace.o(4041161572352L, 30109);
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
      GMTrace.o(4041161572352L, 30109);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      uj localuj = (uj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4041161572352L, 30109);
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
          localuj.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4041161572352L, 30109);
        return 0;
      case 2: 
        localuj.umI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4041161572352L, 30109);
        return 0;
      case 3: 
        localuj.umJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041161572352L, 30109);
        return 0;
      case 4: 
        localuj.umK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041161572352L, 30109);
        return 0;
      case 5: 
        localuj.umL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4041161572352L, 30109);
        return 0;
      }
      localuj.umM = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4041161572352L, 30109);
      return 0;
    }
    GMTrace.o(4041161572352L, 30109);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\uj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */