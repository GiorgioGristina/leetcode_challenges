
class Solution(object):
    def numUniqueEmails(self, emails):
        """
        :type emails: List[str]
        :rtype: int
        """
        final_emails = []
        for e in emails:
            local_name = e.split("@")[0]
            domain = e.split("@")[1]
            new_local_name = None
            if '+' in local_name:
                local_name = local_name.split("+")[0]
            if '.' in local_name:
                local_name = local_name.replace(".", "")
            new_email = local_name + "@" + domain
            if new_email not in final_emails:
               final_emails.append(new_email) 
        return len(final_emails)


# Example 1:

# Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
# Output: 2
# Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
# Example 2:

# Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
# Output: 3
 
new_class = Solution()

print(new_class.numUniqueEmails(["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]))

print(new_class.numUniqueEmails(["a@leetcode.com","b@leetcode.com","c@leetcode.com"]))
