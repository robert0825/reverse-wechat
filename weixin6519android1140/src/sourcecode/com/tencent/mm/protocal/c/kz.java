package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kz
  extends ayx
{
  public String eJQ;
  public String omK;
  public String omN;
  public long onQ;
  public String ubC;
  public String ubn;
  
  public kz()
  {
    GMTrace.i(20866830172160L, 155470);
    GMTrace.o(20866830172160L, 155470);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20866964389888L, 155471);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eJQ == null) {
        throw new b("Not all required fields were included: req_key");
      }
      if (this.ubC == null) {
        throw new b("Not all required fields were included: transfer_id");
      }
      if (this.omN == null) {
        throw new b("Not all required fields were included: transaction_id");
      }
      if (this.omK == null) {
        throw new b("Not all required fields were included: receiver_openid");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eJQ != null) {
        paramVarArgs.e(2, this.eJQ);
      }
      if (this.ubC != null) {
        paramVarArgs.e(3, this.ubC);
      }
      if (this.omN != null) {
        paramVarArgs.e(4, this.omN);
      }
      if (this.omK != null) {
        paramVarArgs.e(5, this.omK);
      }
      paramVarArgs.T(6, this.onQ);
      if (this.ubn != null) {
        paramVarArgs.e(7, this.ubn);
      }
      GMTrace.o(20866964389888L, 155471);
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
      if (this.eJQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eJQ);
      }
      i = paramInt;
      if (this.ubC != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ubC);
      }
      paramInt = i;
      if (this.omN != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.omN);
      }
      i = paramInt;
      if (this.omK != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.omK);
      }
      i += b.a.a.a.S(6, this.onQ);
      paramInt = i;
      if (this.ubn != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ubn);
      }
      GMTrace.o(20866964389888L, 155471);
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
      if (this.eJQ == null) {
        throw new b("Not all required fields were included: req_key");
      }
      if (this.ubC == null) {
        throw new b("Not all required fields were included: transfer_id");
      }
      if (this.omN == null) {
        throw new b("Not all required fields were included: transaction_id");
      }
      if (this.omK == null) {
        throw new b("Not all required fields were included: receiver_openid");
      }
      GMTrace.o(20866964389888L, 155471);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kz localkz = (kz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20866964389888L, 155471);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localkz.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20866964389888L, 155471);
        return 0;
      case 2: 
        localkz.eJQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20866964389888L, 155471);
        return 0;
      case 3: 
        localkz.ubC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20866964389888L, 155471);
        return 0;
      case 4: 
        localkz.omN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20866964389888L, 155471);
        return 0;
      case 5: 
        localkz.omK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20866964389888L, 155471);
        return 0;
      case 6: 
        localkz.onQ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(20866964389888L, 155471);
        return 0;
      }
      localkz.ubn = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20866964389888L, 155471);
      return 0;
    }
    GMTrace.o(20866964389888L, 155471);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\kz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */