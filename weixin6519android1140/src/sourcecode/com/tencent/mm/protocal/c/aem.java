package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aem
  extends azh
{
  public int tSt;
  public String uuj;
  public String uuk;
  public LinkedList<String> uul;
  
  public aem()
  {
    GMTrace.i(14997757362176L, 111742);
    this.uul = new LinkedList();
    GMTrace.o(14997757362176L, 111742);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14997891579904L, 111743);
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
      if (this.uuj != null) {
        paramVarArgs.e(2, this.uuj);
      }
      paramVarArgs.fk(3, this.tSt);
      if (this.uuk != null) {
        paramVarArgs.e(4, this.uuk);
      }
      paramVarArgs.d(5, 1, this.uul);
      GMTrace.o(14997891579904L, 111743);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.uuj != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uuj);
      }
      i += b.a.a.a.fh(3, this.tSt);
      paramInt = i;
      if (this.uuk != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uuk);
      }
      i = b.a.a.a.c(5, 1, this.uul);
      GMTrace.o(14997891579904L, 111743);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uul.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(14997891579904L, 111743);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aem localaem = (aem)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(14997891579904L, 111743);
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
          localaem.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14997891579904L, 111743);
        return 0;
      case 2: 
        localaem.uuj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14997891579904L, 111743);
        return 0;
      case 3: 
        localaem.tSt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14997891579904L, 111743);
        return 0;
      case 4: 
        localaem.uuk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14997891579904L, 111743);
        return 0;
      }
      localaem.uul.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(14997891579904L, 111743);
      return 0;
    }
    GMTrace.o(14997891579904L, 111743);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */